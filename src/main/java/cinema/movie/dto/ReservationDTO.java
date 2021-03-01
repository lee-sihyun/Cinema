package cinema.movie.dto;
/*이름            널?       유형             
------------- -------- -------------- 
RE_NUM        NOT NULL NUMBER(38)     
MV_NUM                 NUMBER(38)     
USER_ID                VARCHAR2(1000) 
MV_NAME                VARCHAR2(1000) 
TICKET_AMOUNT          NUMBER(38)     
SEAT                   NUMBER(38)     
RE_DATE                DATE           
RE_TIME                VARCHAR2(1000) 
PAY                    VARCHAR2(1000) //결제여부
PRICE                  NUMBER         //가격
MV_DIRECTOR            VARCHAR2(1000) 
MV_CAST                VARCHAR2(1000)  
     
*/
public class ReservationDTO {

	
	private int reNum;
	private int mvNum;
	private String userId;
	private String mvName;
	private int ticketAmount;
	private int seat;
	private String reDate;
	private String reTime;
	private String pay;
	private int price;
	private String mvDirector;
	private String mvCast;

	
	public ReservationDTO() {
		// TODO Auto-generated constructor stub
	}


	public int getReNum() {
		return reNum;
	}


	public void setReNum(int reNum) {
		this.reNum = reNum;
	}


	public int getMvNum() {
		return mvNum;
	}


	public void setMvNum(int mvNum) {
		this.mvNum = mvNum;
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


	public String getReDate() {
		return reDate;
	}


	public void setReDate(String reDate) {
		this.reDate = reDate;
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


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
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

	
	
	
	
}
