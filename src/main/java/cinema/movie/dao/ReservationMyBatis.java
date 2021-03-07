package cinema.movie.dao;

import java.util.*;

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

	@Override
	public List<MovieDTO> reSelectMv() {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(ReservationMapper.class).reSelectMv();
	}
	
	
	@Override
	public List<MovieDTO> selectAddress() {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(ReservationMapper.class).selectAddress();
	}

	@Override
	public List<MovieDTO> selectAddress2() {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(ReservationMapper.class).selectAddress2();
	}
	

	
	
	

}
