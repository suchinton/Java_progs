import java.io.*;
import java.util.*;
import java.util.Scanner;

public class file_read_write
{
    public static void main(String[] args) throws Exception
    {
        System.out.print("\033[H\033[2J"); 
        System.out.flush();
        System.out.println("| Suchinton (A2345920063)                               |");
        System.out.println("|-------------------------------------------------------|");
        System.out.println("| Java prog to implement File Handeling                 |");
        System.out.println("|-------------------------------------------------------|");

        File File1 = new File("a1.txt");
        File File2 = new File("a2.txt");

        FileReader fr = null;
        FileWriter fw =null;

        Scanner input = new Scanner(System.in);


        System.out.println("Enter your text in the file : ");
        String data = input.nextLine();

        try 
        {
            fw = new FileWriter(File1); 
                fw.write(data);
                System.out.println("Successfully wrote to the File. 1");
                data = null;
            
            fw.close();
        } 

        finally
        {
            System.out.println("\n----------------------------------------------");
        }
        
        try
        {
            fr = new FileReader(File1);
            int ch;
            System.out.println("Contents of File. 1");
            while((ch = fr.read())!=-1)
            {
                System.out.print((char) ch);
            }
        }
        finally
        {
            System.out.println("\n----------------------------------------------");
        }

        try
        {
            fr = new FileReader(File1);
            fw = new FileWriter(File2);

            int ch;
            System.out.println("Copying from File 1");
            while((ch = fr.read())!=-1)
            {
                fw.write(ch);
            }

            System.out.println("written to File 2");
        }

        finally
        {
            System.out.println("\n----------------------------------------------");
            fw.close();
        }

        try
        {
            fr = new FileReader(File2);
            int ch;
            System.out.println("Contents of File. 2");
            while((ch = fr.read())!=-1)
            {
                System.out.print((char) ch);
            }
        }
        finally
        {
            System.out.println("\n----------------------------------------------");
            fr.close();
        }
    }
}
