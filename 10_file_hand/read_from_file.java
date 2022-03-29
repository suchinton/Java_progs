import java.io.*;
import java.util.*;

public class read_from_file
{
    public static void main(String[] args) throws Exception
    {
        System.out.print("\033[H\033[2J"); 
        System.out.flush();
        System.out.println("| Suchinton (A2345920063)                               |");
        System.out.println("|-------------------------------------------------------|");
        System.out.println("| Java prog to implement File Handeling                 |");
        System.out.println("|-------------------------------------------------------|");

        File inFile = new File("a1.txt");
        FileReader fr = null;

        try
        {
            fr = new FileReader(inFile);
            int ch;
            while((ch = fr.read())!=-1)
            {
                System.out.print((char) ch);
            }
        }
        finally
        {
            fr.close();
        }
    }
}
