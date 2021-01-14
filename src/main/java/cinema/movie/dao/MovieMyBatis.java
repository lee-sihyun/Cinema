package cinema.movie.dao;

import java.util.*;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import cinema.movie.dto.*;
import cinema.movie.mapper.*;

@Repository
public class MovieMyBatis implements MovieDAO {

	
	@Autowired
	private SqlSession sqlsseion;

	@Override
	public int insertMovie(MovieDTO movieDTO) {
		// TODO Auto-generated method stub
		return sqlsseion.getMapper(MovieMapper.class).insertMovie(movieDTO);
	}

	@Override
	public List<MovieDTO> selectMv() {
		// TODO Auto-generated method stub
		return sqlsseion.getMapper(MovieMapper.class).selectMv();
	}
	
	
	
	
}
