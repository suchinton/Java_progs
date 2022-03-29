import java.util.Scanner;

public class stack
{
    static int arr[] = new int[15];
    static byte size;

    static Scanner scan = new Scanner(System.in);

    stack()
    {
        arr = null;
        size = 0;
    }

    static void pop()
    {
        if(arr == null || size == 0)
            System.out.println("Stack is empty please push elements in first ");
        else
        {
            arr[size] = 0;
            size--;
        }

        display();
    }

    static void push()
    {
        System.out.print("Enter element : ");
        arr[size] = scan.nextInt();
        size++;
    }

    static void display()
    {
        if(arr == null || size == 0)
            System.out.println("Stack is empty please push elements in first ");
        else
        {
            for(int i = size-1; i>=0; i--)
            System.out.println("| " + arr[i] + " |");
        }    
    }

    public static void main(String[] args) 
    {
        char ans = 'y'; 
        int op;
        do
        {
            System.out.print("\n1)Push \n2)Pop \n3)Display \nOption : ");
            op = scan.nextInt();

            switch(op)
            {
                case 1:
                        push();
                        break;
                case 2:
                        pop();
                        break;
                case 3:
                        display();
                        break;
                default :
                        System.out.println("Invalid option, Try again!");
            }
            System.out.println("========================================");
            System.out.print("Do you wish to continue? : ");
            ans = scan.next().charAt(0);
        }while(ans != 'n');
        display();
    }
}