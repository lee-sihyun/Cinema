package cinema.movie.dto;
/*
이름         널?       유형            
---------- -------- ------------- 
USER_NUM   NOT NULL NUMBER(38)    
USER_ID             VARCHAR2(20)  
USER_PW             VARCHAR2(20)  
USER_GRADE          VARCHAR2(20)  
ADD_NUM             NUMBER(38)    
ADDRESS             VARCHAR2(100) 
PHONE_NUM           NUMBER(38)  
*/  
public class UserInfoDTO {


	private String userId;
	private String userPw;
	private String userGrade;
	private int addNum;
	private String address;
	private int phone;
	
	
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


	public String getUserGrade() {
		return userGrade;
	}


	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
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


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
	
	
	
}
