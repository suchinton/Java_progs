import java.io.*;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.Scanner;

public class file_read_write_mult_f
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); 
        System.out.flush();
        System.out.println("| Suchinton (A2345920063)                               |");
        System.out.println("|-------------------------------------------------------|");
        System.out.println("| Java prog to implement File Handeling                 |");
        System.out.println("|-------------------------------------------------------|");

        FileOutputStream b1 = new FileOutputStream("a1.txt");
        FileOutputStream b2 = new FileOutputStream("a2.txt");
        FileOutputStream b3 = new FileOutputStream("a3.txt");
        
        ByteArrayOutputStream f1 = new ByteArrayOutputStream();

        System.out.print("enter data to be entered into File 1 : ");
        String data = input.nextLine();

        byte buf[] = data.getBytes();

        b1.write(buf);
        
        FileReader fr = new FileReader("a1.txt");
        
        int ch;
        System.out.println("\nCopying from File 1");
        
        while((ch = fr.read())!=-1)
        {
            f1.write(ch);
        }

        f1.writeTo(b2);
        f1.writeTo(b3);

        System.out.println("\nwritten to File 2 and 3");

        System.out.println("\n----------------------------------------------");
        System.out.println("\nContents of File. 1");
        fr = new FileReader("a1.txt");
        while((ch = fr.read())!=-1)
        {
            System.out.print((char) ch);
        }
        System.out.println("\n----------------------------------------------");

        System.out.println("Contents of File. 2");
        fr = new FileReader("a2.txt");
        while((ch = fr.read())!=-1)
        {
            System.out.print((char) ch);
        }
        System.out.println("\n----------------------------------------------");

        System.out.println("Contents of File. 3");
        fr = new FileReader("a3.txt");
        while((ch = fr.read())!=-1)
        {
            System.out.print((char) ch);
        }
        System.out.println("\n----------------------------------------------");

        f1.flush();
        b1.close();
        b2.close();
        b3.close();
    }
}
