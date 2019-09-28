package zfy.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;



public class DemoInterceptor implements HandlerInterceptor{
	//������ǰִ�У��������ֵΪfalse����ֹ���п�����
	//���ƴ��� ��¼��֤
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) 
			throws Exception {
		//һ�������أ������������Ҫ��ת�ĵط���
		//arg1.sendRedirect(s);
		//System.out.println(arg2);
		
		String url = arg0.getRequestURI();
//		System.out.println(url);
		if(url.equals("/springmvc04/login")) {
			return true;
		}else {
			//�ж���ͽ��������
			Object user = arg0.getSession().getAttribute("user");
			if(user!=null) {
				return true;
			}
				arg1.sendRedirect("/springmvc04/index.jsp");
				return false;
				}
			
	}
	//������ִ����ɣ�����jsp�ļ�ǰִ�У�
	//��־��¼�����д������
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, 
			Object arg2, ModelAndView arg3)
			throws Exception {
		//String word=arg3.getModel().get("model").toString();
		//String newWord = word.replace("���", "**");
		//springmvc�п��Ը��ģ�����Struts�в��ܸ��ģ�
		//arg3.getModel().put("model", newWord);
	}
	//jsp�ļ���ɺ�ִ��
	//��¼ִ�й����г��ֵ��쳣�����԰��쳣��¼����¼��
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, 
			Object arg2, Exception arg3)
			throws Exception {
		//System.out.println(arg3.getMessage());
	}
}
