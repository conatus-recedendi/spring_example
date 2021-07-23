package com.conatus.spring.kakao_login_api_example.repository;

import java.util.Optional;

import com.conatus.spring.kakao_login_api_example.models.ERole;
import com.conatus.spring.kakao_login_api_example.models.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);	
}
