package cinema.movie.dao;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import cinema.movie.dto.*;
import cinema.movie.mapper.*;

@Repository
public class TicketMyBatis implements TicketDAO {

	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertTicket(TicketDTO ticketDTO) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(TicketMapper.class).insertTicket(ticketDTO);
	}
	
	
	
	
	
}
