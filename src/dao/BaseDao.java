package dao;
/**
 * 	获得数据库连接和关闭资源的工具类
 * @author 12584
 *s
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	private static Connection conn;
	/**
	 * 	获得数据库连接的方法
	 * @return	数据库连接对象
	 */
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");//	加载驱动
			conn=DriverManager.getConnection("jdbc:mysql://localhost/students?useUnicode=true&characterEncoding=UTF-8",
					"root","root");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	/**
	 *  	释放资源的方法
	 * @param rs	结果集对象
	 * @param pst	SQL执行对象
	 * @param conn 数据库连接对象
	 */
	public static void closeAll(Connection conn,PreparedStatement pst,ResultSet rs) {
		try {
			if(rs != null){
				rs.close();
			}
			if(pst != null){
				pst.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
