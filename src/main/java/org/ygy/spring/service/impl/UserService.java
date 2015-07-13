package org.ygy.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ygy.spring.dao.IUserDao;
import org.ygy.spring.entity.UserEntity;
import org.ygy.spring.service.IUserService;

@Service("userService")
public class UserService implements IUserService {
	
	@Autowired
	private IUserDao userDao;

	public UserEntity queryUser(String id) {
		
		System.out.println("from userService");
		System.out.println("id: " + id);
		
		userDao.queryUser();
		
		return null;
	}

}
