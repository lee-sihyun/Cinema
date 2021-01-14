package cinema.movie.service;

import java.util.*;

import cinema.movie.dto.*;

public interface UserInfoService {
	
void insertUserInfo (UserInfoDTO userInfoDTO);
List<UserInfoDTO>selectUserInfo(int userNum);
}
