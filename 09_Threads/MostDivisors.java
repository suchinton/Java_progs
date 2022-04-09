import java.util.Scanner;

/* 10:  To find the integer in the range 1 to 10000 that has the largest number of divisors. 
Now write a program that uses multiple threads to solve the same problem, but for the range 1 to 100000 */

public class MostDivisors implements Runnable
{
   static int N;  
   static int maxDivisors = 1;
   static int numWithMax = 1;
   static int from;
   static int to;

   @Override
   synchronized public void run() 
   {
      for ( N = from;  N <= to;  N++ ) 
      {
   
         int D;
         int divisorCount;
         divisorCount = 0;
         for ( D = 1;  D <= N;  D++ ) 
         {
            if ( N % D == 0 )
               divisorCount++;
         }
      
         if (divisorCount > maxDivisors) 
         {
            maxDivisors = divisorCount;
            numWithMax = N;
         }
      }
        
   }

   public static void main(String[] args) 
   {

      Scanner scan = new Scanner(System.in);

      System.out.println("From : ");
      from = scan.nextInt();
      System.out.println("To   : ");
      to = scan.nextInt();

      System.out.println("Among integers between " + from +" and " + to);

      MostDivisors q1 = new MostDivisors();
      MostDivisors q2 = new MostDivisors();
      MostDivisors q3 = new MostDivisors();
      MostDivisors q4 = new MostDivisors();

      to = to*10;

      q1.from = 2;
      q1.to   = to/4;
      q2.from = to/4 + 1;
      q2.to   = to/2;
      q3.from = to/2 + 1;
      q3.to   = 3*to/4;
      q4.from = (3*to/4)+1;
      q4.to   = to; 
      
      Thread t1 = new Thread(q1);
      Thread t2 = new Thread(q2);
      Thread t3 = new Thread(q3);
      Thread t4 = new Thread(q4);

      t1.start();
      t2.start();
      t3.start();
      t4.start();
      
      System.out.println("The maximum number of divisors is " + maxDivisors);
      System.out.println("A number with " + maxDivisors + " divisors is " + numWithMax);
   }
}