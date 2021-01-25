package cinema.movie.service;

import java.util.*;

import cinema.movie.dto.*;

public interface TheaterService {

	void insertTheater (TheaterDTO theaterDTO);
	TheaterDTO selectTs(String address);
	

}
