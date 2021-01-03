/**
 * Runnable Interface has no Start Method Hence we use Thread Class Start() method
 * Now we pass runnable object to  thread class constructor so that it can run the correct run() method
 */
package L5_ImplementRunnableInterface;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
class MyRunnable implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child Thread");
        }
    }
}
public class Test {
    public static void main (String args[])
    {
        MyRunnable r=new MyRunnable();
        Thread t=new Thread(r);
        t.start();
        for(int i=0;i<10;i++)
            System.out.println("Main Thread");
    }
}
