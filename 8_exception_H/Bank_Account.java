import java.util.Scanner;

class check_Bal extends Exception
{
  static int [] Account_no = {1233       , 1234    , 2432     , 4566   , 5345 };
  static int [] Balance    = {1233       , 2344    , 5444     , 8655   , 666};
  static String [] name    = {"Suchinton",
                               "Anurag  ", 
                               "Utkarsh ", 
                               "Naman   ", 
                               "Megha   "};

  check_Bal(String str)
  {
    super(str);
  }
  
  static void validate() throws check_Bal
  {
    System.out.println("Name              Account_No          Balance");  
    for(int i=0; i<5; i++)
    {
      System.out.println(name[i] + "          " + Account_no[i] + "           " + Balance[i]);
      
      if(Balance[i] < 1000)  
        {
          check_Bal e = new check_Bal("Balance Status:  Insufficient Funds");  
          throw e;
        }
      else  
        System.out.println("Balance Status:  Sufficient Balance");
      
      System.out.println("--------------------------------------------------------");
    } 
  }

}

public class Bank_Account
{
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
    
    catch(check_Bal e)
    {
      e.printStackTrace();
    }   
  }
}