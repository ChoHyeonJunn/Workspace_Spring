package com.mvc.upgrade.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.upgrade.model.dao.BoardDao;
import com.mvc.upgrade.model.dto.BoardDto;

@Service
public class BoardBizImpl implements BoardBiz {

	@Autowired
	BoardDao dao;

	@Override
	public List<BoardDto> selectList() {
		return dao.selectList();
	}

	@Override
	public BoardDto selectOne(int MYNO) {
		return dao.selectOne(MYNO);
	}

	@Override
	public int insert(BoardDto dto) {
		return dao.insert(dto);
	}

	@Override
	public int update(BoardDto dto) {
		return dao.update(dto);
	}

	@Override
	public int delete(int MYNO) {
		return dao.delete(MYNO);
	}

	//@Transactional
	@Override
	public String test() {

		// dummy insert
		dao.insert(new BoardDto(1000, "test", "test", "test", null));

		// exception 발생 !! -> 위의 dummy insert는 rollback 되어야함!
		String test = dao.test();
		int lenth = test.length();

		return null;
	}

}
