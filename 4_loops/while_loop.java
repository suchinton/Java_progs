public class while_loop {
    public static void main(String[] args) 
    {

        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.println("| Suchinton (A2345920063)                                     |");
        System.out.println("|-------------------------------------------------------------|");
        System.out.println("| Java prog to display a pyramid of stars using while loops   |");
        System.out.println("|-------------------------------------------------------------|");

        
        int i, j, row=6;   
        for(i=0; i<row; i++)   
        {   
            for(j=0; j<=i; j++)   
            {  
                System.out.print("* ");   
            }   
            System.out.println();
        }   
    }
}
