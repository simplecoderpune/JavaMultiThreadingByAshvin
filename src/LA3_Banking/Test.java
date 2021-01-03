/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LA3_Banking;
import java.util.*;
/**
 *
 * @author DELL-PC
 */

class Bank
{
    int balance=4000;
    public synchronized void deposit(int b)
    {
        balance=balance+b;
        System.out.print("Credited Amount is=");
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Exception Raised");
        }
        System.out.println(b);
        System.out.print("Updated Balance is=");
                try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Exception Raised");
        }        
        System.out.println(balance);
    }
    public synchronized void withdraw(int b)
    {
        if(balance<=0)
            System.out.println("Your balance is 0");
        else
        {
        balance=balance-b;
        System.out.print("Deducted Amount is=");
                        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Exception Raised");
        }        
        System.out.println(b);
        System.out.print("Remaining Balance is=");
                        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Exception Raised");
        }        
        System.out.println(balance);
        }
    }
    public void checkBalance()
    {
        System.out.println("Your balance is="+balance);
    }
}
class MyThread extends Thread
{
    Bank b;
    int deposit;
    int withdraw;
    MyThread(Bank b,int d,int w)
    {
        this.b=b;
        this.deposit=d;
        this.withdraw=w;
    }
    public void run()
    {
        b.deposit(deposit);
        b.withdraw(withdraw);
    }
}

public class Test {
    public static void main(String args[])
    {
        Bank b=new Bank();
        Thread t1=new MyThread(b,1000,1100);
        Thread t2=new MyThread(b,2000,1200);
          Thread t3=new MyThread(b,3000,1300);
        Thread t4=new MyThread(b,4000,1400);
        t3.start();
        t1.start();
        t2.start();
        t4.start();
    }
}
