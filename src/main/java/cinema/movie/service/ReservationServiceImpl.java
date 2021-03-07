package cinema.movie.service;

import java.util.*;

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

	@Override
	public List<MovieDTO> reSelectMv() {
		// TODO Auto-generated method stub
		return reservationDAO.reSelectMv();
	}

	@Override
	public List<MovieDTO> selectAddress() {
		// TODO Auto-generated method stub
		return reservationDAO.selectAddress();
	}

	@Override
	public List<MovieDTO> selectAddress2() {
		// TODO Auto-generated method stub
	return reservationDAO.selectAddress2();
	}
	
	
	
	
	
}
