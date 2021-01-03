/**
 * sleep()---> sleep is an object class native method.....
 * public static native void sleep(long millisecond)-----> legacy method of sleep
 * public static void sleep(long millisecond,int nanosecond) // Overloaded method
 * 
 */
package LA1_Sleep;

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
          System.out.println("Thread "+i);
          try
          {
          Thread.sleep(2000);
          }
          catch(InterruptedException e)
          {
              System.out.println("Ashvin");
          }
        }
    }
    
}
public class Test {
    public static void main(String args[])
    {
        Thread t=new MyThread();
        t.start();
        t.interrupt();
    }
}
