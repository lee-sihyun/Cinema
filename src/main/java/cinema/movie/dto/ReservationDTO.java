package cinema.movie.dto;
/*이름            널?       유형             
------------- -------- -------------- 
RE_NUM        NOT NULL NUMBER(38)     
USER_ID       NOT NULL VARCHAR2(1000) 
MV_NAME       NOT NULL VARCHAR2(1000) 
TICKET_AMOUNT NOT NULL NUMBER(38)     
SEAT          NOT NULL NUMBER(38)     
RE_DATE       NOT NULL DATE           
RE_TIME       NOT NULL VARCHAR2(20)   
PAY           NOT NULL VARCHAR2(20)   
MV_NUM        NOT NULL NUMBER(38)     
*/
public class ReservationDTO {

	
	private int reNum;
	private String userId;
	private String mvName;
	private int ticketAmount;
	private int seat;
	private String reDate;
	private String reTime;
	private String pay;
	private int mvNum;
	
	public ReservationDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getReNum() {
		return reNum;
	}

	public void setReNum(int reNum) {
		this.reNum = reNum;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMvName() {
		return mvName;
	}

	public void setMvName(String mvName) {
		this.mvName = mvName;
	}

	public int getTicketAmount() {
		return ticketAmount;
	}

	public void setTicketAmount(int ticketAmount) {
		this.ticketAmount = ticketAmount;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public String getReDAte() {
		return reDate;
	}

	public void setReDAte(String reDAte) {
		this.reDate = reDAte;
	}

	public String getReTime() {
		return reTime;
	}

	public void setReTime(String reTime) {
		this.reTime = reTime;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public int getMvNum() {
		return mvNum;
	}

	public void setMvNum(int mvNum) {
		this.mvNum = mvNum;
	}

	
	
	
	
}
