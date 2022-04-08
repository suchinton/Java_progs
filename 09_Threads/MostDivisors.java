/* 10:  To find the integer in the range 1 to 10000 that has the largest number of divisors. 
Now write a program that uses multiple threads to solve the same problem, but for the range 1 to 100000 */

public class MostDivisors 
{
    
   int N;            // One of the integers whose divisors we have to count.
   int maxDivisors = 1 ;  // Maximum number of divisors seen so far.
   int numWithMax = 1;   // A value of N that had the given number of divisors.
   int D;  // A number to be tested to see if it's a divisor of N.
   int divisorCount = 0 ;  // Number of divisors of N.

   public static void main(String[] args) 
   {      
      for ( N = 2;  N <= 10000;  N++ ) 
      {
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

      System.out.println("Among integers between 1 and 10000,");
      System.out.println("The maximum number of divisors is " + maxDivisors);
      System.out.println("A number with " + maxDivisors + " divisors is " + numWithMax);

      thread1 t1 = new thread1();

      Thread tobj1 = new Thread(t1);

        tobj1.start();
   } 
 }


class thread1 extends MostDivisors implements Runnable
{
   public void run()
   {
      for ( N = 2;  N <= 10000;  N++ ) 
      {
         int D;  // A number to be tested to see if it's a divisor of N.
         int divisorCount;  // Number of divisors of N.
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
}