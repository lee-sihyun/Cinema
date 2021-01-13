package cinema.movie.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import cinema.movie.service.*;

@Controller
@RequestMapping("/theaterseat")
public class TheaterSeatController {

	@Autowired
	private TheaterSeatService theaterSeatService;
	
	
	
	@RequestMapping("/list")
	public String TsList() {
		return"theaterseat/list";
	}
	
	@RequestMapping("/add")
	public String TsAdd() {
		return"theaterseat/add";
	}
	
	
	
}
