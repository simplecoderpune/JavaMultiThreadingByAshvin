/**
 * we can stop a thread by using Thread Class stop() method...
 * but it is not recommended to use Thread.stop() hence it is depreciated
 * 
 * 
 */
package LC4_StopThread;

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
        MyThread t=new MyThread();
        t.start();
        System.out.println("End of mainThread");
        t.stop();    //highly depreciated
    }
    
}
