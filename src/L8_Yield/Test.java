/**
 * yield()---> Thread class yield method is used to pause the current thread execution and give time to waiting thread having same priority, and the current thread goes in waiting state
 * when its turn will come again it is decided by Thread scheduler.... 
 */
package L8_Yield;

/**
 *
 * @author DELL-PC
 */
class MyThread2 extends Thread{
    public void run()
    {
        
        for(int i=0;i<10;i++)
        {
            System.out.println("Child Thread2");
            Thread.yield();   //THis yield method pauses the current execution and gave chance to the new Thread
        }
    }
}
class MyThread extends Thread
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
    public static void main(String args[])
    {
        Thread t1=new MyThread2();
        t1.start();
        Thread t=new MyThread();
        t.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
