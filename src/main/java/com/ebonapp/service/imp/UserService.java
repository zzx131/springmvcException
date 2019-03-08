package com.ebonapp.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebonapp.dao.UserDao;
import com.ebonapp.model.User;
import com.ebonapp.service.IUserService;

@Service
public class UserService implements IUserService{
	@Autowired
	public UserDao userDao;
	
	public void add(User user) {
		System.out.println("service层  user添加！！开始");
		userDao.add(user);
		System.out.println("service层 user添加！！结束");
	}

}
