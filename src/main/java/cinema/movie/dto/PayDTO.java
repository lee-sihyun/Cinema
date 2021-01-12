package cinema.movie.dto;
/*
 이름            널?       유형             
------------- -------- -------------- 
PAY_NUM       NOT NULL NUMBER(38)     
USER_ID       NOT NULL VARCHAR2(1000) 
PAY_DATE      NOT NULL DATE           
TICKET_AMOUNT NOT NULL NUMBER(38)     
PRICE         NOT NULL NUMBER(38)     
RE_NUM        NOT NULL NUMBER(38)     
*/
public class PayDTO {

	private int payNum;
	private String userId;
	private String payDate;
	private int ticketAmount;
	private int price;
	private int reNum;
	
	public PayDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getPayNum() {
		return payNum;
	}

	public void setPayNum(int payNum) {
		this.payNum = payNum;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPayDate() {
		return payDate;
	}

	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public int getTicketAmount() {
		return ticketAmount;
	}

	public void setTicketAmount(int ticketAmount) {
		this.ticketAmount = ticketAmount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getReNum() {
		return reNum;
	}

	public void setReNum(int reNum) {
		this.reNum = reNum;
	}

	


	
	
}
