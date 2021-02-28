package cinema.movie.dto;

/*이름       널?       유형         
-------- -------- ---------- 
SEAT_NUM NOT NULL NUMBER(38) 
SC_NUM            NUMBER(38) 
SEATS             NUMBER     
  */
public class SeatDTO {

	private int seatNum;
	private int scNum;
	private int seats;

	public SeatDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}

	public int getScNum() {
		return scNum;
	}

	public void setScNum(int scNum) {
		this.scNum = scNum;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	
	
	
}
