package com.tunhy.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tunhy.entity.NewEntity;
import com.tunhy.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
	
	
	
	UserEntity findOneByUserNameAndStatus(String name, int status);
}
