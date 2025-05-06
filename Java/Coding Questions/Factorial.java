import java.io.*;
import java.util.*;

public class Factorial
{

	public static void main(String args[])
	{
		int i=1, num=0, fact=1;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number:");
		num = input.nextInt();
		for(i=1; i<=num; i++)
		{
			fact*=i;
		}

		System.out.println("Factorial of "+num+" is "+fact);
	}

}