import java.util.Scanner;

public class pal 
{
    @Deprecated
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        
        StringBuilder new_name = new StringBuilder();

        new_name.append(name);
        new_name.reverse();

        String best_name = new_name.toString();

        System.out.println("OG name : " + name);
        System.out.println("Rev name: " + best_name);

        if (name.compareTo(best_name)!=0)
        {
            System.out.println("not a pal");
        }
        else
        {
            System.out.println("is a pal");
        }
    }
}
