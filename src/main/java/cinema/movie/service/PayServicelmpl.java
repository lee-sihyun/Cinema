package cinema.movie.service;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import cinema.movie.dao.*;
import cinema.movie.dto.*;

@Service
public class PayServicelmpl implements PayService {

	@Autowired
	private PayDAO payDAO;

	@Override
	public void insertPay(PayDTO payDTO) {
		payDAO.insertPay(payDTO);
		
	}
	
	
	
	
	

	
	
	
}
