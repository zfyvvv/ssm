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

	
	//��ת��ʽ-ת����Ĭ�Ϸ�ʽΪת����
	@RequestMapping("demo10")
	public String demo10() {
		System.out.println("demo controller");
		System.out.println("ת��");
		return "/main.jsp";
	}
	//��ת��ʽ-�ض���
	@RequestMapping("demo11")
	public String demo11() {
		System.out.println("demo controller");
		System.out.println("�ض���");
		return "redirect:/main.jsp";
	}
	//��ͼ������-����ǰ��׺
	@RequestMapping("demo12")
	public String demo12() {
		return "redirect:demo13";
	}
	//��ͼ������-��ǰ��׺
	@RequestMapping("demo13")
	public String demo13() {
		return "main";
	}
	
	/*//û�з���ֵ������ת
	@RequestMapping("demo14")
	public void demo14(HttpServletResponse resp) throws IOException {
		resp.getWriter().write("aaaaa");
	}*/
	
	//��JSon�ĸ�ʽ��ͻ����������
	/*@RequestMapping("demo15")
	@ResponseBody
	public People demo15(){
		People p=new People();
		p.setId(1);
		p.setName("����");
		p.setAge(20);
		return p;
	}*/
	/*//��������������
	@RequestMapping(value="demo16",produces="text/html;charset=utf-8")
	@ResponseBody
	public String demo16(){
		return "haha����";
	}*/
	
	
	
}
