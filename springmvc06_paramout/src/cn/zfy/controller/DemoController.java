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
	//�Ĵ�������ֵ
	/*@RequestMapping(value="demo17")
	public String demo17(HttpServletRequest req,HttpSession sessionparam){
		//request��������
		req.setAttribute("req", "req���ݵ�ֵ");
		//session��������
		HttpSession session = req.getSession();
		session.setAttribute("session", "session���ݵ�ֵ");
		//sessionͨ��springmvcע���ȡ����Ч��session
		sessionparam.setAttribute("sessionparam", "sessionparam���ݵ�ֵ");
		//����ֱ�ӻ�ȡ����ͨ��request����
		ServletContext application = req.getServletContext();
		application.setAttribute("application", "application���ݵ�ֵ");
		return "/index.jsp";
	}
	//map��ֵ
	@RequestMapping(value="demo18")
	public String demo18(Map<String, Object> map){
		map.put("map", "map���ݵ�ֵ");
		return "/index.jsp";
	}
	//model��ֵ
	@RequestMapping(value="demo19")
	public String demo19(Model model){
		model.addAttribute("model", "model���ݵ�ֵ");
		return "/index.jsp";
	}
	//mav��ֵ
	@RequestMapping(value="demo20")
	public ModelAndView demo20(){
		ModelAndView mav=new ModelAndView("/index.jsp");
		mav.addObject("mav", "mav���ݵ�ֵ");
		return mav;
	}*/
	
}
