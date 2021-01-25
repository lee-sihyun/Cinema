package cinema.movie.dao;

import java.util.*;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import cinema.movie.dto.*;
import cinema.movie.mapper.*;

@Repository
public class TheaterMyBatis implements TheaterDAO{

	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertTheater(TheaterDTO theaterDTO) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(TheaterDAO.class).insertTheater(theaterDTO);
	}

	@Override
	public TheaterDTO selectTh(String address) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(TheaterMapper.class).selectTh(address);
	}


	
	
}
