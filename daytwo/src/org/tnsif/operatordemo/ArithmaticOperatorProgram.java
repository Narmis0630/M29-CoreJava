//program to demonstrate Arithmatic Operator
//(+,-,*,/,%)
package org.tnsif.operatordemo;
import java.util.Scanner;

public class ArithmaticOperatorProgram {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x and y:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("The Addition of two numbers:" +(x+y));
		System.out.println("The Substraction of two numbers:" +(x-y));
		System.out.println("The Multiplication of two numbers:" +(x*y));		
		System.out.println("The Divison of two numbers:" +(x/y));	
		System.out.println("The Modulo of two numbers:" +(x%y));
		


	}

}
