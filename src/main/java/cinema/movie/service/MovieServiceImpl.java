package cinema.movie.service;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import cinema.movie.dao.*;
import cinema.movie.dto.*;


@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	private MovieDAO movieDAO;



	@Override
	public List<MovieDTO> selectMv() {
		// TODO Auto-generated method stub
		return movieDAO.selectMv();
	}



	@Override
	public List<MovieDTO> reSelectMv() {
		// TODO Auto-generated method stub
		return movieDAO.reSelectMv();
	}




	
	

	
}
