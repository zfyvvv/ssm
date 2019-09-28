package cn.zfy.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import cn.zfy.pojo.People;
import cn.zfy.service.PeopleService;
import cn.zfy.service.impl.PeopleServiceImpl;
@WebServlet("/insert")
public class PeopleServlet extends HttpServlet{
	PeopleService ps=new PeopleServiceImpl();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		People people=new People();
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		people.setId(Integer.parseInt(req.getParameter("id")));
		people.setName(req.getParameter("name"));
		people.setAge(Integer.parseInt(req.getParameter("age")));
		people.setWork(req.getParameter("work"));
		int index=ps.insPeo(people);
		if(index>0) {
			resp.sendRedirect("success.jsp");
		}else {
			resp.sendRedirect("error.jsp");
		}
	}
}
