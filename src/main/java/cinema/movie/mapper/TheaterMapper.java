package cinema.movie.mapper;



import cinema.movie.dto.*;

public interface TheaterMapper {

	
	int insertTheater(TheaterDTO theaterDTO);
	
	TheaterDTO selectTh(String address);
	
	
	
}
