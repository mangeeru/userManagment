package com.immortal.sol.user.mangt.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.immortal.sol.user.mangt.entity.UserInfo;
import com.immortal.sol.user.mangt.repository.UserRepository;

@Service(value = "userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository repository;

	@Override
	public UserInfo save(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(userInfo);
	}

	@Override
	public List<UserInfo> getAllUserInfo() {
		
		return repository.findAll();
	}

	@Override
	public Optional<UserInfo> getUserById(Long userSeqId) {

		return repository.findById(userSeqId);
	}

}
