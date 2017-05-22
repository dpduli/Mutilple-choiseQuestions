package com.multiple.questions.service;

import org.springframework.security.access.annotation.Secured;

import com.multiple.questions.entities.Userinfosecurity;

public interface UserService {
	@Secured({"ROLE_ADMIN"})
	Userinfosecurity getDataByUserName(String username);

}
