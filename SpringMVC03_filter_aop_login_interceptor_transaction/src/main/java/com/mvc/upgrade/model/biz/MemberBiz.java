package com.mvc.upgrade.model.biz;

import com.mvc.upgrade.model.dto.MemberDto;

public interface MemberBiz {

	public MemberDto login(MemberDto dto);

	public int idCheck(MemberDto dto);

	public int join(MemberDto dto);
}
