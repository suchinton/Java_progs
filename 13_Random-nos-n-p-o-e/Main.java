import java.util.Scanner;
import java.util.Random;

class Main 
{
    public static void main(String[] args) 
    {
        int[] arr = new int[20];

        for (int i = 0; i < 20; i++) 
        {
            Random rd = new Random(); 
            arr[i] = rd.nextInt(-200,200);
            System.out.format("%2d )" , (i+1)); 
            if(arr[i] >= 0)
            {
                if(arr[i] % 2 == 0)
                    System.out.println(" The number is Positive Even : " + arr[i]);
                else
                    System.out.println(" The number is Positive Odd  : " + arr[i]);
            }
            else
            {
                System.out.println("The number is Negative       : " + arr[i]);
            }
        }
    }
}
