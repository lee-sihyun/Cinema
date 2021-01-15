package cinema.movie.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import cinema.movie.dto.*;
import cinema.movie.service.*;

@Controller
@RequestMapping("/film")
public class MovieController {

	
	
	@Autowired
	private MovieService movieService;
	
	//영화목록
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String MovieList (Model model) {
		List<MovieDTO> selectMv=movieService.selectMv();
		model.addAttribute("selectMv",selectMv);
		return"movie/list";
	}
	
	//영화추가
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String MovieAdd() {
		return "movie/add";
	}
	
	
	
	
	
}
