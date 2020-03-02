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
			// ������Ӷ���
			conn = BaseDao.getConnection();
			// ����Ҫִ�е�SQL����
			String sql = "select * from student";
			// ʵ����ִ�ж���
			pst = conn.prepareStatement(sql);
			// ��Ϊû�в��������Կ���ֱ�ӵ��÷���
			rs = pst.executeQuery();
			// ��ý�����е����ݣ����������浽������
			while (rs.next()) {
				// ��Ϊ���е�ÿһ�д���һ��ʵ����������ȴ���һ������������ÿһ������
				Student stu = new Student();// ���������һ���ն���
				stu.getName();
				stu.getAddress();
				// ��������ϱ��浽������
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
