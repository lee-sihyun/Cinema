package cinema.movie.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import cinema.movie.service.*;

@Controller
@RequestMapping("/reservation")
public class ReservationController {

	



	
	/*	@RequestMapping("list")
	public String ReList() {
		return "reservation/list";
	}*/

	
	
	@Autowired MovieService movieService;
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String ReList (Model model) {
		
		
		model.addAttribute("reSelectMv",movieService.reSelectMv());
		
		return"reservation/list";
	}
	
	
	@Autowired
	private ReservationService reservationService;
	
	
	@RequestMapping("add")
	public String ReAdd() {
		return "reservation/add";
	}
	
}
