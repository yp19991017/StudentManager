<%@page import="service.StudentService"%>
<%@page import="dao.StudentDao"%>
<%@page import="java.util.List"%>
<%@page import="entity.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Index" method="post">
		<table>
			<tr>
				<th>学生姓名</th>
				<th>学生地址</th>
			</tr>
			<%
				// 获得保存在作用域中的数据
				List<Student> list = (List<Student>)request.getAttribute("list");
				// 判断这个集合是否有数据
				if(list != null){
					// 将list中的数据展示到页面上
					for(Student s : list){
						%>
						<tr><%=s.getName() %></tr>
						<tr><%=s.getAddress() %></tr>
						<%
					}
				}
			%>
		</table>
		</form>
</body>
</html>