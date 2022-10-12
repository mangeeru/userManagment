package com.immortal.sol.user.mangt.services;

import java.util.List;
import java.util.Optional;

import com.immortal.sol.user.mangt.entity.UserInfo;

public interface UserService {
	
	public UserInfo save(UserInfo userInfo);
	
	public List<UserInfo> getAllUserInfo();
	
	public Optional<UserInfo> getUserById(Long userSeqId);

}
