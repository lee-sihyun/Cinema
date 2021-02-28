package cinema.movie.dao;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import cinema.movie.dto.*;
import cinema.movie.mapper.*;

@Repository
public class SeatMyBatis implements SeatDAO {

	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertSeat(SeatDTO seatDTO) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(SeatMapper.class).insertSeat(seatDTO);
	}
	
	
	
	
	
}
