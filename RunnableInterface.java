package MultiThreading;
import java.*;
/// Achieving thread by Runnable interface


class Aa implements Runnable         ///// class A extends B implements Runnable------------> MultiInheritance
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

class Bb implements Runnable         ///// class B extends A implements Runnable------------> MultiInheritance
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

public class RunnableInterface
{
    public static void main(String[] args)
    {
        Runnable obj1 = new Aa();
        Runnable obj2 = new Bb();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try
        {
            Thread.sleep(10);
        }
        catch (Exception e)
        {

        }
        t2.start();
    }
}
