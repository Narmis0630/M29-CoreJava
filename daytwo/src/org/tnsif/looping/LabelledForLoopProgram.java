// program to demonstrate on Label For Loop 
package org.tnsif.looping;
public class LabelledForLoopProgram {

	public static void main(String[] args) {
		//lable 
		outer:
			for (int i=1;i<=5;i++)
			{
				System.out.println();
				//lable 
				inner:
					for (int j=1;j<=5;j++)
					{
						System.out.print(j+" ");
						if(j==4)
							//it terminates
							break;
					}
			}

	}

}
