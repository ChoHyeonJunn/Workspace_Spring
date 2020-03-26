package com.mvc.ex01.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.ex01.model.biz.ExBiz;
import com.mvc.ex01.model.dto.ExDto;

@Controller
public class HomeController {

	@Autowired
	private ExBiz biz;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping("/list.do")
	public String selectList(Model model) {
		logger.info("selectList");

		model.addAttribute("selectList", biz.selectList());

		return "list";
	}

	@RequestMapping("/detail.do")
	public String selectOne(Model model, int MYNO) {
		logger.info("selectOne");

		model.addAttribute("dto", biz.selectOne(MYNO));

		return "detail";
	}

	@RequestMapping("/insertform.do")
	public String insert(Model model) {
		logger.info("[insertform.do]");
		return "insert";
	}

	@RequestMapping(value = "/insertres.do", method = RequestMethod.POST)
	public void insertRes(Model model, @ModelAttribute ExDto dto, HttpServletResponse response) {

		int res = biz.insert(dto);
		if (res > 0) {
			jsResponse("글쓰기 성공", "list.do", response);
		} else {
			jsResponse("글쓰기 실패", "list.do", response);
		}
	}

	@RequestMapping("/updateform.do")
	public String updateForm(Model model, int MYNO) {
		logger.info("UPDATE FORM");

		model.addAttribute("dto", biz.selectOne(MYNO));

		return "update";
	}

	@RequestMapping(value = "/updateres.do", method = RequestMethod.POST)
	public void updateRes(Model model, @ModelAttribute ExDto dto, HttpServletResponse response) {
		logger.info("UPDATE RESULT");

		int res = biz.update(dto);
		if (res > 0) {
			jsResponse("수정 성공", "detail.do?MYNO=" + dto.getMYNO(), response);
		} else {
			jsResponse("수정 실패", "detail.do?MYNO=" + dto.getMYNO(), response);
		}
	}

	@RequestMapping("/delete.do")
	public void delete(Model model, int MYNO, HttpServletResponse response) {
		logger.info("DELETE");

		int res = biz.delete(MYNO);
		if (res > 0) {
			jsResponse("삭제 성공", "list.do", response);
		} else {
			jsResponse("삭제 실패", "list.do", response);
		}
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
