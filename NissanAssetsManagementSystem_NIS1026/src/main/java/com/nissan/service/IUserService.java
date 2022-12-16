package com.nissan.service;

import java.util.List;

import com.nissan.model.User;

public interface IUserService {
	
	
	//getAll User
	public List<User> getAllUser();
	
	//Save User
	public User addUser (User user);
	
	//update user
	public User updateUser(User user);
	
	//Delete user
	public void deleteUser(Integer userId);
	
	//get user by id
	public User getByUserId(Integer userId);

}
