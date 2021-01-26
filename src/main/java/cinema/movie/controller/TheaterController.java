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


	
	//지역별영화관

	
	@RequestMapping("list/seoul")
	public String seoul() {
		
		
		return"theater/theaterlist/seoul";
	}
	
	@RequestMapping("list/gyunggi")
	public String gyunggi() {
		
		
		return"theater/theaterlist/gyunggi";
	}
	
	
	@RequestMapping("list/incheon")
	public String incheon() {
		
		
		return"theater/theaterlist/incheon";
	}
	
	@RequestMapping("list/gangwon")
	public String gangwon() {
		
		
		return"theater/theaterlist/gangwon";
	}
	//충청
	@RequestMapping("list/chung")
	public String chung() {
		
		
		return"theater/theaterlist/chung";
	}
	//전라
	@RequestMapping("list/jeon")
	public String jeon() {
		
		
		return"theater/theaterlist/jeon";
	}
	
	@RequestMapping("list/dae")
	public String dae() {
		
		
		return"theater/theaterlist/dae";
	}
	
	//부산울산
	@RequestMapping("list/buul")
	public String buul() {
		
		
		return"theater/theaterlist/buul";
	}
	
	
	
	
}
