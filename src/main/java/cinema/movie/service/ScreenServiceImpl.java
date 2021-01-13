package cinema.movie.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import cinema.movie.dao.*;
import cinema.movie.dto.*;

@Service
public class ScreenServiceImpl implements ScreenService {

	
	@Autowired
	private ScreenDAO screenDAO;

	@Override
	public void insertScreen(ScreenDTO screenDTO) {
		screenDAO.insertScreen(screenDTO);
		
	}
	
	
	
	
}
