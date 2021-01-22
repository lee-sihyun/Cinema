package cinema.movie.service;

import java.util.*;

import cinema.movie.dto.*;
import cinema.movie.exception.*;


public interface UserInfoService {
	
void insertUserInfo (UserInfoDTO userInfoDTO);
UserInfoDTO selectUserInfo(String userId);


//¿Œ¡ı
void loginAuth (UserInfoDTO userInfoDTO) throws LoginAuthFailException;


}
