package com.tma.security;

import java.util.Date;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.tma.entity.postgresql.Role;
import com.tma.entity.postgresql.User;
import com.tma.service.postgresql.RoleService;
import com.tma.service.postgresql.UserService;

@Component
public class DataSeedingListener implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		// Roles
		if (roleService.findByName("ROLE_ADMIN") == null) {
			roleService.saveRole(new Role(1, "ROLE_ADMIN", new Date()));
		}

		if (roleService.findByName("ROLE_MEMBER") == null) {
			roleService.saveRole(new Role(2, "ROLE_MEMBER", new Date()));
		}

		// Admin account
		if (userService.findByUserName("admin") == null) {
			User admin = new User();
			admin.setUserId(1);
			admin.setName("admin");
			admin.setUsername("admin");
			admin.setPassword(passwordEncoder.encode("123456"));
			HashSet<Role> roles = new HashSet<>();
			roles.add(roleService.findByName("ROLE_ADMIN"));
			roles.add(roleService.findByName("ROLE_MEMBER"));
			admin.setRoles(roles);
			userService.saveUser(admin);
		}

		// Member account
		if (userService.findByUserName("member") == null) {
			User user = new User();
			user.setUserId(2);
			user.setName("member");
			user.setUsername("member");
			user.setPassword(passwordEncoder.encode("123456"));
			HashSet<Role> roles = new HashSet<>();
			roles.add(roleService.findByName("ROLE_MEMBER"));
			user.setRoles(roles);
			userService.saveUser(user);
		}
	}

}
