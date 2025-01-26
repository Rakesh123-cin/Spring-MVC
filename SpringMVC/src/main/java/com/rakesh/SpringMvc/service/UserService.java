package com.rakesh.SpringMvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakesh.SpringMvc.dao.UserDao;
import com.rakesh.SpringMvc.model.User;

@Service
public class UserService {
	@Autowired
	private UserDao dao;
	
	public int registerUser(User u)
	{
		return dao.registerUser(u);
	}
}
