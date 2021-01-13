package cinema.movie.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import cinema.movie.service.*;

@Controller
@RequestMapping("/reservation")
public class ReservationController {

	
	@Autowired
	private ReservationService reservationService;
	
	
	@RequestMapping("list")
	public String ReList() {
		return "reservation/list";
	}
	
	
	
	@RequestMapping("add")
	public String ReAdd() {
		return "reservation/add";
	}
	
}
