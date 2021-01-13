package cinema.movie.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import cinema.movie.service.*;

@Controller
@RequestMapping("/theater")
public class TheaterController {

	
	@Autowired
	private TheaterService theaterService;
	
	
	@RequestMapping("/add")
	public String ThAdd(){
		return"theater/add";
	}	
	
	@RequestMapping("/list")
	public String ThList(){
		return"theater/list";
	}
	
	
	
	
	
}
