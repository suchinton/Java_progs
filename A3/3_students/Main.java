class Student
{
    String name;
    Student()
    {
        name = "Unknown";
    }
    Student(String str)
    {
        name = str;
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Student std1 = new Student("Suchjinton");
        Student std2 = new Student("Krishna");
        Student std3 = new Student();
        
        System.out.println("Studnet 1 Name : " + std1.name);
        System.out.println("Studnet 2 Name : " + std2.name);
        System.out.println("Studnet 3 Name : " + std3.name);
    }
}
