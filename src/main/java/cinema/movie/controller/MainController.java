package cinema.movie.controller;

import javax.servlet.http.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import cinema.movie.dto.*;
import cinema.movie.service.*;

@Controller
//@RequestMapping("/main")
public class MainController {

	@Autowired
	private UserInfoService userInfoService;

	@RequestMapping("/")
	public String main() {
		return "main";
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "main/login";

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute UserInfoDTO userinfoDTO,HttpSession session) {

		//userInfoService.selectUserInfo(userNum);
		session.setAttribute("", userInfoService.selectUserInfo(userinfoDTO.getUserNum()));
		
		return "redirect:/";

	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

	

	//회원가입
	@RequestMapping(value = "/join",method=RequestMethod.GET)
	public String join() {
		return "main/join";

	}
	
	//회원가입 응답
	@RequestMapping(value = "/join",method = RequestMethod.POST)
	@ResponseBody
	public String join(@ModelAttribute UserInfoDTO userinfo) {
		userInfoService.insertUserInfo(userinfo);
		return "success";

	}
	
	//회원가입완료
	@RequestMapping("/completion")
	public String joincompletion() {
		return "main";
	}
	
	
	

}
