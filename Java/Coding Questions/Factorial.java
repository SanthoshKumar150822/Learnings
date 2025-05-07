import java.io.*;
import java.util.*;

public class Factorial
{

	public static void main(String args[])
	{
		int i=1, num=0, fact=1;
		String a = "";
		Scanner input = new Scanner(System.in);

		while(true)
		{
			System.out.print("Enter a number:");
			num = input.nextInt();
			if(num>=0){ break;}
			else{ System.out.println("Invalid number!, enter a Positive number.");}
		}

		for(i=num; i>=1; i--)	//for(i=1; i<=num; i++)
		{
			fact*=i;
			if(i>1){a+=(i+"x");}
			else{a+=i;}
		}

		System.out.println("Factorial of "+num+" is "+fact);
		System.out.print(num+"! ("+ a +") is "+ fact);

	}

}
