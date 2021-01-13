package cinema.movie.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import cinema.movie.service.*;

@Controller
@RequestMapping("/pay")
public class PayController {

	
	@Autowired
	private PayService payService;
	
	
	@RequestMapping("/list")
	public String PayList() {
		return"pay/list";
	}
	
	
	//결제하기
	@RequestMapping("/add")
	public String PayAdd() {
		return "pay/add";
	}
	
}
