package com.Byas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Byas.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User findByEmail(String email);

}
