package org.ygy.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.ygy.spring.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@ResponseBody
	@RequestMapping("/queryUser")
	public ModelAndView queryUser(String id) {
		
		userService.queryUser(id);
		
		
		return new ModelAndView("index" , "one" , "two");
	}
	
	
	@ResponseBody
	@RequestMapping("queryJson")
	public String queryJson() {
		return "";
	}
}
