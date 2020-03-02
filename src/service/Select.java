package service;

import java.util.List;

import dao.BackDao;
import entity.Student;

public class Select {
	//创建一个Dao层的对象
	BackDao d = new BackDao();
	
	public List<Student> all() {
		return d.all();
	}
}
