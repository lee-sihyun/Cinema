package cinema.movie.mapper;

import java.util.*;

import cinema.movie.dto.*;

public interface MovieMapper {

	int insertMovie (MovieDTO movieDTO);
	List<MovieDTO>selectMv();
}
