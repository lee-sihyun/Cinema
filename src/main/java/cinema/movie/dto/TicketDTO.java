package cinema.movie.dto;
/*TICKET_NUM  NOT NULL NUMBER(38)     
PAY_NUM     NOT NULL NUMBER(38)     
MV_NAME     NOT NULL VARCHAR2(1000) 
MV_CAST     NOT NULL VARCHAR2(1000) 
MV_DIRECTOR NOT NULL VARCHAR2(1000) 
RE_NUM      NOT NULL NUMBER(38)     
*/

public class TicketDTO {

	
	private int ticketNum;
	private int payNum;
	private String mvName;
	private String mvCast;
	private String mvDirector;
	private int reNum;
	
	public TicketDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getTicketNum() {
		return ticketNum;
	}

	public void setTicketNum(int ticketNum) {
		this.ticketNum = ticketNum;
	}

	public int getPayNum() {
		return payNum;
	}

	public void setPayNum(int payNum) {
		this.payNum = payNum;
	}

	public String getMvName() {
		return mvName;
	}

	public void setMvName(String mvName) {
		this.mvName = mvName;
	}

	public String getMvCast() {
		return mvCast;
	}

	public void setMvCast(String mvCast) {
		this.mvCast = mvCast;
	}

	public String getMvDirector() {
		return mvDirector;
	}

	public void setMvDirector(String mvDirector) {
		this.mvDirector = mvDirector;
	}

	public int getReNum() {
		return reNum;
	}

	public void setReNum(int reNum) {
		this.reNum = reNum;
	}
	
	
}
