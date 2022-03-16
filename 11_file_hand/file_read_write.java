import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file_read_write 
{
    public static void main(String[] args) 
    {
        File infile = new File("a1.txt");
        File ofile = new File("a2.txt");  
        
        FileReader fr = null;
        FileWriter fw = null;
        
        try
        {
            int ch;
            fr = new FileReader(infile);

            while((ch = fr.read()) != -1)
            {
                System.out.println((char)ch);
            }
            System.out.println();
        }

        catch(IOException e)
        {
            
        }

        try
        {
            fr = new FileReader(infile);
            fw = new FileWriter(ofile);
            int ch;
          
            while ((ch = fr.read()) != -1) 
            {
                fw.write(ch);
            }
        }

        catch(IOException e)
        {
        }
    
    }
}
