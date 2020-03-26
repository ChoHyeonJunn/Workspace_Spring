package com.mvc.ex01.model.dao;

import com.mvc.ex01.model.dto.UserDto;

public interface UserDao {

	String NAMESPACE = "user.";

	public UserDto login(UserDto dto);
}
