//program to demonstrate on user-input value
package org.tnsif.userinput;
import java.util.Scanner;

public class UserinputProgram {

	public static void main(String[] args) {
	//user-input
		System.out.println("Enter the salary: ");
		Scanner s=new Scanner(System.in);
		float salary=s.nextFloat();
		
		System.out.println("Enter the name: ");
		String name=s.next();
		s.nextLine();
		
		System.out.println("Enter the name1: ");
		String name1=s.nextLine();
		
		System.out.println("Enter the character: ");
		char ch=s.next().charAt(4);
		
		
		System.out.println("Enter the number: ");
		int a=s.nextInt();
		
		
		
		System.out.println("Salary is "+salary);
		System.out.println("name is "+name);
		System.out.println("name1 is "+name1);
		System.out.println("character is "+ch);
		System.out.println("Id number is "+a);
	}

}
