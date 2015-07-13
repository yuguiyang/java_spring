package org.ygy.spring.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public ModelAndView queryJson() {
		
		Map<String , Object> data = new HashMap<String, Object>();
		data.put("msg" , "ok");
		data.put("date", new Date());
		
		List<String> strs = new ArrayList<String>();
		strs.add("aa");
		strs.add("bb");
		data.put("strs", strs);
		
		ModelAndView result = new ModelAndView();
		result.addAllObjects(data);
		
		return result;
	}
}
