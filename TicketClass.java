package BussinessLogic;

public class TicketClass {
	private int ticketId;
	private String customerName;
	private String issueType;
	public TicketClass(int ticketId, String customerName, String issueType) {
		this.ticketId = ticketId;
		this.customerName = customerName;
		this.issueType = issueType;
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	@Override
	public String toString() {
		return "TicketClass [ticketId=" + ticketId + ", customerName=" + customerName + ", issueType=" + issueType
				+ "]";
	}
	
	
	

}
