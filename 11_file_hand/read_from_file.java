import java.io.*;
import java.util.*;

public class read_from_file
{
    public static void main(String[] args) 
    {
        File inFile = new File("a1.txt");
        FileReader fr = null;

        try
        {
            fr = new FileReader(inFile);
            int ch;
            while(ch = fr.read()!=-1)
            {
                System.out.println("char ch);
            }
        }
        finally
        {
            fr.close();
        }
    }
}
