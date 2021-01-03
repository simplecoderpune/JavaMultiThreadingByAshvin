/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LA2_Synchronization;

/**
 *
 * @author DELL-PC
 */

class Display{
    public synchronized void wish(String name)
    {
            for(int i=0;i<10;i++)
            {
            System.out.print("Good Morning:");
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Exception");
            }
            System.out.println(name);
        }
    }
}
class MyThread extends Thread
{
    Display d;
    String name;
    MyThread(Display d,String name)
    {
        this.d=d;
        this.name=name;
    }
    public void run()
    {
        d.wish(name);
    }
}
public class Test {
    public static void main(String args[])
    {
        Display d=new Display();
        Thread t1=new MyThread(d,"Ashvin");
        Thread t2=new MyThread(d,"Supreet");
        t1.start();
        t2.start();
    }
}
