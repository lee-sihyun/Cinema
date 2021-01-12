package cinema.movie.dto;
/*
이름          널?       유형             
----------- -------- -------------- 
MV_NUM      NOT NULL NUMBER(38)     
MV_NAME     NOT NULL VARCHAR2(1000) 
MV_DIRECTOR NOT NULL VARCHAR2(1000) 
MV_CAST     NOT NULL VARCHAR2(1000) 
THEATER_NUM NOT NULL NUMBER(38)     

*/
public class MovieDTO {

	private int mvNum;
	private String mvName;
	private String mvDirector;
	private String mvCast;
	private int theaterNum;
	
	public MovieDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getMvNum() {
		return mvNum;
	}

	public void setMvNum(int mvNum) {
		this.mvNum = mvNum;
	}

	public String getMvName() {
		return mvName;
	}

	public void setMvName(String mvName) {
		this.mvName = mvName;
	}

	public String getMvDirector() {
		return mvDirector;
	}

	public void setMvDirector(String mvDirector) {
		this.mvDirector = mvDirector;
	}

	public String getMvCast() {
		return mvCast;
	}

	public void setMvCast(String mvCast) {
		this.mvCast = mvCast;
	}

	public int getTheaterNum() {
		return theaterNum;
	}

	public void setTheaterNum(int theaterNum) {
		this.theaterNum = theaterNum;
	}

	
	
	
	
	
	
}
