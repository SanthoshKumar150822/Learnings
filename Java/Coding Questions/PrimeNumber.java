import java.io.*;
import java.util.*;

public class PrimeNumber
{

	public static void main(String args[])
	{

		int num=0, i=1, j=0, count=0, flag=1;
		Scanner input = new Scanner(System.in);

		while(flag==1)
		{
			System.out.print("Enter a number:");
			num = input.nextInt();
			if(num<=1)
			{
				System.out.println("Invalid number!, enter a Positive number greater than One.");
			}
			else
			{
				flag++;
			}
		}

		int divisibleBy[] = new int[num];
		for(i=1; i<=num; i++)
		{

			if(num%i==0)
			{
				count++;
				divisibleBy[j]=i;
				j++;
			}		

		}

		if(count==2)
		{
			System.out.println(num+" is a prime number.");
		}
		else
		{
			System.out.println(num+" is not a prime number.");
		}

		System.out.print(num+" is divisible by ");

		for(i=0; i<j; i++)
		{
			System.out.print(divisibleBy[i]+", ");
		}
		System.out.print("in the range 1 to "+num);

	}

}