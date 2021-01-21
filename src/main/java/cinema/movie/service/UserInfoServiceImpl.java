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
	public UserInfoDTO selectUserInfo(int userNum) {
		// TODO Auto-generated method stub
		return userInfoDAO.selectUserInfo(userNum);
	}

	@Override
	public void loginAuth(UserInfoDTO userInfoDTO) throws LoginAuthFailException {
		// TODO Auto-generated method stub
		
		UserInfoDTO authUserinfo=userInfoDAO.selectUserInfo(userInfoDTO.getUserNum());
        System.out.println("userInfoDTO.getUserNum() = "+userInfoDTO.getUserNum());
        if(authUserinfo==null) {
            throw new LoginAuthFailException(userInfoDTO.getUserNum(), "회원정보가 존재하지 않습니다.");
        }
        
        //BCrypt.checkpw(String plantText, String hashed)
        // => 일반 문자열과 암호화된 문자열을 비교하여 같은 경우 true를 반환하는 메소드
        if(!BCrypt.checkpw(userInfoDTO.getUserPw(), authUserinfo.getUserPw())) {
            throw new LoginAuthFailException(userInfoDTO.getUserNum(), "아이디가 없거나 비밀번호가 맞지 않습니다.");
        }
		
	}



	
	

	
}
