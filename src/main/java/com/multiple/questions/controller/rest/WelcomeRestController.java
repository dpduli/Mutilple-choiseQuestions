package com.multiple.questions.controller.rest;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.multiple.questions.entities.Userinfo;
import com.multiple.questions.service.UserInfoService;

@RestController
public class WelcomeRestController {
	@Autowired
	private UserInfoService userInfoService;

	@RequestMapping(value = "list", method = RequestMethod.GET, headers = "Accept=text/plain")
	public String hehe() {
		return "Welcome to Spring Rest";
	}

	@RequestMapping(value = "userinfo", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Userinfo> listAllUser() {
		List<Userinfo> listAllUser = userInfoService.listAllUser();
		return listAllUser;
	}

}
