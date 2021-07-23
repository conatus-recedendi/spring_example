package com.conatus.spring.kakao_login_api_example.security.services;

import javax.transaction.Transactional;

import com.conatus.spring.kakao_login_api_example.models.User;
import com.conatus.spring.kakao_login_api_example.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	UserRepository userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username)
		.orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));

		return UserDetailsImpl.build(user);
	}
	
}
