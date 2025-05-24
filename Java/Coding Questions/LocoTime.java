import java.io.*;
import java.util.*;
import java.lang.*;

class LocoTime
{


	public static void main(String args[])
	{

		//Railway time (24-hour) format as Hr:Min:Sec, ranging from 00:00:00 to 23:59:59.
		
		int hr=0, min=0, sec=0;
		Scanner input = new Scanner(System.in);
		userInput(hr, min, sec, input);		

	}


	public static void userInput(int hr, int min, int sec, Scanner input)
	{


		while(true)
		{

			System.out.print("Enter Hour:");
			hr= input.nextInt();
			System.out.print("Enter Minute:");
			min = input.nextInt();
			System.out.print("Enter Second:");
			sec = input.nextInt();
			System.out.println();

			if((hr>-1 && hr<24) && (min>-1 && min<60) && (sec>-1 && sec<60))
			{

				break;
			
			}
			else
			{

				System.out.println("Invalid values!, Enter values in the range Hr(0-23), Min(0-59), Sec(0-59).");

			}

		}
		
		printLocoMotiveTime(hr, min, sec);

	}


	public static void printLocoMotiveTime(int hr, int min, int sec)
	{


		while(true)
		{

			System.out.printf("\r%02d:%02d:%02d", hr, min, sec);

			try
			{ 
				
				Thread.sleep(1000); 

			}
			catch(Exception e)
			{ 

				System.out.println("\nClock Interrupted."); 
				break; 
			}

			System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b");


			sec++;

			if(sec>59)
			{ 

				sec=0; 
				min++; 

			}

			if(min>59)
			{ 

				min=0; 
				hr++; 

			}

			if(hr>23)
			{ 
				
				hr=0;
 
			}

			


		}


	}



}
