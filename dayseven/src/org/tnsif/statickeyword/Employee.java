package org.tnsif.statickeyword;

public class Employee {
	private int empid;
	private String empname;
	
	static String companyname="Sankhe";

	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}
	
	
}