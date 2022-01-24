public class do_while_loop 
{
    public static void main(String[] args) 
    {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        int row=1;
        int column=1;
        int x;
        do
        {
            x=6;
            do{
                System.out.print("");
                x--;
            }while(x>=row);

            column=1;
            
            do
            {
                System.out.print(column+" ");
                column++;
            }while(column<=row);
        
            System.out.println(" ");
            row++;
        }while (row<=6);
    }
}
