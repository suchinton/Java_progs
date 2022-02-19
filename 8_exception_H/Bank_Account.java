import java.text.Format;
import java.util.Scanner;

class check_Bal extends Exception
{
  static int [] Account_no = {1233, 1234, 2432, 4566, 5345 };
  static int [] Balance = {1233, 2344, 5444, 655, 7666};
  static String [] name = {"Suchinton", "Anurag", "Utkarsh", "Naman", "Megha"};

  check_Bal(String str)
  {
    super(str);
  }
  
  static void validate() throws check_Bal
  {

    //int [] Account_no = {1233, 1234, 2432, 4566, 5345 };
    //int [] Balance = {1233, 2344, 5444, 655, 7666};
    //String [] name = {"Suchinton", "Anurag", "Utkarsh", "Naman", "Megha"};
     
    for(int i=0; i<5; i++)
    {
      System.out.println("\nName: " + name[i] + " Accout_no: " + Account_no[i] + " Balance: " + Balance[i]);

      //System.out.println("Accout_no: " + Account_no[i]);
      //
      //System.out.println("Balance: " + Balance[i]);
      
      if(Balance[i] < 1000)  
        throw new check_Bal(" Insufficient Funds");  
      else  
        System.out.print("Balance Status:  Sufficient Balance");
      
      System.out.println("\n====================================================");
    } 
  }

}

public class Bank_Account
{
  //check_Bal bal;

  public static void main(String[] args) 
  {
    System.out.print("\033[H\033[2J"); 
    System.out.flush();
    System.out.println("| Suchinton (A2345920063)                               |");
    System.out.println("|-------------------------------------------------------|");
    System.out.println("| Java prog to implement User-Defined Exceptions        |");
    System.out.println("|-------------------------------------------------------|");
    
    try
    {
      check_Bal.validate();
    }
    
    catch(Exception e)
    {
      e.printStackTrace();
      //System.out.println("Balance Status: Caught an Exception: "+e);
    }   
  }
}