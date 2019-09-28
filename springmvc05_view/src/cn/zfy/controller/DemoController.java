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

	
	//跳转方式-转发；默认方式为转发；
	@RequestMapping("demo10")
	public String demo10() {
		System.out.println("demo controller");
		System.out.println("转发");
		return "/main.jsp";
	}
	//跳转方式-重定向
	@RequestMapping("demo11")
	public String demo11() {
		System.out.println("demo controller");
		System.out.println("重定向");
		return "redirect:/main.jsp";
	}
	//视图解析器-不加前后缀
	@RequestMapping("demo12")
	public String demo12() {
		return "redirect:demo13";
	}
	//视图解析器-加前后缀
	@RequestMapping("demo13")
	public String demo13() {
		return "main";
	}
	
	/*//没有返回值，不跳转
	@RequestMapping("demo14")
	public void demo14(HttpServletResponse resp) throws IOException {
		resp.getWriter().write("aaaaa");
	}*/
	
	//以JSon的格式向客户端输出内容
	/*@RequestMapping("demo15")
	@ResponseBody
	public People demo15(){
		People p=new People();
		p.setId(1);
		p.setName("刘婷");
		p.setAge(20);
		return p;
	}*/
	/*//中文乱码解决方案
	@RequestMapping(value="demo16",produces="text/html;charset=utf-8")
	@ResponseBody
	public String demo16(){
		return "haha中文";
	}*/
	
	
	
}
