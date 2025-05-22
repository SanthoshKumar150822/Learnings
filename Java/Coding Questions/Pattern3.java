import java.io.*;
import java.util.*;

class Pattern3
{

	public static void main(String args[])
	{
		int z=1;

		for(int i=5; i>=1; i--)
		{
			
			for(int j=i; j<=5; j++)
			{

				System.out.print(z+" ");
				z++;

			}
			
			System.out.println();
		}

	}

}