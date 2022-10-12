package com.immortal.sol.user.mangt.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.immortal.sol.user.mangt.entity.UserInfo;
import com.immortal.sol.user.mangt.exception.ResourceNotFoundException;
import com.immortal.sol.user.mangt.services.UserService;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
	
	private final Logger _logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/publish")
	public void publish(@RequestParam("msg") String msg) {
		_logger.info("We are publishing message:"+msg);
	}
	
	@PostMapping("/add")
	public ResponseEntity<UserInfo> addUser(@RequestBody UserInfo userInfo) {
		final UserInfo user_Info = userService.save(userInfo);
		return ResponseEntity.ok(user_Info);
	}
	
	@GetMapping("/fetch/all")
	public List<UserInfo> fetchAllUsers(){
		return userService.getAllUserInfo();
	}
	
	@GetMapping("fetch/{userSeqId}")
	public ResponseEntity<UserInfo> fetchUser(@PathVariable(value = "userSeqId") Long userSeqId) throws ResourceNotFoundException{
		Optional<UserInfo> userInfo = userService.getUserById(userSeqId);
		if(userInfo.isEmpty()) {
			throw new ResourceNotFoundException("User Not Found for :"+userSeqId);
		}
		return ResponseEntity.ok(userInfo.get());
	}

}
