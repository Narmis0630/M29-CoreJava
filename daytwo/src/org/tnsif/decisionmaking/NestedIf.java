package org.tnsif.decisionmaking;

public class NestedIf {

	public static void main(String[] args) {
		int x=11;
		if (x>2) {
			if (x<10) {
				System.out.println("Number is between 3 and 10");
			}
			else {
				System.out.println("Number is not between 3 and 10");
			}
		}
		else {
			System.out.println("No is not positive");
		}
		

	}

}