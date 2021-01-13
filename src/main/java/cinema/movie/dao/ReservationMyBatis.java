package cinema.movie.dao;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import cinema.movie.dto.*;
import cinema.movie.mapper.*;

@Repository
public class ReservationMyBatis implements ReservationDAO {

	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertReservation(ReservationDTO reservationDTO) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(ReservationMapper.class).insertReservation(reservationDTO);
	}
	

	
	
	

}
