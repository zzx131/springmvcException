package com.ebonapp.service;

import com.ebonapp.model.User;

public interface IUserService {
	
	public default double instal(int a) {
		return Math.sqrt(a);
	}
	
	public void add(User user);
}
