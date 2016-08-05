package cn.mldn.ele.test;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.List;
import java.util.List;
import org.junit.Test;
import cn.mldn.ele.beans.CommentsBean;
import cn.mldn.ele.util.DaoUtilFactory;
import cn.mldn.ele.util.GenericDaoUtil;
import cn.mldn.ele.util.MysqlC3P0Util;
public class TestDBLink {
	@Test
	public void test(){
//		String nameString = CommentsBean.class.getName();
//		GenericDaoUtil<CommentsBean> genericDaoImpl = new GenericDaoUtil<>(nameString);
//		genericDaoImpl.delete("delete from comments where cid = ?", 1);
		
//		System.out.println(timeString);
//		System.out.println(list.get(0).getCid());
//		System.out.println(list.get(0).getComtime());
//		String sql = "delete from comments";
//		DaoUtilFactory.getCommentsDaoUtil().delete(sql);		
		String sql = "insert into comments values(1,1,'1','2016-07-17 23:10:23',1,'第一行')";
		DaoUtilFactory.getCommentsDaoUtil().insert(sql);
	}
	@Test
	public void test2() {
		PreparedStatement pstm;
		ResultSet resultSet;
		try {
			pstm = MysqlC3P0Util.getConn().prepareStatement("select * from customer where cid = ?");
			pstm.setObject(1, 1);
			resultSet = pstm.executeQuery();
			
			while(resultSet.next()){
				System.out.println(resultSet.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public Object get(List<?> l){
		return null;
		
	}
	//测试反射
	@Test
	public void test3(){
		try {
			System.out.println(Class.forName("cn.mldn.ele.vo.CustomerVo").newInstance());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
