/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L9_Join2;

/**
 *
 * @author DELL-PC
 */
class MyThread extends Thread
{
    static Thread mt;
    public void run()
{
   for(int i=0;i<10;i++)
   {
       System.out.println("Child Thread");
   }
   try
   {
     mt.join();
   }
   catch(InterruptedException e)
   {
       System.out.println("Interrupt not allowed");
   }
}
}
public class Test{
    static Thread mt;
public static void main(String args[]) throws InterruptedException
{
    Thread.currentThread().join();
    mt=Thread.currentThread();
      Thread t=new MyThread();
    for(int i=0;i<10;i++)
    {
        System.out.println("Main Thread");
    }
    Thread.sleep(3000);
    
}
}
