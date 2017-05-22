package com.multiple.questions.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiple.questions.dao.UserDAO;
import com.multiple.questions.entities.Userinfosecurity;
import com.multiple.questions.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	public Userinfosecurity getDataByUserName(String username) {

		return userDAO.getActiveUser(username);
	}

}
