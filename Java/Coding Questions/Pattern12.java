import java.io.*;
import java.util.*;

class Pattern12
{


	public static void main(String args[])
	{


		int i=1, j=1;
		
		for(i=5; i>=1; i--)
		{

			for(j=i; j<=5; j++)
			{
			
				System.out.print("* ");

			}
			
			System.out.println();		

		}

		for(i=1; i<=5; i++)
		{


			for(j=i; j<=5; j++)
			{


				System.out.print("* ");			


			}


			System.out.println();

		}	


	}


}