package cinema.movie.dao;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import cinema.movie.dto.*;
import cinema.movie.mapper.*;

@Repository
public class TheaterSeatMyBatis implements TheaterSeatDAO {

	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertTs(TheaterSeatDTO theaterSeatDTO) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(TheaterSeatMapper.class).insertTs(theaterSeatDTO);
	}
	
	
	
	
	
}
