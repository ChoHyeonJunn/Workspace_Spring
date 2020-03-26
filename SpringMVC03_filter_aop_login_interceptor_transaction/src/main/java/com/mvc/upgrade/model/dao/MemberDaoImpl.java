package com.mvc.upgrade.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.upgrade.model.dto.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public MemberDto login(MemberDto dto) {
		MemberDto res = null;

		System.out.println(">" + dto);

		try {
			res = sqlSession.selectOne(NAMESPACE + "login", dto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error login");
		}

		return res;
	}

	@Override
	public int idCheck(MemberDto dto) {
		int res = 0;

		System.out.println(">" + dto);

		try {
			res = sqlSession.selectOne(NAMESPACE + "idCheck", dto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error idCheck");
		}

		return res;
	}

	@Override
	public int join(MemberDto dto) {
		int res = 0;

		System.out.println(">" + dto);

		try {
			res = sqlSession.insert(NAMESPACE + "join", dto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error join");
		}

		return res;
	}

}
