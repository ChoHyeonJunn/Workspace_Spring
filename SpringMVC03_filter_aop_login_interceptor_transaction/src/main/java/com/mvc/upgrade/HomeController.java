package com.mvc.upgrade;

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

import com.mvc.upgrade.model.biz.BoardBiz;
import com.mvc.upgrade.model.dto.BoardDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	BoardBiz biz;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	// 리스트 페이지
	@RequestMapping(value = "/list.do")
	public String selectList(Model model) {
		logger.info("SELECT LIST");
		model.addAttribute("selectList", biz.selectList());
		return "selectList";
	}

	// 디테일 페이지
	@RequestMapping(value = "/detail.do")
	public String selectOne(Model model, int MYNO) {
		logger.info("[detail.do] : " + MYNO);
		model.addAttribute("board", biz.selectOne(MYNO));
		return "detail";
	}

	// 입력 페이지
	@RequestMapping(value = "/insertform.do")
	public String insertPage(Model model) {
		logger.info("[insertform.do]");
		return "insert";
	}

	// 입력 실행
	@RequestMapping(value = "/insert.do", method = RequestMethod.POST)
	public void insert(Model model, @ModelAttribute BoardDto dto, HttpServletResponse response) {
		logger.info("[insert.do] : " + dto);

		int res = biz.insert(dto);
		if (res > 0) {
			jsResponse("글쓰기 성공", "list.do", response);
		} else {
			jsResponse("글쓰기 실패", "list.do", response);
		}
	}

	// 수정 페이지
	@RequestMapping(value = "/updateform.do")
	public String updatePage(Model model, int MYNO) {
		logger.info("[updatepage.do] : " + MYNO);
		model.addAttribute("board", biz.selectOne(MYNO));
		return "update";
	}

	// 수정 실행
	@RequestMapping(value = "/update.do", method = RequestMethod.POST)
	public void update(Model model, @ModelAttribute BoardDto dto, HttpServletResponse response) {
		logger.info("[update.do] : " + dto);

		int res = biz.update(dto);
		if (res > 0) {
			jsResponse("수정 성공", "detail.do?MYNO=" + dto.getMYNO(), response);
		} else {
			jsResponse("수정 실패", "detail.do?MYNO=" + dto.getMYNO(), response);
		}
	}

	// 삭제 실행
	@RequestMapping(value = "/delete.do")
	public void delete(Model model, int MYNO, HttpServletResponse response) {
		System.out.println("[delete.do] : " + MYNO);
		int res = biz.delete(MYNO);
		if (res > 0) {
			jsResponse("삭제 성공", "list.do", response);
		} else {
			jsResponse("삭제 실패", "list.do", response);
		}
	}

	@RequestMapping(value = "/test.do")
	public String test() {

		logger.info("TRANSACTION");
		biz.test();

		return "redirect:list.do";
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
