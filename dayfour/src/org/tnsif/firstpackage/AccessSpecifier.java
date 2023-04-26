package org.tnsif.firstpackage;

public class AccessSpecifier {

	public static void main(String[] args) {
		Base b=new Base();
		
		b.methodDefault();
		b.publicmethod();
		b.protectedmethod();
		
		System.out.println(b instanceof Base);

	}

}