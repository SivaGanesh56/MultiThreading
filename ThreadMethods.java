package MultiThreading;
import java.*;
/// To run ur code in proper positions and check whether the thread is live or not

class xyz extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++) {
            System.out.println("Hiiii");
            try { Thread.sleep(500);} catch (Exception e) {}
        }
    }
}

class abc extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++) {
            System.out.println("Hello");
            try { Thread.sleep(500);} catch (Exception e) {}
        }
    }
}

public class ThreadMethods
{
    public static void main(String[] args) throws Exception{
        xyz o1 = new xyz();
        abc o2 = new abc();
        o1.start();
        System.out.println(o1.isAlive());
        o2.start();
        o1.join();
        o2.join();

    }
}