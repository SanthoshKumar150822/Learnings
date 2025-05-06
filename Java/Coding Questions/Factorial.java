import java.io.*;
import java.util.*;

public class Factorial
{

	public static void main(String args[])
	{
		int i=1, num=0, fact=1, flag=0;
		Scanner input = new Scanner(System.in);
		while(flag==0)
		{
			System.out.print("Enter a number:");
			num = input.nextInt();
			if(num>=0){ flag++; }
			else{ System.out.println("Invalid number!, enter a Positive number.");}
		}
		for(i=1; i<=num; i++)
		{
			fact*=i;
		}

		System.out.println("Factorial of "+num+" is "+fact);
	}

}
