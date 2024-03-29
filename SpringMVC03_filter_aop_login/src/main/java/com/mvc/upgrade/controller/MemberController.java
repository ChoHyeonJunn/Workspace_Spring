package com.mvc.upgrade.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.upgrade.model.biz.MemberBiz;
import com.mvc.upgrade.model.dto.MemberDto;

@Controller
public class MemberController {

	private Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	private MemberBiz biz;

	
	/*
	 * 회원가입 부분
	 */
	@RequestMapping(value = "/joinform.do")
	public String joinForm() {
		logger.info("JOIN FORM");
		return "join";
	}
	
	
	
	
	/*
	 * 로그인 부분
	 */
	@RequestMapping(value = "/loginform.do")
	public String loginForm() {
		logger.info("LOGIN FORM");
		return "login";
	}

	@ResponseBody
	@RequestMapping(value = "/ajaxlogin.do", method = RequestMethod.POST)
	public Map<String, Boolean> login(HttpSession session, @RequestBody MemberDto dto) {
		logger.info("AJAX LOGIN");
		/*
		 * @ResponseBody : java 객체를 response 객체에 binding
		 * 
		 * @RequestBody : request 객체에 담겨져 넘어오는 데이터를 java 객체에 binding
		 */
		
		MemberDto res = biz.login(dto);
		boolean check = false;

		if (res != null) {
			session.setAttribute("login", res);
			check = true;
		}

		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("check", check);

		return map;
	}
}
