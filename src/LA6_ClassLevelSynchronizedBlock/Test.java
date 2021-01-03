/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LA6_ClassLevelSynchronizedBlock;

import java.util.*;
/**
 *
 * @author DELL-PC
 */
class Display
{
    public void display(String s)
    {
        System.out.println("Hello "+s+" I have 10000 lines of code");
        synchronized(Display.class)
        {
        for(int i=0;i<10;i++)
        {    
        System.out.print("Good Morning");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println(":"+s);
        }
        }
    }
}
class MyThread extends Thread
{
    Display d;
    String name;
    MyThread(Display d,String n)
    {
        this.d=d;
        this.name=n;
    }
    public void run()
    {
        d.display(name);
    }
}
public class Test {
    public static void main(String args[])
    {
    Display d1=new Display();
    Display d2=new Display();
    Thread t2=new MyThread(d1,"Salman");
    Thread t3=new MyThread(d2,"Raj");
    t2.start();
    t3.start();
    }
}
