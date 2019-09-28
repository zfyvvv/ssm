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
	//简单参数传递&对象传递
/*	@RequestMapping("demo")
	public String demo(People peo,String name,int age) {
		System.out.println("demo controller");
		System.out.println(name+"->"+age);
		System.out.println(peo);
		return "main.jsp";
	}
	//使用注解别名
	@RequestMapping("demo2")
	public String demo2(@RequestParam("name")String name1,@RequestParam("age")int age1) {
		System.out.println("demo controller");
		System.out.println(name1+"->"+age1);
		return "main.jsp";
	}
	//使用注解默认值，如果有传值，就使用传值，没有就使用默认值；
	@RequestMapping("demo3")
	public String demo3(@RequestParam(defaultValue="刘婷")String name,@RequestParam(defaultValue="20")int age) {
		System.out.println("demo controller");
		System.out.println(name+"->"+age);
		return "main.jsp";
	}
	//注解，必须传参
	@RequestMapping("demo4")
	public String demo4(@RequestParam(required=true)String name,int age) {
		System.out.println("demo controller");
		System.out.println(name+"->"+age);
		return "main.jsp";
	}
	//传递复选框多参数
	@RequestMapping("demo5")
	public String demo5(@RequestParam("hover")List<String> list) {
		System.out.println("demo controller");
		System.out.println(list.toString());
		return "main.jsp";
	}
	//传递对象.属性参数
		@RequestMapping("demo6")
		public String demo6(Demo demo) {
			System.out.println("demo controller");
			System.out.println(demo);
			return "main.jsp";
	}

	//传递对象[0].属性参数
	@RequestMapping("demo7")
	public String demo7(Demo2 demo) {
		System.out.println("demo controller");
		System.out.println(demo);
		return "main.jsp";
	}
	//普通get()和restful对比
	@RequestMapping("demo8")
	public String demo8(String name,int age) {
		System.out.println("demo controller");
		System.out.println(name+"->"+age);
		return "main.jsp";
	}
	@RequestMapping("demo9/{name}/{age1}")
	public String demo9(@PathVariable String name,@PathVariable("age1")int age) {
		System.out.println("demo controller");
		System.out.println(name+"->"+age);
		return "/main.jsp";
	}*/
	
	
	
}
