package cinema.movie.dao;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import cinema.movie.dto.*;

@Repository
public class ScreenMyBatis implements ScreenDAO{

	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertScreen(ScreenDTO screenDTO) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(ScreenDAO.class).insertScreen(screenDTO);
				
	}
	
	
	
	
	
	
}
