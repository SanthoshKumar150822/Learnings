import java.io.*;
import java.util.*;

public class ReverseTheString
{
	public static void main(String [] args)
	{
		String a = "", b = "", manual = "";

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string:");
		a = input.nextLine();
		System.out.print("Enter a string:");
		b = input.nextLine();

		String builtIn=new StringBuilder(a).reverse().toString();

		System.out.println("Reversed a string using builtIn method\n----------------------------");
		System.out.println("Original string:"+a+"\nReversed string:"+builtIn);
	
		for(int i=b.length()-1; i>=0; i--)
		{
			manual+=b.charAt(i);
		}

		System.out.println("\nReversed a string manually\n----------------------------");
		System.out.println("Original string:"+b+"\nReversed string:"+manual);
	

	}
}