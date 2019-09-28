package cn.zfy.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.apache.ibatis.session.SqlSession;

import cn.zfy.util.MybatisUtil;
/**
 * 为什么叫OpenSessionInView？
 * 最开始是由spring框架提出的，在整合Hibernate框架时使用的是OpenSessionInView
 * view 视图，是spring框架提出的内容；
 * 
 * @author DELL
 *
 */
@WebFilter("/*")
public class OpenSessionInView implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		SqlSession session=MybatisUtil.getSqlSession();
		try {
			chain.doFilter(request, response);
			session.commit();
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		}finally {
			MybatisUtil.closeSession();
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

}
