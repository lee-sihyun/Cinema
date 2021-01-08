package cinema.movie.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

	
    @RequestMapping("/index")
    public String main() {
    	return "main/index";
    }
    	
	
	
	
}
