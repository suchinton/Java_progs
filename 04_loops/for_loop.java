public class for_loop
{
    public static void main(String[] args) 
    {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("| Suchinton (A2345920063)                              |");
        System.out.println("|------------------------------------------------------|");
        System.out.println("| Java prog to display Right Triangle Character Pattern|");
        System.out.println("|------------------------------------------------------|");
        
        char Alphabet = 'A';
        for(int i= 0; i<9; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(Alphabet++);
            }
            Alphabet = 'A';
            System.out.print("\n");    
        }    
    }
}
