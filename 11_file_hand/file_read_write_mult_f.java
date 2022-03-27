import java.io.*;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.Scanner;

public class file_read_write_mult_f
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);

        FileOutputStream b1 = new FileOutputStream("a1.txt");
        FileOutputStream b2 = new FileOutputStream("a2.txt");
        FileOutputStream b3 = new FileOutputStream("a3.txt");
        
        ByteArrayOutputStream f1 = new ByteArrayOutputStream();   

        //String data ="suchinton";
        System.out.println("enter data to be entered into File 1 : ");
        String data = input.nextLine();

        byte buf[] = data.getBytes();

        b1.write(buf);
        
        FileReader b4 = new FileReader("a1.txt");
        
        int ch;
        System.out.println("\nCopying from File 1");
        
        while((ch = b4.read())!=-1)
        {
            f1.write(ch);
        }

        f1.writeTo(b2);
        f1.writeTo(b3);

        System.out.println("\nwritten to File 2 and 3");
        
        System.out.println("\n----------------------------------------------");
        System.out.println("\nContents of File. 1");
        b4 = new FileReader("a1.txt");
        while((ch = b4.read())!=-1)
        {
            System.out.print((char) ch);
        }
        System.out.println("\n----------------------------------------------");

        System.out.println("Contents of File. 2");
        b4 = new FileReader("a2.txt");
        while((ch = b4.read())!=-1)
        {
            System.out.print((char) ch);
        }
        System.out.println("\n----------------------------------------------");

        System.out.println("Contents of File. 3");
        b4 = new FileReader("a3.txt");
        while((ch = b4.read())!=-1)
        {
            System.out.print((char) ch);
        }
        System.out.println("\n----------------------------------------------");

        f1.flush();
    }
}
