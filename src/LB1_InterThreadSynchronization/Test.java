/**
 *  wait()--> wait method present in the object class. it passes current executing thread in waiting state and releases lock from object now another thread comes and perform operation after that
 *  it notifies the thread then previous thread again starts execution.
 * notify()--> notify method also present in Object Class used to notify the waiting thread
 */
package LB1_InterThreadSynchronization;

/**
 *
 * @author DELL-PC
 */

class MyThread extends Thread
{
    int total=0;
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            total+=i;
        }
    }
}
public class Test {
    public static void main(String args[])
    {
        MyThread t=new MyThread();
        t.start();
        System.out.println(t.total); //If t will get the chance then it will execute first so answer will be 45 otherwise it wil be 0
    }
}
class MyThread2 extends Thread
{
    int total=0;
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            total+=i;
        }
    }
}
 class A {
    public static void main(String args[]) throws InterruptedException
    {
        MyThread2 t=new MyThread2();
        t.start();
        Thread.sleep(10000);                      // so one way is to wait for some n seconds let other thread calculat first but here we have problem suppose it needs only
         System.out.println(t.total);            // 6 nano seconds to complete but we are giving 10 second so it leads to wastage of time and reverse also true                                            
    }
}
class MyThread3 extends Thread
{
    int total=0;
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            total+=i;
        }
        
         ///  No one is here to notify that work is done at this point it has to execute 1 crore lines of code then it will ask main thread to start
        //// 1 crore lines of code ////
    }
}
 class B {
    public static void main(String args[]) throws InterruptedException
    {
        MyThread3 t=new MyThread3();
        t.start();
        t.join();                      // join will wait for thread to complete first then it will execute but we cant notify using ths method
         System.out.println(t.total);                                                   
    }
}
