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
 * Ϊʲô��OpenSessionInView��
 * �ʼ����spring�������ģ�������Hibernate���ʱʹ�õ���OpenSessionInView
 * view ��ͼ����spring�����������ݣ�
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
