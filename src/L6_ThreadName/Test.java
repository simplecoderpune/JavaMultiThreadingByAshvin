/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L6_ThreadName;
import java.util.*;
/**
 * Thread.currentThread().getName();----> is used to fetch the name of current Thread
 * Thread.currentThread().setName("Raj");----->Set the name of current Thread
 * We can also assign name by using Thread Class Constructor
 */
class MyThread extends Thread
{
    MyThread(String name)
    {
        super(name); //Pass to thread class constructor
    }
    public void run()
    {
        
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getStackTrace());
        for(int i=0;i<5;i++)
            System.out.println("Child");
    }
}
public class Test {
    public static void main(String args[])
    {
        
        Thread t1=new MyThread("Ashvin");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Raj");
      
        System.out.println(Thread.currentThread().getName());
    }
}
