class thread1 implements Runnable
{
    public void run()
    {
        for(int i=0; i<5; i++)
            System.out.println("Thread 1 running : " + (i+1));
    }
}

class thread2 implements Runnable
{
    public void run()
    {
        for(int i=0; i<5; i++)
            System.out.println("Thread 2 running : " + (i+1));
    }
}

public class thread_test_2
{
    public static void main(String[] args) 
    {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        
        Thread tobj1 = new Thread(t1);
        Thread tobj2 = new Thread(t2);

        tobj1.start();
        tobj2.start();
    }
}
