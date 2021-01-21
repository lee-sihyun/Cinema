package cinema.movie.exception;

//인증 실패될 경우 발생되는 예외 클래스
// => 회원정보를 이용한 인증처리 기능을 구현할 때 예외 발생
public class LoginAuthFailException extends Exception{
    private static final long serialVersionUID = 1L;
    
    private int userNum;
    
    public LoginAuthFailException() {
        // TODO Auto-generated constructor stub
    }
    
    public LoginAuthFailException(int userNum, String message) {
    	super(message);
    	this.userNum=userNum;
    }
    
    

	public int getUseNum() {
		return userNum;
	}

	public void setUseNum(int useNum) {
		this.userNum = useNum;
	}

    
   
    
}
