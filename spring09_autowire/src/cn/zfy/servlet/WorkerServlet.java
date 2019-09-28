package cn.zfy.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.zfy.pojo.User;
import cn.zfy.service.UserService;
import cn.zfy.service.impl.UserServiceImpl;
@WebServlet("/login")
public class WorkerServlet extends HttpServlet{
	private UserService userServiceImpl;
	
	@Override
	public void init() throws ServletException {
		WebApplicationContext ac = WebApplicationContextUtils
									.getRequiredWebApplicationContext(getServletContext());
		userServiceImpl=ac.getBean("userService", UserServiceImpl.class);
		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		User user1=new User();
		user1.setName(req.getParameter("username"));
		user1.setPassword(req.getParameter("password"));
		System.out.println(user1.toString());
		User user2=userServiceImpl.Login(user1);
		System.out.println(user2.toString());
		System.out.println("msg-->"+req.getParameter("msg"));
		if(user2!=null) {
			resp.sendRedirect("main.jsp");
		}else {
			resp.sendRedirect("login.jsp");
		}
	}
}
