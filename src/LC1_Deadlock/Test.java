/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LC1_Deadlock;

/**
 *
 * @author DELL-PC
 */
class A
{
    public synchronized void d1(B b)
    {
        System.out.println("Thread 1 starts execution of d1");
        try
        {
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Thread t1 trying to execute B's last");
        b.last();
    }
        public synchronized void last()
        {
            System.out.println("Inside A's Last");
        }
                
    
}
class B
{
    public synchronized void d2(A a)
    {
        System.out.println("Thread 2 starts execution of d2");
        try
        {
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Thread t1 trying to execute B's last");
        a.last();
    }
       public synchronized void last()
        {
            System.out.println("Inside B's Last");
        }
}
class MyThread extends Thread
{
    A a=new A();
    B b=new B();
    public void m1()
    {
        this.start();
        a.d1(b); // by main thread
    }
    public void run()
    {
        b.d2(a); //by t1 thread
    }
}
public class Test {
    public static void main(String args[])
    {
        MyThread t1=new MyThread();
        t1.m1();
    }
}
