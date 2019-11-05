package com.gzf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gzf.service.IUserService;

@Controller
public class IndexController {

	@Autowired
	private IUserService userService;

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/query")
	public String query(Model model) {
		model.addAttribute("userBeans", userService.query());
		return "index";
	}

	@RequestMapping("/select")
	@ResponseBody
	public Object select(@RequestParam("id") long id) {
		return userService.selectUserById(id);
	}

}
