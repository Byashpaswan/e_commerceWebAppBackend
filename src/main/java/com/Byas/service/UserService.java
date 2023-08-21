package com.Byas.service;

import com.Byas.exception.UserException;
import com.Byas.model.User;

public interface UserService {
	
	public User findUserById(Long userId)throws UserException;
	 public User findUserProfileByJwt(String jwt) throws UserException;

}
