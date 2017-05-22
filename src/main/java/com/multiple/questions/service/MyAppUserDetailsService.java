package com.multiple.questions.service;

import java.util.Arrays;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.multiple.questions.entities.Userinfosecurity;

public class MyAppUserDetailsService implements UserDetailsService {
	@Autowired
	private com.multiple.questions.dao.UserDAO userDAO;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Userinfosecurity activeUserInfo = userDAO.getActiveUser(username);
		GrantedAuthority authority = new SimpleGrantedAuthority(activeUserInfo.getRole());
		UserDetails userDetails = (UserDetails) new User(activeUserInfo.getUsername(), activeUserInfo.getPassword(),
				Arrays.asList(authority));
		return userDetails;
	}
	
	

//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		Userinfosecurity user = userDAO.getActiveUser(username);
//		List<GrantedAuthority> authorities = buildUserAuthority(user.getRole());
//
//		return buildUserAuthority(user, authorities);
//	}
//
//	private List<GrantedAuthority> buildUserAuthority(String role) {
//		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
//
//		// Build user's authorities
//		for (String role : r) {
//			setAuths.add(new SimpleGrantedAuthority(userRole.getRole()));
//		}
//
//		List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);
//
//		return Result;
//	}
//
//	private UserDetails buildUserAuthority(Userinfosecurity user, List<GrantedAuthority> authorities) {
//
//		return (UserDetails) new Userinfosecurity(user.getUsername(), user.getPassword(), user.isEnabled(), true, true,
//				true, authorities);
//	}
//
//	}

	

}