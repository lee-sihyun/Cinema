package cinema.movie.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import cinema.movie.service.*;

@Controller
@RequestMapping("/ticket")
public class TicketController {

	
	@Autowired
	private TicketSevice ticketSevice;
	
	@RequestMapping("/list")
	public String ticketList() {
		return "ticket/list";
	}
	
	
	@RequestMapping("/add")
	public String ticketAdd() {
		return "ticket/add";
	}
	
	
}
