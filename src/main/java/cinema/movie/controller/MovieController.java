package cinema.movie.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import cinema.movie.service.*;

@Controller
@RequestMapping("/film")
public class MovieController {

	
	
	@Autowired
	private MovieService movieService;
	
	//영화목록
	@RequestMapping("/list")
	public String MovieList () {
		return"movie/list";
	}
	
	//영화삭제
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String MovieAdd() {
		return "movie/add";
	}
	
	
	
	
	
}
