package cinema.movie.dao;

import java.util.*;

import cinema.movie.dto.*;

public interface MovieDAO {

	int insertMovie(MovieDTO movieDTO);
	List<MovieDTO>selectMv();
}
