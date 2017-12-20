package com.tma.service.postgresql;

import com.tma.entity.postgresql.User;

public interface UserService {
	void saveUser(User user);

	User findByUserName(String userName);
}
