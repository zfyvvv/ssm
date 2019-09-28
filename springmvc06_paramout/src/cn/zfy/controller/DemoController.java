package cn.zfy.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DemoController {
	//四大作用域传值
	/*@RequestMapping(value="demo17")
	public String demo17(HttpServletRequest req,HttpSession sessionparam){
		//request的作用域
		req.setAttribute("req", "req传递的值");
		//session的作用域
		HttpSession session = req.getSession();
		session.setAttribute("session", "session传递的值");
		//session通过springmvc注入获取，等效于session
		sessionparam.setAttribute("sessionparam", "sessionparam传递的值");
		//不能直接获取，需通过request对象
		ServletContext application = req.getServletContext();
		application.setAttribute("application", "application传递的值");
		return "/index.jsp";
	}
	//map传值
	@RequestMapping(value="demo18")
	public String demo18(Map<String, Object> map){
		map.put("map", "map传递的值");
		return "/index.jsp";
	}
	//model传值
	@RequestMapping(value="demo19")
	public String demo19(Model model){
		model.addAttribute("model", "model传递的值");
		return "/index.jsp";
	}
	//mav传值
	@RequestMapping(value="demo20")
	public ModelAndView demo20(){
		ModelAndView mav=new ModelAndView("/index.jsp");
		mav.addObject("mav", "mav传递的值");
		return mav;
	}*/
	
}
