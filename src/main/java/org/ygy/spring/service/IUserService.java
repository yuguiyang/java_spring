package org.ygy.spring.service;

import org.ygy.spring.entity.UserEntity;

public interface IUserService {
	
	public UserEntity queryUser(String id);
}
