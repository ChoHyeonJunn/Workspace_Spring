package com.mvc.ex01.model.dao;

import java.util.List;

import com.mvc.ex01.model.dto.ExDto;

public interface ExDao {

	String NAMESPACE = "board.";
	
	public List<ExDto> selectList();

	public ExDto selectOne(int MYNO);

	public int insert(ExDto dto);

	public int update(ExDto dto);

	public int delete(int MYNO);
}
