package cinema.movie.service;

import java.util.*;

import org.mindrot.jbcrypt.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

import cinema.movie.dao.*;
import cinema.movie.dto.*;
import cinema.movie.exception.*;


@Service
public class UserInfoServiceImpl implements UserInfoService{

	
	@Autowired
	private UserInfoDAO userInfoDAO;
	
	@Transactional
	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
	//	userInfoDTO.setUserPw(userInfoDTO.getUserPw());
		userInfoDAO.insertUserInfo(userInfoDTO);
		
	}

	@Override
	public UserInfoDTO selectUserInfo(String userId) {
		// TODO Auto-generated method stub
		return userInfoDAO.selectUserInfo(userId);
	}

	@Override
	public void loginAuth(UserInfoDTO userInfoDTO) throws LoginAuthFailException {
		// TODO Auto-generated method stub
		
		UserInfoDTO authUserinfo=userInfoDAO.selectUserInfo(userInfoDTO.getUserId());
        System.out.println("userInfoDTO.getUserId = "+userInfoDTO.getUserId());
        if(authUserinfo==null) {
            throw new LoginAuthFailException(userInfoDTO.getUserId(), "회원정보가 존재하지 않습니다.");
        }
        
      
     /*  if(!BCrypt.checkpw(userInfoDTO.getUserPw(), authUserinfo.getUserPw())) {
         throw new LoginAuthFailException(userInfoDTO.getUserId(), "아이디가 없거나 비밀번호가 맞지 않습니다.");
       }
       */
		
	}



	
	

	
}
