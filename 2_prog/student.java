class student
{
    int id;
    String name;
    public static void main(String args[]) 
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        student suchi = new student();
        suchi.id = 768;
        suchi.name = "Suchinton";
        
        System.out.println(suchi.id);
        System.out.println(suchi.name);
    }
}