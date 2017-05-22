package com.multiple.questions.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.multiple.questions.dao.UserDAO;
import com.multiple.questions.entities.Userinfosecurity;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {
	@PersistenceContext	
	private EntityManager entityManager;
	
	public Userinfosecurity getActiveUser(String username) {
		Userinfosecurity activeUserInfo = new Userinfosecurity();
		int enabled = 1;
		List<?> list = entityManager.createQuery("SELECT u FROM Userinfosecurity u WHERE username=? and enabled=?")
				.setParameter(1, username).setParameter(2, enabled).getResultList();
		if(!list.isEmpty()) {
			activeUserInfo = (Userinfosecurity)list.get(0);
		}
		return activeUserInfo;
	}

}
