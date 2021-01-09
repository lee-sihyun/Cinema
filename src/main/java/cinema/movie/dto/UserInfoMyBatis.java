package cinema.movie.dto;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import cinema.movie.dao.*;
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

}
