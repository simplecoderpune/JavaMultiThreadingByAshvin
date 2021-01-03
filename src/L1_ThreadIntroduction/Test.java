/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L1_ThreadIntroduction;

/**
 * MultiThreading:- When more than one independent units of code are executing simultaneously then it is called MultiThreading....
 * Thread:- A small unit of executable code called Thread.
 * Every Java Program has a main Thread and Main Thread calls another thread
 *
 */

class MyThread1 extends Thread
{
    public void run()
    {

        for(int i=0;i<10;i++)
        {
            System.out.println("Child Thread");
        }
    }
}
class MyThread2 extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child2 Thread");
        }
    }
}
public class Test {
    public static void main(String args[])
    {
        Thread t=new MyThread1();
        t.run();
        for(int i=0;i<10;i++)
        {
            System.out.println("Main Thread");
        }
    }
    
}
