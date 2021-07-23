package com.conatus.spring.kakao_login_api_example.repository;

import java.util.Optional;

import com.conatus.spring.kakao_login_api_example.models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);
	
	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
}
