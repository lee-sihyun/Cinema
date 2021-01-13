package cinema.movie.dao;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import cinema.movie.dto.*;
import cinema.movie.mapper.*;

@Repository
public class PayMyBatis implements PayDAO{

	
	
	@Autowired
	private SqlSession sqlsession;

	@Override
	public int insertPay(PayDTO payDTO) {
		
		return sqlsession.getMapper(PayMapper.class).insertPay(payDTO);
	}
	
	
	
	
	
	
	
	
}
