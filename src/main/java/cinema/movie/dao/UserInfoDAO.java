package cinema.movie.dao;

import java.util.*;

import cinema.movie.dto.*;

public interface UserInfoDAO {

	
	int insertUserInfo(UserInfoDTO userInfoDTO);
	List<UserInfoDTO>selectUserInfo(int userNum);
}
