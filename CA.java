import java.util.Scanner;

class neg_age extends Exception
{
    static Scanner scan = new Scanner(System.in);
    neg_age(String str)
    {
        super(str);
    }

    static void check_age() throws neg_age
    {
        System.out.println("enter age : ");
        int age = scan.nextInt();

        if(age<0)
            {
                neg_age e = new neg_age("-ve Age entered !!");
                throw e;
            }
    }
}

class CA 
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String [] args)
    {
        String name = "suchinton";
        try
        {
            neg_age.check_age();
        }

        catch(neg_age e)
        {
            e.printStackTrace();
        }
    }
}