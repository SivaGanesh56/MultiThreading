package MultiThreading;
import java.*;
/// Achieving thread by Runnable interface and lambda epxression to avoid code redundancy

interface x
{
    void show(String msg);
}
public class LambadUsage
{
    public static void main(String[] args)
    {
        Runnable obj1 = ()->
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
        };

        Thread t1= new Thread(obj1);    /// One Type
        Thread t2 = new Thread(()->                                    /// Another type
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
        });

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
