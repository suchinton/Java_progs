import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.lang.reflect.Array;

class info{
    static String [] name = new String []{"Suchinton", "Megha", "Lucky", "Abhinav", "Wilson"};
    static String [] email = new String [] {"Suchinton.2001@gmail.com", "Megha.chak@gmail.com", "Lucky_man@yahoo.com", "Abhinav@gmail.com", "Wilson.smith445@gmail.com"};
    static byte [] id = {112,123,043,054,115};

    public static void main(String [] args){
        
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("| Suchinton (A2345920063)       |");
        System.out.println("|-------------------------------|");
        System.out.println("| Java prog to display 5 entries|");
        System.out.println("|-------------------------------|");
        
        System.out.println("\nName \t:: email \t:: id \n");

        for(String N:name)
        {
            System.out.println(N + " :: ");
        }

        for(int i=0; i<5; i++)
        {
            System.out.println(name[i] + " :: " + email[i] + " :: " + id[i]);
        }
    }
}
