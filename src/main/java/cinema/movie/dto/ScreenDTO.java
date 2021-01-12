package cinema.movie.dto;

/*이름          널?       유형             
----------- -------- -------------- 
S_ID        NOT NULL VARCHAR2(1000) 
THEATER_NUM NOT NULL NUMBER(38)     
MV_NAME     NOT NULL VARCHAR2(1000) 
SEATS       NOT NULL VARCHAR2(1000) 
S_NUM       NOT NULL NUMBER(38)     */
public class ScreenDTO {

	
	private String sId;
	private int theaterNum;
	private String mvName;
	private String seats;
	private int sNum;
	
	


	public ScreenDTO() {
		// TODO Auto-generated constructor stub
	}


	public String getsId() {
		return sId;
	}


	public void setsId(String sId) {
		this.sId = sId;
	}


	public int getTheaterNum() {
		return theaterNum;
	}


	public void setTheaterNum(int theaterNum) {
		this.theaterNum = theaterNum;
	}


	public String getMvName() {
		return mvName;
	}


	public void setMvName(String mvName) {
		this.mvName = mvName;
	}


	public String getSeats() {
		return seats;
	}


	public void setSeats(String seats) {
		this.seats = seats;
	}
	
	

	public int getsNum() {
		return sNum;
	}


	public void setsNum(int sNum) {
		this.sNum = sNum;
	}
	
	
	
}
