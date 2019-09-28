package cn.zfy.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.zfy.pojo.People;
import cn.zfy.service.PeopleService;

@Controller
public class PeopleController {
	@Resource
	private PeopleService peopleServiceImpl;
	
	@RequestMapping("addPeople")
	public String addPeople(People people) {
		peopleServiceImpl.addPeo(people);
		
		return "show";
	}
	@RequestMapping("delPeople")
	public String delPeople(People people) {
		peopleServiceImpl.removePeo(people);
		
		return "show";
	}
	@RequestMapping("updPeople")
	public String updPeople(People people) {
		peopleServiceImpl.updPeo(people);
		return "show";
	}
	@RequestMapping("showPeople")
	public String showPeople(Model model) {
		List<People> list = peopleServiceImpl.showPeo();
		model.addAttribute("list", list);
		return "show.jsp";
	}

}
