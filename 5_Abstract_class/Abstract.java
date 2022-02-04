import java.util.Scanner;

//Write a program on Abstract class having constructor, data member and methods

abstract class Info
{  
    String name;
    Byte age;
    Scanner input = new Scanner(System.in);
    
    Info()
    {
        System.out.print("Name : ");
        name = input.nextLine();

        System.out.print("Age : ");
        age = input.nextByte();
    }

    abstract void Show_info(); 
}

class Student extends Info
{
    int roll_no;
    String section;

    Student()
    {
        System.out.print("Section : ");
        section = input.next();

        System.out.print("Roll no : ");
        roll_no = input.nextInt();
    }

    void Show_info()
    {
        System.out.println("Name of Student : " + name);
        System.out.println("Age of Student  : " + age);
        System.out.println("Roll no         : " + roll_no);
        System.out.println("Section         : " + section);
    }  
}

class Abstract extends Student
{

    public static void main(String args[])
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("| Suchinton (A2345920063)                 |");
        System.out.println("|-----------------------------------------|");
        System.out.println("| Java prog to implement Abstract classes |");
        System.out.println("|-----------------------------------------|");

        Student obj = new Abstract();  
        obj.Show_info();  
    }  
}  