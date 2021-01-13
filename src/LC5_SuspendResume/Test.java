/**
 * A thread can suspend another thread by using suspend() method
 * and we can resume by using resume() method
 * 
 * It is highly not recommended to use suspend() and resume() thread 
 * 
 */
package LC5_SuspendResume;

/**
 *
 * @author DELL-PC
 */
class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Child Thread");
        }
    }
}
public class Test {
    public static void main(String args[])
    {
        MyThread t1=new MyThread();
        t1.start();
        System.out.println("End of main thread");
        t1.suspend();
        System.out.println("Suspended");
        System.out.println("Hey There");
        t1.resume();
        System.out.println("Resume");
    }
}
