package com.multiple.questions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.multiple.questions.service.UserService;

@Controller

public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/customLogin")
	public String customLogin(ModelMap model) {

		return "customLogin";
	}

	@RequestMapping(value = "/home", method=RequestMethod.GET)
	public String home(ModelMap model, Authentication authentication) {
		authentication.getPrincipal();
		model.addAttribute("user", userService.getDataByUserName(authentication.getName()));
		return "secure/user-info";
	}

	@RequestMapping(value = "/error", method=RequestMethod.GET)
	public String error() {
		return "secure/access-denied";
	}
}
