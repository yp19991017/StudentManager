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
		// 将整个集合保存到作用域中
		req.setAttribute("list", list);
		// 实现页面的跳转,因为这里的操作是查询，我们就使用转发
		req.getRequestDispatcher("NewFile.jsp").forward(req, resp);
	}

}
