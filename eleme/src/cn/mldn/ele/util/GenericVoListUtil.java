package cn.mldn.ele.util;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * 通用Set到List的装换。适用所有表(一个工具类)
 * 一种javabean对应一种封装策略，并且 自动调用javabean的setter，将结果集封装进对应的javabean。
 * 针对某些特殊的字段，如javabean中存在List<T>，需要单独判断。
 * @author NXY
 *
 */
public class GenericVoListUtil<T>{
	private List<T> list;
	private T vo;
	private String voClassName;
	public GenericVoListUtil(String voClassName){
		this.voClassName = voClassName;
	}
	@SuppressWarnings("unchecked")
	public List<T> toList(ResultSet rs) {
		list = new ArrayList<T>();
		ResultSetMetaData rsmd;
		int columnCount;
		String labelName;
		String columnClassName;
		Class<?> clazz = null;//要实例化的javabean类名
		Method method;//javabean中的setter方法
		String methodName;//javabean中的setter方法名
		try {
			clazz = Class.forName(voClassName);
			while(rs.next()){
				rsmd = rs.getMetaData();
				columnCount = rsmd.getColumnCount();
				try {
					vo = (T)clazz.newInstance();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
				/*自动调用set方法*/
				for (int i = 0; i < columnCount; i++) {
					labelName = rsmd.getColumnLabel(i+1).toLowerCase();
					//获取列对应的类名（如果调用了ResultSet.getObject，讲返回全限定类名）
					columnClassName = rsmd.getColumnClassName(i+1);
					//拼接出javabean中对应当前列的setter方法名
					methodName = "set"+labelName.substring(0,1).toUpperCase()+labelName.substring(1);
					try {
						if(clazz!=null){
							method = clazz.getDeclaredMethod(methodName,Class.forName(columnClassName));
							method.invoke(vo,rs.getObject(i+1));//调用setter方法赋值
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				list.add(vo);
			}
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("从map转换成list出错");
		}
		return list;
	}
}
