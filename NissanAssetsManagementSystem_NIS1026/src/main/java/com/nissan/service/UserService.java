package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IUserDAO;
import com.nissan.model.User;

@Service
public class UserService implements IUserService  {

	@Autowired
	IUserDAO userdao;
	
	
	@Override
	public User addUser(User user) {
		
		return userdao.save(user);
	}

	@Override
	public User updateUser(User user) {
		
		return userdao.save(user);
	}

	@Override
	public void deleteUser(Integer userId) {

		userdao.deleteById(userId);

	}

	@Override
	public List<User> getAllUser() {
		
		return userdao.findAll();
	}

	@Override
	public User getByUserId(Integer userId) {
		
		return userdao.findById(userId).get();
	}

}
