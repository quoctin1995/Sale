package com.tma.repository.postgresql;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tma.entity.postgresql.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	Role findByroleNameContaining(String r);
}