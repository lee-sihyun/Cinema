package cinema.movie.service;

import java.util.*;

import cinema.movie.dto.*;

public interface MovieService {

	void insertMovie(MovieDTO movieDTO);
	List<MovieDTO>selectMv();
}
