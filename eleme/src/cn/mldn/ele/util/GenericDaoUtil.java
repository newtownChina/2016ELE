package cn.mldn.ele.util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class GenericDaoUtil<T>{
	private Connection conn;
	private PreparedStatement pstm;
	private ResultSet rs;
	private GenericVoListUtil<T> genericVoListUtil;
	public GenericDaoUtil(String voClassName) {
		this.genericVoListUtil = new GenericVoListUtil<T>(voClassName);
	}
	public int insert(String sql,Object... params) {
		conn = MysqlC3P0Util.getConn();
		try {
			pstm = conn.prepareStatement(sql);
			int length = params.length;
			for (int i = 0; i < length ; i++) {
				pstm.setObject(i+1, params[i]);
			}
			return pstm.executeUpdate();//注意这里不要有sql参数
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			MysqlC3P0Util.closeConn(null, pstm, conn);
		}
		return 0;
	}
	public int delete(String sql, Object... params) {
		conn = MysqlC3P0Util.getConn();
		try {
			pstm = conn.prepareStatement(sql);
			int length = params.length;
			for (int i = 0; i < length ; i++) {
				pstm.setObject(i+1, params[i]);
			}
			return pstm.executeUpdate();//注意这里不要有sql参数
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			MysqlC3P0Util.closeConn(null, pstm, conn);
		}
		return 0;
	}
	public int update(String sql, Object... params) {
		conn = MysqlC3P0Util.getConn();
		try {
			pstm = conn.prepareStatement(sql);
			for (int i = 0,length = params.length; i < length ; i++) {
				pstm.setObject(i+1, params[i]);
			}
			return pstm.executeUpdate();//注意这里不要有sql参数
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			MysqlC3P0Util.closeConn(null, pstm, conn);
		}
		return 0;
	}
	public List<T> select(String sql, Object... params) {
		conn = MysqlC3P0Util.getConn();
		List<T> list = new ArrayList<T>();//初始化一个空的列表，不要用null初始化否则，后面使用它的可能报错
		try {
			pstm = conn.prepareStatement(sql);
			int length = params.length;
			for (int i = 0; i < length ; i++) {
				pstm.setObject(i+1, params[i]);
			}
			rs = pstm.executeQuery();//注意这里不要有sql参数
			list = genericVoListUtil.toList(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			MysqlC3P0Util.closeConn(rs,pstm,conn);
		}
		return list;
	}
}
