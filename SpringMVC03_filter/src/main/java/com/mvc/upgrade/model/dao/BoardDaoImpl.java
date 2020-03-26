package com.mvc.upgrade.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.upgrade.model.dto.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<BoardDto> selectList() {
		List<BoardDto> list = new ArrayList<BoardDto>();

		try {
			list = sqlSession.selectList(NAMESPACE + "selectList");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[ERROR] : select List");
		}

		return list;
	}

	@Override
	public BoardDto selectOne(int MYNO) {
		BoardDto dto = null;

		try {
			dto = sqlSession.selectOne(NAMESPACE + "selectOne", MYNO);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[ERROR] : select One");
		}
		return dto;
	}

	@Override
	public int insert(BoardDto dto) {
		int res = 0;
		try {
			res = sqlSession.insert(NAMESPACE + "insert", dto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[ERROR] : insert");
		}
		return res;
	}

	@Override
	public int update(BoardDto dto) {
		int res = 0;

		try {
			res = sqlSession.update(NAMESPACE + "update", dto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[ERROR] : update");
		}
		return res;
	}

	@Override
	public int delete(int MYNO) {
		int res = 0;

		try {
			res = sqlSession.delete(NAMESPACE + "delete", MYNO);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[ERROR] : delete");
		}
		return res;
	}

}
