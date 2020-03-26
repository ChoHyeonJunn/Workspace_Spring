package com.mvc.upgrade.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.upgrade.model.dto.MemberDto;

public class LoginInterceptor implements HandlerInterceptor {

	private Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

	// controller로 보내기 전에 처리하는 인터셉터
	// 반환이 false라면 controller로 요청을 안함
	// 매개변수 Object는 핸들러 정보를 의미한다. ( RequestMapping , DefaultServletHandler )
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.info("[INTERCEPTOR] : preHandle");
		HttpSession session = request.getSession();

		MemberDto member = (MemberDto) session.getAttribute("login");

//		if (member == null) {
//			System.out.println("로그인 해야됨!!");
//			response.sendRedirect("loginform.do");
//			return false;
//		} else {
//			return true;
//		}

		if (request.getRequestURI().contains("/loginform.do") || request.getRequestURI().contains("/ajaxlogin.do")
				|| request.getRequestURI().contains("/joinform.do")
				|| request.getRequestURI().contains("/ajaxidcheck.do")
				|| request.getRequestURI().contains("/join.do")
				|| request.getSession().getAttribute("login") != null) {
			return true;
		}
		if (request.getSession().getAttribute("login") == null) {
			response.sendRedirect("loginform.do");
		}

		return false;
	}

	// controller의 handler가 끝나면 처리됨
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("[INTERCEPTOR] : postHandle");
	}

	// view까지 처리가 끝난 후에 처리됨
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.info("[INTERCEPTOR] : afterCompletion");
	}

}
