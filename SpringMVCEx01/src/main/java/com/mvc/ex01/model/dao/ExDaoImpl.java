package com.mvc.ex01.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.ex01.model.dto.ExDto;

@Repository
public class ExDaoImpl implements ExDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	public List<ExDto> selectList() {
		List<ExDto> selectList = new ArrayList<ExDto>();

		try {
			selectList = sqlSession.selectList(NAMESPACE + "selectList");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERROR : selectList");
		}
		return selectList;
	}

	public ExDto selectOne(int MYNO) {
		ExDto dto = new ExDto();

		try {
			dto = sqlSession.selectOne(NAMESPACE + "selectOne", MYNO);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERROR : selectOne");
		}
		return dto;
	}

	public int insert(ExDto dto) {
		int res = 0;

		try {
			res = sqlSession.insert(NAMESPACE + "insert", dto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERROR : insert");
		}
		return res;
	}

	public int update(ExDto dto) {
		int res = 0;

		try {
			res = sqlSession.insert(NAMESPACE + "update", dto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERROR : update");
		}
		return res;
	}

	public int delete(int MYNO) {
		int res = 0;

		try {
			res = sqlSession.insert(NAMESPACE + "delete", MYNO);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERROR : delete");
		}
		return res;
	}
}
