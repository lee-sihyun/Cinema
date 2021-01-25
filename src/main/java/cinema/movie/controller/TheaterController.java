package cinema.movie.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
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


	@RequestMapping("view")
	public String view(@RequestParam String address, Model model) {
		
		model.addAttribute("theaterView",theaterService.selectTs(address));
		
		
		
		return"theater/seoul";
	}
	
	
}
