package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("Enter song number");
		
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("Galliyan");
			break;
		case 2:
			System.out.println("calmdown");
			break;
		case 3:
			System.out.println("Om-shanti");
			break;
		default:
			System.out.println("Enter valid number");
		}
		
			
		
			
		

	}

}