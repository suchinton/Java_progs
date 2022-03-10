class mythread1 extends Thread
{
    public void run()
    {
        for(int i=0; i<5; i++)
            System.out.println("Thread 1 running : " + (i+1));
    }
}

class mythread2 extends Thread
{
    public void run()
    {
        for(int i=0; i<5; i++)
            System.out.println("Thread 2 running : " + (i+1));
    }
}

public class thread_test_1 
{
    public static void main(String[] args) 
    {
        mythread1 t1 = new mythread1();
        mythread2 t2 = new mythread2();

        t1.setPriority(10);
        t2.setPriority(5);

        t1.start();
        t2.start();
    }
}
