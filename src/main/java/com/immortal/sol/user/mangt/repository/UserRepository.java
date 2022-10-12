package com.immortal.sol.user.mangt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.immortal.sol.user.mangt.entity.UserInfo;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Long>{

}
