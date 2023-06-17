package org.tnsif.hierarchical;

public class HierarcgicalExecutor {

	public static void main(String[] args) {
		
		SnowCone s=new SnowCone(12,"Mi");
		Tiramisu t=new Tiramisu(13,"Realme");
		
		s.setModelName("Sankhe");
		s.setOwnerName("Simran");
		
		System.out.println(s);
		System.out.println(t);
		

	}

}