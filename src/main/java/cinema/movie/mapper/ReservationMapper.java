package cinema.movie.mapper;

import java.util.*;

import cinema.movie.dto.*;

public interface ReservationMapper {

	int insertReservation(ReservationDTO reservationDTO);
	
	/*영화목록출력-이름만가져오도록*/
	List<MovieDTO>reSelectMv();
	
	
}
