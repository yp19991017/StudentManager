package service;

import java.util.List;

import dao.StudentDao;
import entity.Student;;

public class StudentService {
	private StudentDao stu = new StudentDao();
	public List<Student> getAll() {
		// ����dao�в�ѯ�������ݵķ���
		List<Student> list = stu.findAll();
		// �ж�����������Ƿ�������
		if(list != null) {
			return list;
		}else {
			return null;
		}
	}
}
