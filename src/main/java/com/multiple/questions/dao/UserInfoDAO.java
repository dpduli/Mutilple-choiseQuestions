package com.multiple.questions.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.multiple.questions.entities.Userinfo;

@Repository("userInfoDAO")
public interface UserInfoDAO extends JpaRepository<Userinfo, Long> {
	@Query("select u from Userinfo  u")
	List<Userinfo> listAllUser();
	
	
}
