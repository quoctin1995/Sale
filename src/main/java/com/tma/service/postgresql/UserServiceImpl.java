package com.tma.service.postgresql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.entity.postgresql.User;
import com.tma.repository.postgresql.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}

	@Override
	public User findByUserName(String userName) {
		return userRepository.findByusernameContaining(userName);
	}

}
