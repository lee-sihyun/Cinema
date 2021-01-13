package cinema.movie.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import cinema.movie.dao.*;
import cinema.movie.dto.*;

@Service
public class UserInfoServiceImpl implements UserInfoService{

	
	@Autowired
	private UserInfoDAO userInfoDAO;
	
	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
	//	userInfoDTO.setUserPw(userInfoDTO.getUserPw());
		userInfoDAO.insertUserInfo(userInfoDTO);
		
	}
	
	

	
}
