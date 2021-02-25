package cinema.movie.dto;
/*

이름        널?       유형             
--------- -------- -------------- 
USER_ID   NOT NULL VARCHAR2(1000) 
USER_PW   NOT NULL VARCHAR2(1000) 
ADD_NUM   NOT NULL NUMBER(38)     
ADDRESS   NOT NULL VARCHAR2(1000) 
PHONE_NUM NOT NULL NUMBER(38)     
 
USER_NUM  NOT NULL NUMBER(38)     
*/  
public class UserInfoDTO {


	private String userId;
	private String userPw;
	private int addNum;
	private String address;
	private int phoneNum;

	private int userNum;
	
	


	public UserInfoDTO() {
		// TODO Auto-generated constructor stub
	}




	public String getUserId() {
		return userId;
	}




	public void setUserId(String userId) {
		this.userId = userId;
	}




	public String getUserPw() {
		return userPw;
	}




	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}




	public int getAddNum() {
		return addNum;
	}




	public void setAddNum(int addNum) {
		this.addNum = addNum;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public int getPhoneNum() {
		return phoneNum;
	}




	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}




	public int getUserNum() {
		return userNum;
	}




	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}


	
	
}
