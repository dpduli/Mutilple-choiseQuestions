package com.multiple.questions.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.multiple.questions.dao.UserInfoDAO;
import com.multiple.questions.entities.Userinfo;

@Repository("userInfoDAO")
public class UserInfoDAOImpl implements UserInfoDAO {
	
	static final Logger logger = Logger.getLogger(UserInfoDAOImpl.class);

	@Override
	public List<Userinfo> listAll() {
		
		return null;	
	}

}
