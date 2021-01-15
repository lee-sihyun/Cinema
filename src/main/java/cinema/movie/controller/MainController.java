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
    
    
    @RequestMapping("/login")
    public String login() {
    	return "main/login";
    	
    }
   

    @RequestMapping("/logout")
    public String logout (HttpSession session) {
    	session.invalidate();
    	return "redirect:/";
    }
    
    

	
	
	
}
