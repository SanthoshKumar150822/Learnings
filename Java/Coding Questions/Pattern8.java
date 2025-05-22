import java.io.*;
import java.util.*;

class Pattern8
{


	public static void main(String args[])
	{

		int z=5;
		for(int i=5; i>=1; i--)
		{
		
			for(int j=i; j<=5; j++)
			{
				
				System.out.print(z+" ");	
				z--;		

			}

			z=5;
			System.out.println();
		}


	}
		


}