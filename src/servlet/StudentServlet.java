package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Student;
import service.StudentService;
@WebServlet("/Index")
public class StudentServlet extends HttpServlet {
	private StudentService  ss = new StudentService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Student> list = ss.getAll();
		// ���������ϱ��浽��������
		req.setAttribute("list", list);
		// ʵ��ҳ�����ת,��Ϊ����Ĳ����ǲ�ѯ�����Ǿ�ʹ��ת��
		req.getRequestDispatcher("NewFile.jsp").forward(req, resp);
	}

}
