import java.io.*;
import java.util.*;

class Matrix
{


	public static void main(String args[])
	{


		/*int[][] a = {{1,2,3},{4,5,6},{7,8,9}};

		for(int i=0; i<a.length; i++)
		{


			for(int j=0; j<a[0].length; j++)
			{


				System.out.print(a[i][j]+" ");		
	

			}		

			System.out.println();
		}  */


		int r=0, c=0, i=0, j=0;
		Scanner input = new Scanner(System.in);

		while(true)
		{

			System.out.print("Enter the number of rows:");
			r = input.nextInt();
			System.out.print("Enter the number of columns:");
			c = input.nextInt();
			if(r>0 && c>0)
			{
				break;
			}
			else
			{
				System.out.println("Invalid number, row and column values should be greater than Zero");
			}		

		}


		int a[][] = new int[r][c]; 

		System.out.println("\nnumber of rows:"+a.length);
		System.out.println("number of columns:"+a[0].length+"\n");

		for(i=0; i<r; i++)
		{

			for(j=0; j<c; j++)
			{

				System.out.print("Enter the value["+(i+1)+"]["+(j+1)+"]:");
				a[i][j] = input.nextInt();
		
			}		

		}


		System.out.println("\n"+r+"X"+c+" Matrix\n");

		for(i=0; i<r; i++)
		{

			for(j=0; j<c; j++)
			{

				System.out.print(a[i][j]+" ");

			}
			
			System.out.println();

		}	


	}


}