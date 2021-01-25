package cinema.movie.dao;

import java.util.*;

import cinema.movie.dto.*;

public interface TheaterDAO {

	int insertTheater(TheaterDTO theaterDTO);
	TheaterDTO selectTh(String address);
}
