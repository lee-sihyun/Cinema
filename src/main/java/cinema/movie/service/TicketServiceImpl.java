package cinema.movie.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import cinema.movie.dao.*;
import cinema.movie.dto.*;

@Service
public class TicketServiceImpl implements TicketSevice {
	

	
	@Autowired
	private TicketDAO ticketDAO;

	@Override
	public void insertTicket(TicketDTO ticketDTO) {
		// TODO Auto-generated method stu

		ticketDAO.insertTicket(ticketDTO);
		
	}
	
	
	
}
