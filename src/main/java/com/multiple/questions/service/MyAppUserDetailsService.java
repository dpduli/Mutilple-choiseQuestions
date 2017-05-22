package com.multiple.questions.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.multiple.questions.dao.UserDAO;
import com.multiple.questions.entities.Userinfosecurity;
public class MyAppUserDetailsService implements UserDetailsService {
	@Autowired
	private UserDAO userDAO;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Userinfosecurity activeUserInfo = userDAO.getActiveUser(username);
		GrantedAuthority authority = new SimpleGrantedAuthority(activeUserInfo.getRole());
		UserDetails userDetails = (UserDetails) new User(activeUserInfo.getUsername(), activeUserInfo.getPassword(),
				Arrays.asList(authority));
		return userDetails;
	}

	// @Override
	// public UserDetails loadUserByUsername(String username) throws
	// UsernameNotFoundException {
	// Users user = userSecurityDAO.findByUserName(username);
	//
	// List<GrantedAuthority> authorities =
	// buildUserAuthority(user.getUserRole());
	//
	// return (UserDetails) buildUserForAuthentication(user, authorities);
	// }
	//
	// private Users buildUserForAuthentication(Users user,
	// List<GrantedAuthority> authorities) {
	// List<GrantedAuthority> authorities) {
	// return new Users(user.getUsername(),
	// user.getPassword(), user.isEnabled(),
	// true, true, true, authorities);
	// }
	//
	// private List<GrantedAuthority> buildUserAuthority(Set<UserRoles>
	// userRoles) {
	//
	// Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
	//
	// // Build user's authorities
	// for (UserRoles userRole : userRoles) {
	// setAuths.add(new SimpleGrantedAuthority(userRole.getRole()));
	// }
	//
	// List<GrantedAuthority> Result = new
	// ArrayList<GrantedAuthority>(setAuths);
	//
	// return Result;
	// }

}