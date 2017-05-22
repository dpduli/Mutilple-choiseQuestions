package com.multiple.questions.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiple.questions.dao.UserInfoDAO;
import com.multiple.questions.entities.Userinfo;
import com.multiple.questions.service.UserInfoService;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
	private final static Logger logger = Logger.getLogger(UserInfoServiceImpl.class);
	@Autowired
	private UserInfoDAO userInfoDAO;

	@Override
	public List<Userinfo> listAllUser() {
		List<Userinfo> listAllUser = new ArrayList<Userinfo>();
		try{
			listAllUser = userInfoDAO.listAllUser();
		}catch(Exception e){
			e.printStackTrace();
			logger.error(e);
		}
		return listAllUser;
	}

}
