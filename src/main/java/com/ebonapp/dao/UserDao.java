package com.ebonapp.dao;

import org.springframework.stereotype.Component;

import com.ebonapp.model.User;

@Component
public class UserDao {
	
	public void add(User user) {
		System.out.println("dao 层开始添加方法！！");
		double a = 5/0;
		System.out.println("dao 层介绍添加方法！！");
	}
}
