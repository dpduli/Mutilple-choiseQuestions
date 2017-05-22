package com.multiple.questions.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.multiple.questions.entities.Userinfosecurity;

public interface UserDAO {
	Userinfosecurity getActiveUser( String username);

}
