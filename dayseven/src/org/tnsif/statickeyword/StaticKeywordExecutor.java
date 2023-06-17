package org.tnsif.statickeyword;

public class StaticKeywordExecutor {

	public static void main(String[] args) {
		System.out.println(Employee.companyname);
		Employee a=new Employee(1,"Nia");
		System.out.println(a);
		
		Employee b=new Employee(2,"Jia");
		System.out.println(b);
		
		Customer c=new Customer();
		System.out.println(c);
		
	}

}