package cn.zfy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
/**
 * 1.线程池配置，多线程；
 * @author DELL
 *
 */
@WebServlet("/pool")
public class DemoServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//加载指定文件；加载MATE-INF下的文件；
			Context cxt=new InitialContext();
			DataSource ds=(DataSource) cxt.lookup("java:comp/env/test");
			
			Connection conn=ds.getConnection();
			PreparedStatement ps=conn.prepareStatement("select * from flower");
			ResultSet rs=ps.executeQuery();
			resp.setContentType("text/html;charset=utf-8");
			PrintWriter out=resp.getWriter();
			//简单打印表格；
			while(rs.next()) {
				out.print(rs.getInt(1)+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString(2)+"<br/>");
			}
			out.flush();
			out.close();
			rs.close();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
