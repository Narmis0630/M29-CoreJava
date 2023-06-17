package org.tnsif.thiskeyworddemo;

public class ThisKeywordExample {
	private int cvvno;
	private int atmno;
	
	
	public ThisKeywordExample(int cvvno, int atmno) {
		super();
		this.cvvno = cvvno;
		this.atmno = atmno;
	}
	
	public void print() {
		System.out.println("CVV no is : "+cvvno + " ATM card no is "+atmno );
	}
	
	
	

}