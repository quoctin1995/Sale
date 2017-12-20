package com.tma.repository.postgresql;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tma.entity.postgresql.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByusernameContaining(String s);
}
