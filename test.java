import java.util.Scanner;

class test
{  
    static Scanner scan = new Scanner(System.in);  
    public static void main(String args[])
    {  
        System.out.println("Enter your string : ");
        String str = scan.nextLine();
        
        StringBuffer newstr = new StringBuffer(str);
        String revstr = newstr.reverse().toString();

        System.out.println("Rev name : " + revstr);

        if(str.contentEquals(revstr)==true)
            System.out.println("It is a pallendrome");
        else 
            System.out.println("Not a pallindrome");
    }  
} 