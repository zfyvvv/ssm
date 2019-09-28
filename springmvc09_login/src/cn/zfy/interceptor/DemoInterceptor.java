package zfy.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;



public class DemoInterceptor implements HandlerInterceptor{
	//控制器前执行，如果返回值为false，阻止进行控制器
	//控制代码 登录验证
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) 
			throws Exception {
		//一旦被拦截，告诉浏览器需要跳转的地方；
		//arg1.sendRedirect(s);
		//System.out.println(arg2);
		
		String url = arg0.getRequestURI();
//		System.out.println(url);
		if(url.equals("/springmvc04/login")) {
			return true;
		}else {
			//有对象就进入控制器
			Object user = arg0.getSession().getAttribute("user");
			if(user!=null) {
				return true;
			}
				arg1.sendRedirect("/springmvc04/index.jsp");
				return false;
				}
			
	}
	//控制器执行完成，进入jsp文件前执行；
	//日志记录，敏感词语过滤
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, 
			Object arg2, ModelAndView arg3)
			throws Exception {
		//String word=arg3.getModel().get("model").toString();
		//String newWord = word.replace("祖国", "**");
		//springmvc中可以更改，但是Struts中不能更改；
		//arg3.getModel().put("model", newWord);
	}
	//jsp文件完成后执行
	//记录执行过程中出现的异常，可以把异常记录到记录中
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, 
			Object arg2, Exception arg3)
			throws Exception {
		//System.out.println(arg3.getMessage());
	}
}
