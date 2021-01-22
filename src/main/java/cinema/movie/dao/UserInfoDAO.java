package cinema.movie.dao;

import java.util.*;

import cinema.movie.dto.*;

public interface UserInfoDAO {

	
	int insertUserInfo(UserInfoDTO userInfoDTO);
	UserInfoDTO selectUserInfo(String userId);
}
