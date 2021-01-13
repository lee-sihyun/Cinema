package cinema.movie.dao;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import cinema.movie.dto.*;

@Repository
public class TheaterMyBatis implements TheaterDAO{

	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertTheater(TheaterDTO theaterDTO) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(TheaterDAO.class).insertTheater(theaterDTO);
	}
	
}
