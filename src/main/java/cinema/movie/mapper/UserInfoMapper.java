package cinema.movie.mapper;


import java.util.List;

import cinema.movie.dto.*;

public interface UserInfoMapper {
int insertUserInfo (UserInfoDTO userInfoDTO);
List<UserInfoDTO>selectUserInfo(int userNum);
}
