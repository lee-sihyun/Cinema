package cinema.movie.dao;

import java.util.*;

import cinema.movie.dto.*;

public interface ReservationDAO {

	int insertReservation(ReservationDTO reservationDTO);
	
	List<MovieDTO>reSelectMv();
	
	
	
	
}
