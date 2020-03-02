package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Student;

public class StudentDao extends BaseDao{
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	public List<Student> findAll() {
		List<Student> list = new ArrayList<Student>();
		try {
			// 获得连接对象
			conn = BaseDao.getConnection();
			// 创建要执行的SQL命令
			String sql = "select * from student";
			// 实例化执行对象
			pst = conn.prepareStatement(sql);
			// 因为没有参数，所以可以直接调用方法
			rs = pst.executeQuery();
			// 获得结果集中的数据，并将它保存到集合中
			while (rs.next()) {
				// 因为表中的每一行代表一个实体对象，所以先创建一个对象来保存每一行数据
				Student stu = new Student();// 这个对象是一个空对象
				stu.getName();
				stu.getAddress();
				// 将这个集合保存到集合中
				list.add(stu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeAll(rs, pst, conn);
		}
		return list;
	}
}
