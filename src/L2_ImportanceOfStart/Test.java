/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L2_ImportanceOfStart;

/**
 * start() method ---> start method is used to initialize the thread operations means all necessary activities of Thread is performed then run() is called.
 * suppose if we will directly call run() method then it will be a simply method execution not Thread
 * 
 * start()
 * {
 *   Registers thread with the Thread Schedular
 *   Performs all Other mandatory activities
 *   Invoke Run() method
 * }
 */

class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child");
        }
    }
    public void run(int i)         //Thread class Start method will only execute no-arg run() method.
    {
        System.out.println("1-arg-run");
    }
}
public class Test {
    public static void main(String args[])
    {
        Thread t=new MyThread();
        t.run();   //It will be like normal method Execution not Thread as start() will perform all othe rabove activities
        for(int i=0;i<10;i++)
        System.out.println("main");
    }
}
