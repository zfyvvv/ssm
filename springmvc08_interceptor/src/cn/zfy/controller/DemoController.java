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
	
	//拦截器
	@RequestMapping("demo23")
	public String demo23() {
		System.out.println("demo23!");
		return "/index.jsp";
	}
	@RequestMapping("demo24")
	public String demo24() {
		System.out.println("demo24!");
		return "/index.jsp";
	}
	//敏感词语过滤
	@RequestMapping("demo25")
	public String demo25(Model model) {
		model.addAttribute("model", "我们都爱祖国！");
		return "/index.jsp";
	}
	//异常收集
	@RequestMapping("demo26")
	public String demo26() {
		int i=5/0;
		return "/index.jsp";
	}
	
}
