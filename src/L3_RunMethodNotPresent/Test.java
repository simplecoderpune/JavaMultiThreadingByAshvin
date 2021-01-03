/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L3_RunMethodNotPresent;

/**
 *
 * @author DELL-PC
 */

class MyThread extends Thread
{
                     // t. start() will call the run Method() but we have not overrided it so Thread class run() method will be executed which has empty implementation
}
public class Test {
    public static void main(String args[])
    {
        Thread t=new MyThread();
        t.start();
        System.out.println("Hello I m from Main");
        
    }
}
