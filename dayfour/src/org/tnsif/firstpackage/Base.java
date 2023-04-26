package org.tnsif.firstpackage;

public class Base {
	int var=10;
	public String var_public="John";
	private int var_private=120;
	protected float var_protected=1520.25f;
	
	void methodDefault() {
		System.out.println("Default access method "+var);
	}
	
	public void publicmethod() {
		System.out.println("Public access method "+var_public);
	}
	
	private void privatemethod() {
		System.out.println("Private access method "+var_private);
	}
	
	protected void protectedmethod() {
		System.out.println("Protected access method "+var_protected);
	}
}