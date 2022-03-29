/**
 * laptop
 */

interface laptop
{
    String keyboard = "QWERTY";
    abstract public void print();
    String res = "14 inch 1080p";
}

class Lenovo implements laptop 
{
    int price = 500;
    String proc = "i5-6th gen";
    public void print()
    {
        System.out.println("\nThis is a Lenovo laptop");
        System.out.println("It has a " + keyboard + " layout keyboard!!");
        System.out.println("it has an " + proc + " processor");
        System.out.println("it has an " + res + " disply");
        System.out.println("It costs $ " + price + "/-");
    }    
}

class Dell implements laptop 
{
    int price = 550;
    String proc = "i5-8th gen";
    public void print()
    {
        System.out.println("\nThis is a Dell laptop");
        System.out.println("It has a " + keyboard + " layout keyboard!!");
        System.out.println("it has an " + proc + " processor");
        System.out.println("it has an " + res + " disply");
        System.out.println("It costs $ " + price + "/-");
    }    
}

public class intrfce2
{
    public static void main(String[] args) 
    {
        System.out.print("\033[H\033[2J"); 
        System.out.flush();
        System.out.println("| Suchinton (A2345920063)                               |");
        System.out.println("|-------------------------------------------------------|");
        System.out.println("| Java prog to implement interfaces                     |");
        System.out.println("|-------------------------------------------------------|");

        Lenovo l1 = new Lenovo();
        l1.print();

        Dell D1 = new Dell();
        D1.print();
    }
}