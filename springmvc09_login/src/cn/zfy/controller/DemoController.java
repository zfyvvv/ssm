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

import cn.zfy.pojo.User;



@Controller
public class DemoController {
	//登录验证
	@RequestMapping("login")
	public String demo27(User user,HttpSession session) {
		System.out.println(user);
		if(user.getName().equals("周方杨")&&
				user.getPassword()==123) {
			session.setAttribute("user", user);
			return "main";
		}else {
			return "redirect:/index.jsp";
		}
	}
	@RequestMapping("{page}")
	public String demo28(@PathVariable String page) {
			return page;
	}
	
	
	
}
