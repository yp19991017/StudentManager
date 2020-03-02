package service;

import java.util.List;

import dao.StudentDao;
import entity.Student;;

public class StudentService {
	private StudentDao stu = new StudentDao();
	public List<Student> getAll() {
		// 调用dao中查询所有数据的方法
		List<Student> list = stu.findAll();
		// 判断这个集合中是否有数据
		if(list != null) {
			return list;
		}else {
			return null;
		}
	}
}
