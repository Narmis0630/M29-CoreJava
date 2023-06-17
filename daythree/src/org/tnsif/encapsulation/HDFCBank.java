package org.tnsif.encapsulation;

public class HDFCBank {
	
	private Long cardno;
	private String cardtype;
	private int cvv_no;
	private int pinNo;
	public Long getCardno() {
		return cardno;
	}
	public void setCardno(Long cardno) {
		this.cardno = cardno;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public int getCvv_no() {
		return cvv_no;
	}
	public void setCvv_no(int cvv_no) {
		this.cvv_no = cvv_no;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	@Override
	public String toString() {
		return "HDFCBank [cardno=" + cardno + ", cardtype=" + cardtype + ", cvv_no=" + cvv_no + ", pinNo=" + pinNo
				+ "]";
	}
	
	

}