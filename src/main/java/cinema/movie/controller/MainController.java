package cinema.movie.controller;

import java.io.*;

import javax.servlet.http.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;

import org.springframework.web.bind.annotation.*;

import cinema.movie.dao.*;
import cinema.movie.dto.*;
import cinema.movie.exception.*;
import cinema.movie.service.*;

@Controller
//@RequestMapping("/main")
public class MainController {

	@Autowired
	private UserInfoService userInfoService;

	@RequestMapping("/")
	public String main(HttpSession session, Model model) {

		return "main/index";

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "member/login";

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute UserInfoDTO userInfoDTO, HttpSession session) throws LoginAuthFailException {

		userInfoService.loginAuth(userInfoDTO);

		session.setAttribute("loginUserinfo", userInfoService.selectUserInfo(userInfoDTO.getUserId()));

		if (session.getAttribute("destURI") != null) {
			String destURI = (String) session.getAttribute("destURI");
			session.removeAttribute("destURI");
			return "redirect:" + destURI;
		}

		return "redirect:/";

	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

	// 회원가입
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {

		return "member/join";

	}

	// 회원가입 아이디 중복검사
	@ResponseBody
	@RequestMapping(value = "/idChk", method = RequestMethod.GET)
	public int idChk(UserInfoDTO userInfoDTO) {
		int result = userInfoService.idChk(userInfoDTO);

		return result;
	}

	// 회원가입 응답
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	@ResponseBody
	public String join(@ModelAttribute UserInfoDTO userinfo)  {

		/*
		 * 안됨 int result = userInfoService.idChk(userinfo); if (result == 1) { return
		 * "/member/join"; } else { userInfoService.insertUserInfo(userinfo); }
		 */

		if (userinfo.getUserId() != null) {

				System.out.println("이미존재하는아이디");
				
			return "/";
		}

		userInfoService.insertUserInfo(userinfo);
		return "success";

	}

	// 회원가입완료
	@RequestMapping("/completion")
	public String joincompletion() {
		return "member/login";
	}

	// 마이페이지
	@RequestMapping("/mypage")
	public String myPage(HttpSession session, Model model) {

		String userId = ((UserInfoDTO) session.getAttribute("loginUserinfo")).getUserId();
		model.addAttribute("mypage", userInfoService.selectUserInfo(userId));

		return "member/mypage";
	}

	@ExceptionHandler(LoginAuthFailException.class)
	public String exceptionHandler(LoginAuthFailException exception, Model model) {
		model.addAttribute("message", exception.getMessage());
		model.addAttribute("userId", exception.getUserId());
		return "member/login";
	}

}
