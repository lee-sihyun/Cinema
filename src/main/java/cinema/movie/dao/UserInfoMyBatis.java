package cinema.movie.dao;

import java.util.*;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import cinema.movie.dto.*;
import cinema.movie.mapper.*;

@Repository
public class UserInfoMyBatis implements UserInfoDAO {

	@Autowired
	private SqlSession sqlsession;

	@Override
	public int insertUserInfo(UserInfoDTO userInfoDTO) {
		// TODO Auto-generated method stub
		return sqlsession.getMapper(UserInfoMapper.class).insertUserInfo(userInfoDTO);
	}

	@Override
	public UserInfoDTO selectUserInfo(String userId) {
		// TODO Auto-generated method stub
		return sqlsession.getMapper(UserInfoMapper.class).selectUserInfo(userId);
	}

	@Override
	public int idChk(UserInfoDTO userInfoDTO) {
		// TODO Auto-generated method stub
		return sqlsession.getMapper(UserInfoMapper.class).idChk(userInfoDTO);
	}



}
