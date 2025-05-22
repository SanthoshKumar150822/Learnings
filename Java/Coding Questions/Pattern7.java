import java.io.*;
import java.util.*;

class Pattern7
{


	public static void main(String args[])
	{

		int z=5, y=5;
		for(int i=1; i<=5; i++)
		{
		
			for(int j=1; j<=z; j++)
			{

				System.out.print(y+" ");
				y--;
				
			}
			
			System.out.println();
			y=5;
			z--;

		}	

	}


}