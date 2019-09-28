package cn.zfy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class DemoController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		System.out.println("handler by democontrlller!!");
		ModelAndView mav=new ModelAndView("main");
		return mav;
	}

}
