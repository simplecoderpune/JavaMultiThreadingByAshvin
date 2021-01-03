/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LB2_WaitNotify;

/**
 *
 * @author DELL-PC
 */

class MyThread extends Thread
{
    int total=0;
    public void run() 
    {
        synchronized(this)
        {
        for(int i=1;i<=10;i++)
        {
            total+=i;
        }
        this.notify();
        }
         /// 1 crore lines of code
        //// No need to wait for this much unnecessary code as we need output of above loop so notify() ////
    }
}
public class Test {
 synchronized public static void main(String args[]) throws InterruptedException
 {
     
     MyThread t=new MyThread();
     t.start();
     synchronized(t)
     {
     t.wait();
     }
     System.out.println(t.total);
 }
}
