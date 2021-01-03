/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L4_OverrideStartMethod;

/**
 * Very Interesting concep is to override start() method what will happen?????
 * It will be a simple method execution no Thread will be created and no run() method will be called
 */

class MyThread extends Thread
{
    public void start()
    {
        
        System.out.println("Overriden start()");         //Not recommended to override start method as it doesn't contain code to schedule the thread
        
    }
    
    public void run()
    {
        System.out.println("RUN");
    }
}
public class Test {
    public static void main(String args[])
    {
        MyThread t=new MyThread();
        t.start();
        System.out.println("Main Thread");
    }
}


class MyThread2 extends Thread
{
    public void start()
    {
        super.start();    //Now it will call hread class start method so it will schedule the thread.
        System.out.println("Overriden start()");     
        
    }
    
    public void run()
    {
        System.out.println("RUN");
    }
}
class B {
    public static void main(String args[])
    {
        MyThread2 t=new MyThread2();
        t.start();
        System.out.println("Main Thread");
    }
}

/*   ____________________________thread Cycle_____________________________________________________*/

/*

Thread t=new Thread()
New                      Ready      Thread Schedular      Running            run()
Born-------------------->Runnable------------------------>       ----------------------------->Dead
        t.start();                   schedules Processor                   completes

*/