package org.ygy.spring.dao.impl;

import org.springframework.stereotype.Component;
import org.ygy.spring.dao.IUserDao;
import org.ygy.spring.entity.UserEntity;

@Component
public class UserDao implements IUserDao {

	public UserEntity queryUser() {
		System.out.println("from userDao");
		return null;
	}

}
