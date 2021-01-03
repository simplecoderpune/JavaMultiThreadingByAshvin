/**
 * so if there are two different objects and different threads are running so no need of synchronization even if we are running the synchronized method on it it will give
 * an irregular output
 * 
 *           <-----------------------  Class Level Locks ----------------------------------------------->
 *           for getting the class level lock we need the static synchronized keyword before mehtod
 *           static synchronized keyword gets the class level lock and gives regular output
 * 
 */
package LA4_StaticSynchronization;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
class Display
{
    public static synchronized void display(String s)
    {
        for(int i=0;i<10;i++)
        {    
        System.out.print("Good Morning");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println(":"+s);
        }
    }
}
class MyThread extends Thread
{
    Display d;
    String name;
    MyThread(Display d,String n)
    {
        this.d=d;
        this.name=n;
    }
    public void run()
    {
        d.display(name);
    }
}
public class Test {
    public static void main(String args[])
    {
    Display d1=new Display();
    Display d2=new Display();
    MyThread tt=new MyThread(d1,"Dhoni");
    MyThread ts=new MyThread(d2,"Yuvraj");
    Thread tl=new MyThread(d1,"Raj");
    tt.start();
    ts.start();
    }
}
