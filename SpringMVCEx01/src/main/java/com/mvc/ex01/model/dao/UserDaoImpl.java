package com.mvc.ex01.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.ex01.model.dto.UserDto;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public UserDto login(UserDto dto) {
		UserDto loginDto = null;
		
		try {
			dto = sqlSession.selectOne(NAMESPACE + "login", dto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error : login");
		}
		
		return loginDto;
	}

}
