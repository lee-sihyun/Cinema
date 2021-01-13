package cinema.movie.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import cinema.movie.dao.*;
import cinema.movie.dto.*;

@Service
public class TheaterSeatServiceImpl implements TheaterSeatService{

	
	
	@Autowired
	private TheaterSeatDAO  theaterSeatDAO;

	@Override
	public void insertTs(TheaterSeatDTO theaterSeatDTO) {
		theaterSeatDAO.insertTs(theaterSeatDTO);
		
	}
	
	
	
}
