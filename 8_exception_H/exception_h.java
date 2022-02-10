import java.util.Scanner;

public class exception_h 
{  
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        try 
        {   
            int number = scan.nextInt();
        }
    
        catch (Error e) 
        {
          System.out.println("Incorrect data type entry => " + e.getMessage());
        }
        
        finally 
        {
          System.out.println("This is the finally block");
        }
    }
}
