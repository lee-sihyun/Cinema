package cinema.movie.controller;

import javax.servlet.http.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import cinema.movie.dto.*;
import cinema.movie.service.*;


@Controller
public class MainController {

	
    @RequestMapping("/index")
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
