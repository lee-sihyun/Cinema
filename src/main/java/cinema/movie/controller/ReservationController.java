package cinema.movie.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import cinema.movie.service.*;

@Controller
@RequestMapping("/reservation")
public class ReservationController {

	






	
	@Autowired MovieService movieService;
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String ReList (Model model) {
		
		
		model.addAttribute("reSelectMv",movieService.reSelectMv());
		
		return"reservation/list";
	}
	
	
	
	@Autowired
	private ReservationService reservationService;
	
	@RequestMapping(value = "/add",method = RequestMethod.GET)
	public String ReAdd(Model model) {
	
		model.addAttribute("selectAddress", reservationService.selectAddress());
		
		return "reservation/add";
	}

	
	
	
	
	
	
	@RequestMapping(value = "/add2",method = RequestMethod.GET)
	public String ReAdd2(Model model) {
	
		model.addAttribute("selectAddress2", reservationService.selectAddress2());
		
		return "";
	}

	
	
	
}
