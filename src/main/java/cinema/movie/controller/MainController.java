package cinema.movie.controller;

import javax.servlet.http.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import cinema.movie.dto.*;
import cinema.movie.service.*;



@Controller
@RequestMapping("/main")
public class MainController {

	
	@Autowired
	private UserInfoService userInfoService;
	
    @RequestMapping(value = "/index",method=RequestMethod.GET)
    public String main() {
    	return "main/index";
    }
    
    
    @RequestMapping("/login")
    public String login() {
    	return "";
    	
    }
   

    @RequestMapping("/logout")
    public String logout (HttpSession session) {
    	session.invalidate();
    	return "redirect:/login";
    }
    
    

	
	
	
}
