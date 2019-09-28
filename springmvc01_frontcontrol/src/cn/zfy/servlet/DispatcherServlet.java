package cn.zfy.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 1.ǰ�˿�����ԭ��
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
		//dispatchservlet����ʵ�ֹ��̣��ַ�����
		//HandlerMapping�����������ʽ��
		if("demo1".equals(str)) {
			//HandlerAdapeter���ܣ�ִ�о��巽����
			//�����Խ��д��Σ�
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
		//��ͼ��������ViewResovler
		//����ת����
		//req.getRequestDispatcher("path").forward(req, resp);
		//�ض���
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
