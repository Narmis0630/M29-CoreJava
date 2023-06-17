package org.tnsif.superkeyword;

public class Tiger extends Animal {
	public String animalType="Tigerwild";
	public int noLegs=4;
	
	public Tiger() {
		
		super();
		
		System.out.println("Tiger class constructor child");
	}
	
	public void display()
	{
		super.display();
		
		System.out.println(super.animalType);
		System.out.println(super.noLegs);
		
		System.out.println();
		System.out.println("Animal Type"+animalType);
		System.out.println("No of Legs"+noLegs);
	}
	

//	@Override
//	public String toString() {
//		return "Tiger [animalType=" + animalType + ", noLegs=" + noLegs + "]";
//	}
	
	
}