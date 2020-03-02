package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Student;
import dao.BaseDao;

public class BackDao extends BaseDao{
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;

	public List<Student> all() {
		List<Student> list = new ArrayList<Student>();
		try {
			conn=getConnection();
		String sql="select * from stuent ";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				list.add(new Student(rs.getString(1)));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll(conn,pst,rs);
		}
		
		
		return list;
		
	}

	

}
