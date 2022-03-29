import java.util.Scanner;

//Create an interface named polygon.   
//The interface contains an abstract method getarea().
//Implement the polygon using the Circle and Rectangle class And,
// provides the implementation of the getarea() method also.

/**
 * polygon
 */

interface polygon 
{
    abstract public void getarea();
    Scanner scan = new Scanner(System.in);    
}

class Circle implements polygon
{
    int radius;
    Circle()
    {
        System.out.print("Radius = ");
        radius = scan.nextInt();
    }
    public void getarea()
    {
        System.out.println("Area of Circle is " + (3.14*radius*radius));
    }
}

class Rectangle implements polygon
{
    int l,b;
    Rectangle()
    {
        System.out.print("L = ");
        l = scan.nextInt();
        System.out.print("B = ");
        b = scan.nextInt();
    }
    public void getarea() 
    {
        System.out.println("Area of Rectangle is " + (l*b));
    }
}

public class intrfce1 
{
    public static void main(String[] args) 
    {
        System.out.print("\033[H\033[2J"); 
        System.out.flush();
        System.out.println("| Suchinton (A2345920063)                               |");
        System.out.println("|-------------------------------------------------------|");
        System.out.println("| Java prog to implement interfaces                     |");
        System.out.println("|-------------------------------------------------------|");

        System.out.println("1) Area of Circle");    
        System.out.println("2) Area of Rectangle");

        Scanner scan = new Scanner(System.in);

        int ans = scan.nextInt();
        
        switch (ans) {
            case 1:
                Circle C1 = new Circle();
                C1.getarea();
                break;
            case 2:
                Rectangle R1 = new Rectangle();
                R1.getarea();
                break;
            default:
                System.out.println("Invalid Option!");
                break;
        }
    }
}
