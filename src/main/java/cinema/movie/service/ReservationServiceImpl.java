package cinema.movie.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import cinema.movie.dao.*;
import cinema.movie.dto.*;

@Service
public class ReservationServiceImpl implements ReservationService{

	
	@Autowired
	private ReservationDAO reservationDAO;

	@Override
	public void insertReservation(ReservationDTO reservationDTO) {
		
		reservationDAO.insertReservation(reservationDTO);
	}
	
	
	
	
	
}
