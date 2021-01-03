/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LC3_DaemonThread;

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
            System.out.println(i);
        }
        try
        {
        Thread.sleep(2000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class Test {
    public static void main(String args[])
    {
        System.out.println("Main Thread Running");
        MyThread t1=new MyThread();
        t1.setDaemon(true);
        t1.start();
    }
    
}
