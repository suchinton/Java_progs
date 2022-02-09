//Write a Java program to solve quadratic equations (use if, else if and else). 

import java.util.Scanner;

public class quad_eq 
{

    public static void main(String[] args) 
    {
        System.out.print("\033[H\033[2J"); 
        System.out.flush();
        System.out.println("| Suchinton (A2345920063)                               |");
        System.out.println("|-------------------------------------------------------|");
        System.out.println("| Java prog to solve quad eqn using if, else if and else|");
        System.out.println("|-------------------------------------------------------|");
               
        int a, b, c;
        double desc ;
        double root1, root2 ;
        double realPart, imaginaryPart;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter coefficients : ");
        System.out.print("a : ");
        a = scan.nextInt();
        System.out.print("b : ");
        b = scan.nextInt();
        System.out.print("c : ");
        c = scan.nextInt(); 

        System.out.format("The quadratic equation: %d*x^2 + %d*x + %d = 0\n", a, b, c);
        
        desc = (b*b) - (4*a*c);
        
        if(desc > 1) 
        {
           System.out.println("both roots are real and different");

           root1=(-b+(int)Math.sqrt(desc))/2*a;
           root2=(-b-(int)Math.sqrt(desc))/2*a;
          
           System.out.println("Roots are = "+ root1 + ", "+ root2);
        } 
        else if(desc == 0) 
        {
           System.out.println("both roots are real and equal"); 

           root1=(-b+(int)Math.sqrt(desc))/2*a;
           root2 = root1; 

           System.out.println("Roots are = "+ root1+ ", "+ root2);
        } 
        else 
        {
          System.out.println("roots are complex and different");
          realPart = -b/(2*a);
          imaginaryPart=(int)Math.sqrt(desc)/(2*a);
 	      System.out.format("root1 = %d + i(%d)\n",
	      realPart, imaginaryPart);
	      System.out.format("root2 = %d - i(%d)\n",
	      realPart, imaginaryPart);
        }
    }
}

    
