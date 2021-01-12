package cinema.movie.dto;
/*이름          널?       유형            
----------- -------- ------------- 
SEAT_NUM    NOT NULL NUMBER(38)    
S_NUM       NOT NULL NUMBER(38)    
SEAT_RE     NOT NULL VARCHAR2(100) 
THEATER_NUM NOT NULL NUMBER(38)  */
public class TheaterSeatDTO {

	
	private int seatNum;
	private int sNum;
	private String seatRe;
	private int theaterNum;
	
	
	
	public TheaterSeatDTO() {
		// TODO Auto-generated constructor stub
	}



	public int getSeatNum() {
		return seatNum;
	}



	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}



	public int getsNum() {
		return sNum;
	}



	public void setsNum(int sNum) {
		this.sNum = sNum;
	}



	public String getSeatRe() {
		return seatRe;
	}



	public void setSeatRe(String seatRe) {
		this.seatRe = seatRe;
	}



	public int getTheaterNum() {
		return theaterNum;
	}



	public void setTheaterNum(int theaterNum) {
		this.theaterNum = theaterNum;
	}
	
	
	
}
