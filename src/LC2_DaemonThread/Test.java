/**
 * Daemon Thread:- Daemon Threads are those thread which are running in the background and provides support to the main thread
 * For Example GC() runs in the background to provide support to classes
 * 

 */
package LC2_DaemonThread;

/**
 *
 * @author DELL-PC
 */

class MyThread extends Thread
        
{
    
}
public class Test {
    public static void main (String args[])
    {
        System.out.println(Thread.currentThread().isDaemon());
        try
        {
        Thread.currentThread().setDaemon(true);
        }
        catch(IllegalThreadStateException e)
        {
            System.out.println(e);
        }
        MyThread t=new MyThread();
        t.setDaemon(true);
        t.start();
        System.out.println(t.isDaemon());
        
    }
}
