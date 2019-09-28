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

import cn.zfy.pojo.Worker;
import cn.zfy.service.WorkerService;
import cn.zfy.service.impl.WorkerServiceImpl;
@WebServlet("/worker")
public class WorkerServlet extends HttpServlet{
	//全局变量，需通过init()方法对属性进行实例化
	private WorkerService wokerServiceImpl;
	
	/*@Override
	public void init() throws ServletException {
		//对service进行实例化
		//由于spring框架未整合servlet，servlet依然由Tomcat进行管理，故不可行；
		ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
		wokerServiceImpl= ac.getBean("workerService", WorkerServiceImpl.class);
		
		//由spring和web整合后所有的信息都存放在webApplicationContext中,并提供对外方法
		//WebApplicationContext是ApplicationContext的子容器
		ApplicationContext ac =WebApplicationContextUtils
		.getRequiredWebApplicationContext(getServletContext());
		wokerServiceImpl= ac.getBean("workerService", WorkerServiceImpl.class);
	}*/
	
	@Override
	public void init() throws ServletException {
		ServletContext servletContext = getServletContext();
		System.out.println("1");
		System.out.println(servletContext);
		System.out.println("2");
		WebApplicationContext ac = WebApplicationContextUtils
									.getRequiredWebApplicationContext(servletContext);
		System.out.println("3");
		wokerServiceImpl=ac.getBean("workerService", WorkerServiceImpl.class);
		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		List<Worker> list=wokerServiceImpl.show();
		System.out.println(list.toString());
		resp.getWriter().write("success!!");
		
	}
}
