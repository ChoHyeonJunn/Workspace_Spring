package com.mvc.ex01.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.ex01.model.dao.ExDao;
import com.mvc.ex01.model.dto.ExDto;

@Service
public class ExBizImpl implements ExBiz {

	@Autowired
	private ExDao dao;
	
	@Override
	public List<ExDto> selectList() {
		return dao.selectList();
	}

	@Override
	public ExDto selectOne(int MYNO) {
		return dao.selectOne(MYNO);
	}

	@Override
	public int insert(ExDto dto) {
		return dao.insert(dto);
	}

	@Override
	public int update(ExDto dto) {
		return dao.update(dto);
	}

	@Override
	public int delete(int MYNO) {
		return dao.delete(MYNO);
	}

}
