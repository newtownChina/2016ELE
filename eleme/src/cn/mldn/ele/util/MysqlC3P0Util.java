package cn.mldn.ele.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class MysqlC3P0Util {
	private static ComboPooledDataSource dataSource;
	private static final String DBDRIVER = "org.gjt.mm.mysql.Driver" ;
	private static final String DBURL = "jdbc:mysql://localhost:3306/eleme" ;
	private static final String USER = "root" ;
	private static final String PASSWORD = "mysql123" ;
	private static Connection conn;
	static{
		try {
			dataSource = new ComboPooledDataSource();
			dataSource.setDriverClass(DBDRIVER);
			dataSource.setJdbcUrl(DBURL);
			dataSource.setUser(USER);
			dataSource.setPassword(PASSWORD);
			dataSource.setMinPoolSize(5);
			dataSource.setInitialPoolSize(10);//不能小于等于minpoolsize
			dataSource.setMaxPoolSize(20);
			dataSource.setAcquireIncrement(2);
			dataSource.setMaxIdleTime(200);
			dataSource.setAutoCommitOnClose(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*从数据库连接池获取一个连接*/
	public static Connection getConn() {
		try {
			conn= dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("获取数据库链接出错");
		}
		return conn;
	}
	/*关闭当前的数据库连接池连接*/
	public static void closeConn(ResultSet rs,Statement statement,Connection conn) {
		try {
			if (rs != null) {rs.close();}
			if (statement != null) {statement.close();}
			if (conn != null) {conn.close();}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("数据库链接释放出错");
		}
	}
//	@Test
//	public void test(){
//		System.out.println(getConn());
//	}
}
