import java.io.*;
import java.util.*;

public class PrimeNumber
{

	public static void main(String args[])
	{

		int num=0, i=1, j=0, count=0;
		String a = "[";
		Scanner input = new Scanner(System.in);

		while(true)
		{
			System.out.print("Enter a number:");
			num = input.nextInt();
			if(num<=1)
			{
				System.out.println("Invalid number!, enter a Positive number greater than One.");
			}
			else
			{
				break;
			}
		}

		for(i=1; i<=num; i++)
		{

			if(num%i==0)
			{
				if(i<num){a+=(i+", ");}
				else{a+=(i+"]");}
				count++;
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

		System.out.print(num+" is divisible by "+a+" in the range 1 to "+num);

	}

}
