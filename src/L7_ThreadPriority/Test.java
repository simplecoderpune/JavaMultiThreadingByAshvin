/**
 *  Priority of thread is in the range  (1-10)
 * MIN_PRIORITY = 1
 * MAX_PRIORITY = 10
 * Default Priority of main Thread is always 5
 * Default Priority of all other thread is equal to the priority of its parent thread
 * Observe carefully
 */
package L7_ThreadPriority;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
class MyThread extends Thread
{
    public void run()
    {
                for(int i=0;i<5;i++)
            System.out.println(Thread.currentThread().getName());
    }
}
public class Test {
    public static void main(String args[])
    {
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
         MyThread t=new MyThread();
        System.out.println(t.getPriority());
    }
}

class A
{
    public static void main(String args[])
    {
        MyThread t1=new MyThread();
        t1.setPriority(10);   //Here we expect child thread first then main as its priority is higher but we didnt see this in O/P No problem sometime windows does not support THREAD PRIROITIES
        t1.start();
        for(int i=0;i<5;i++)
            System.out.println(Thread.currentThread().getName());
    }
}
