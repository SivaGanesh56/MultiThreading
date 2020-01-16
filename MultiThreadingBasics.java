package MultiThreading;
import java.util.*;

class A extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hiii");
            try
            {
                Thread.sleep(500);
            }
            catch (Exception e)
            {

            }
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello");
            try
            {
                Thread.sleep(500);
            }
            catch (Exception e)
            {

            }
        }
    }
}


public class MultiThreadingBasics
{
    public static void main(String[] args)
    {
        A obj1  = new A();
        B obj2  = new B();
        obj1.run();
        obj2.run();
    }
}