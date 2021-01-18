package cinema.movie.service;

import java.util.*;

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

	@Override
	public UserInfoDTO selectUserInfo(int userNum) {
		// TODO Auto-generated method stub
		return userInfoDAO.selectUserInfo(userNum);
	}



	
	

	
}
