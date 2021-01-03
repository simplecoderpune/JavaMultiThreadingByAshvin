/**
 * join()--> If a thread wants to wait until completing some other thread once that thread completed then it will execute...
 * If t1 wants to wait then till t2 completes..
 * t1 {
 *          t2.join()   //t1 will wait til t2 completes
 *    }
 * <<<------- Constructors----------->>>
 * public final void join()----> wait till fully completion
 * public final void join(long  ms)---> wait till this time period else start executing
 * public final void join(long ms,int ns)---> wait till this time  for ex-11ms 10ns(exact time)
 * 
 * During wait no one can interrupt hence we handle interrupt exception in join method
 */
package L9_Join;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("-Child Thread-");
        }
                    try{
            Thread.sleep(3000);
            }
            catch(InterruptedException e)
            {
                System.out.println("No Interruption allowed Kindly wait");
            }
                    System.out.println("Completed");
    }
}
public class Test {
    public static void main(String args[]) throws InterruptedException
    {
        Thread t1=new MyThread();
        t1.start();
        t1.join(2000);
             ///// t1.interrupt();  no interruption allowed
        for(int i=0;i<10;i++)
        {
            System.out.println("-MainThread-");
        }
    }
}
