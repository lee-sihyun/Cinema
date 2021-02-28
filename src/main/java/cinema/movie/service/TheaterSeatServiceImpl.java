package cinema.movie.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import cinema.movie.dao.*;
import cinema.movie.dto.*;

@Service
public class TheaterSeatServiceImpl implements TheaterSeatService{

	
	
	@Autowired
	private SeatDAO  theaterSeatDAO;

	@Override
	public void insertTs(SeatDTO seatDTO) {
		theaterSeatDAO.insertSeat(seatDTO);
		
	}
	
	
	
}
