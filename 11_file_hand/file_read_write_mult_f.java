import java.io.*;
import java.util.*;
import java.util.Scanner;

public class file_read_write_mult_f
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream b1 = new FileOutputStream("a1.txt");
        FileOutputStream b2 = new FileOutputStream("a2.txt");
        FileOutputStream b3 = new FileOutputStream("a3.txt");
        
        ByteArrayOutputStream f1 = new ByteArrayOutputStream();

        f1.write('S');
        f1.writeTo(b1);
        
        f1.writeTo(b2);
        f1.writeTo(b3);

        f1.flush();
    }
}
