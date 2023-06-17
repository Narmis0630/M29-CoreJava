package org.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		HDFCBank h=new HDFCBank();
		h.setCardno(45626854L);
		h.setCardtype("Debit-card");
		h.setCvv_no(101);
		h.setPinNo(000);
		
		System.out.println(h.getCardno());
		System.out.println(h.getCardtype());
		System.out.println(h.getCvv_no());
		System.out.println(h.getPinNo());

	}

}