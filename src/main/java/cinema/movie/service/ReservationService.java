package cinema.movie.service;

import java.util.*;

import cinema.movie.dto.*;

public interface ReservationService {

	void insertReservation(ReservationDTO reservation);
	List<MovieDTO>reSelectMv();
}
