package com.zfy.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zfy.pojo.People;
import com.zfy.service.PeopleService;

@Controller
public class PeopleController {
	@Resource
	private PeopleService peopleServiceImpl;
	
	@RequestMapping("addpeople")
	public String addPeople(People people) {
		System.out.println("addPeople");
		peopleServiceImpl.addPeo(people);
		
		return "home";
	}
	@RequestMapping("delpeople")
	public String delPeople(People people) {
		System.out.println("delPeople");
		peopleServiceImpl.removePeo(people);
		
		return "home";
	}
	@RequestMapping("updpeople")
	public String updPeople(People people) {
		System.out.println("updPeople");
		peopleServiceImpl.updPeo(people);
		return "home";
	}
	@RequestMapping("showpeople")
	public String showPeople(Model model) {
		System.out.println("showPeople");
		List<People> list = peopleServiceImpl.showPeo();
		System.out.println(list.size());
		model.addAttribute("list", list);
		return "show.jsp";
	}
	@RequestMapping("home")
	public String updPeople() {
		return "home.jsp";
	}

}
