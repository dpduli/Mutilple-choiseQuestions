package com.multiple.questions.controller;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.multiple.questions.entities.Userinfo;
import com.multiple.questions.service.UserInfoService;

@Controller
public class WelcomeController {
	@Autowired
	private UserInfoService userInfoService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(Model model) {
		return "welcome";
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(Model model) {
		return "test";
	}

	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(value = "one", method = RequestMethod.GET, headers = "Accept=application/json", produces = "application/json")
	public @ResponseBody Userinfo getOne() {
		Userinfo userinfo = new Userinfo();
		userinfo.setId(2);
		userinfo.setUserName("admin");
		userinfo.setPassword("admin");
		userinfo.setAddress("asdasd");
		userinfo.setPhone("098952268");
		return userinfo;
	}

	

}
