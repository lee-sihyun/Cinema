package cinema.movie.exception;

import cinema.movie.dto.*;




public class UserinfoExistsException extends Exception{
    private static final long serialVersionUID = 1L;
    
    //ExceptionHandler에게 예외 관련 정보를 전달하기 위한 필드
    private UserInfoDTO userInfoDTO;
    
    public UserinfoExistsException() {
        
    }
    
    
    public UserinfoExistsException(UserInfoDTO userInfoDTO, String message) {
        super(message);
        this.userInfoDTO=userInfoDTO;
    }


	public UserInfoDTO getUserInfoDTO() {
		return userInfoDTO;
	}

	public void setUserInfoDTO(UserInfoDTO userInfoDTO) {
		this.userInfoDTO = userInfoDTO;
	}
    
 
    
    
}
