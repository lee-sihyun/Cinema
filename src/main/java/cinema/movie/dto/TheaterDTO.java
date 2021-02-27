package cinema.movie.dto;
/*
이름           널?       유형             
------------ -------- -------------- 
THEATER_NUM  NOT NULL NUMBER(38)     
THEATER_NAME          VARCHAR2(1000) 
ADDRESS               VARCHAR2(1000) 
 */
public class TheaterDTO {

	
	private int theaterNum;
	private String theaterName;
	private String address;

	


	public TheaterDTO() {
		// TODO Auto-generated constructor stub
	}
	
	

	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getTheaterNum() {
		return theaterNum;
	}
	public void setTheaterNum(int theaterNum) {
		this.theaterNum = theaterNum;
	}
	
	
	
	
}
