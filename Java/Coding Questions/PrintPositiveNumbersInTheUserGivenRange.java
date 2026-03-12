import java.util.Scanner;

class PrintPositiveNumbersInTheUserGivenRange
{
    
    public static void main(String args[])
    {
        //Declaring variables.
        int i, start, stop;
        
        //Scanner object "input" to get input values from the user.
        Scanner input = new Scanner(System.in);
        
        //Logic to check start>0 and stop>start.
        while(true)
        {
            System.out.print("Enter the start value:");
            start = input.nextInt();
            
            if(start>0)
            {
                while(true)
                {
                    System.out.print("Enter the stop value:");
                    stop = input.nextInt();
                
                    if(stop>start)
                    {
                       break; 
                    }
                    else
                    {
                        System.out.println("Stop value should be greater than Start(Stop>Start).");   
                    }
                }
                
                break;
            }
            else
            {
               System.out.println("Start value should be greater than Zero(Start>0)."); 
            }
        }
        
        
        //Print positive numbers in the given range
        for(i=start; i<=stop; i++)
        {
            System.out.print(i);
            
            //Print a comma separator for every element and ensure no trailing comma after the final value.
            if(i<stop)
            {
                System.out.print(", ");
            }
        }
        
    }
    
}