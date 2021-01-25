package cinema.movie.service;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import cinema.movie.dao.*;
import cinema.movie.dto.*;

@Service
public class TheaterServiceImpl implements TheaterService {

	
	
	@Autowired
	private TheaterDAO theaterDAO;

	@Override
	public void insertTheater(TheaterDTO theaterDTO) {
		// TODO Auto-generated method stub
		theaterDAO.insertTheater(theaterDTO);
		
	}

	@Override
	public TheaterDTO selectTs(String address) {
		// TODO Auto-generated method stub
		return theaterDAO.selectTh(address);
	}


	
	
}
