package cn.zfy.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 1.前端控制器原理；
 * 2.
 * @author DELL
 *
 */
@WebServlet("/")
public class DispatcherServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("handler controling!!!");
		String str=req.getParameter("control");
		System.out.println(str);
		//dispatchservlet功能实现过程；分发器；
		//HandlerMapping，解析请求格式；
		if("demo1".equals(str)) {
			//HandlerAdapeter功能，执行具体方法；
			//还可以进行传参；
				demo1(req,resp);
		}
		if("demo2".equals(str)) {
			demo2();
		}
		if("demo3".equals(str)) {
			demo3();
		}
		if("demo4".equals(str)) {
			demo4();
		}
	}
	
	public void demo1(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("this is the demo1");
		//视图解析器，ViewResovler
		//请求转发；
		//req.getRequestDispatcher("path").forward(req, resp);
		//重定向；
		//resp.sendRedirect("pathway");
	}
	public void demo2() {
		System.out.println("this is the demo2");
	}
	public void demo3() {
		System.out.println("this is the demo3");
	}
	public void demo4() {
		System.out.println("this is the demo4");
	}
	
}
