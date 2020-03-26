package com.mvc.ex01.model.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.ex01.model.dao.UserDao;
import com.mvc.ex01.model.dto.UserDto;

@Service
public class UserBizImpl implements UserBiz {

	@Autowired
	private UserDao dao;
	
	@Override
	public UserDto login(UserDto dto) {
		return dao.login(dto);
	}

}
