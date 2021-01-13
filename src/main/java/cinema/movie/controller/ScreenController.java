package cinema.movie.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import cinema.movie.service.*;

@Controller
@RequestMapping("/screen")
public class ScreenController {

	
	@Autowired
	
	private ScreenService screenService;
	
	
	
	@RequestMapping("/add")
	public String ScreenAdd() {
		return"screen/add";
	}
	
	@RequestMapping("/list")
	public String ScreenList() {
		return"screen/list";
	}
	
	
	
	
}
