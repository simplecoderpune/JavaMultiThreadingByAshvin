package LB3_ProducerConsumer;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class PC
{
    LinkedList<Integer> list=new LinkedList<Integer>();
    int capacity=5;
    public void produce(int value) throws InterruptedException
    {
            synchronized(this)
            {
                while(list.size()==capacity)
                {
                    this.wait();
                }
                System.out.println("Producer produced->"+value);
                list.add(value);
                // notifies the consumer thread that now it
                // can start consuming
                this.notify();
            }
    }
    public void consume() throws InterruptedException
    {
            synchronized(this)
            {
                while(list.size()==0)
                {
                    this.wait();
                }
            
            int val=list.removeFirst();
            System.out.println("Consumer consumed-"+val);
            //wake up
            this.notify();
            }
    }
}
class ProducerThread extends Thread
{
    PC p;
    ProducerThread(PC p)
    {
        this.p=p;
    }
    public void run()
    {
        int i=1;
        while(true)
        {    
        try
        {
            p.produce(i++);
            //Thread.sleep(3000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }
    }
}
class ConsumerThread extends Thread
{
    PC p;
    ConsumerThread(PC p)
    {
        this.p=p;
    }
    public void run()
    {
         while(true)
         {    
         try
         {
             p.consume();
             Thread.sleep(3000);
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
        }
    }
}
public class Test
{
    public static void main(String args[])
    {
        PC p=new PC();
        ProducerThread t1=new ProducerThread(p);
        ConsumerThread t2=new ConsumerThread(p);
        t1.start();
        t2.start();
        
    }
}