package com.mvc.ex01.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.ex01.model.biz.UserBiz;
import com.mvc.ex01.model.dto.UserDto;

@Controller
public class UserController {

	@Autowired
	private UserBiz biz;

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@RequestMapping("/user/loginpage.do")
	public String loginPage() {
		return "login";
	}
	
	@ResponseBody
	@RequestMapping("/user/login.do")
	public String login(Model model, @RequestBody HashMap<String, Object> map) {
		logger.info("login");

		
		//model.addAttribute("dto", biz.login(dto));

		return "list";
	}

	// alert추가하여 페이지 리턴
	private void jsResponse(String msg, String url, HttpServletResponse response) {
		try {
			response.setContentType("text/html; charset=UTF-8");

			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('" + msg + "')");
			out.println("location.href='" + url + "'");
			out.println("</script>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
