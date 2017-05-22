package com.multiple.questions.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.multiple.questions.entities.Userinfo;
import com.multiple.questions.service.UserInfoService;

@Component
@Path("user")
@XmlRootElement
public class WelcomeApi {
	@Autowired
	private UserInfoService userInfoService;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "Got it!";
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("info")
	public List<Userinfo> listAllUser() {
		return userInfoService.listAllUser();
	}
}
