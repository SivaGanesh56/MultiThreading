package MultiThreading;
import java.*;
/// To run ur code in proper positions and check whether the thread is live or not

public class ThreadMethods
{
    public static void main(String[] args) throws Exception
    {
        Thread t1 = new Thread(()->
        {
            for(int i=0;i<5;i++) {
                System.out.println("Hi");
                try{
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        });
        Thread t2 = new Thread(()->
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("Hello");
                try{
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        });

        t1.start();
        try{Thread.sleep(10);} catch (Exception e){}
        t2.start();
        System.out.println("bye");
    }
}