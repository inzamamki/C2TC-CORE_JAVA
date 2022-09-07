package com.cg.multithreading;

class ImplementsRunnableThread2 {
    public static void m1()
    {
        System.out.println("Hello Visitors");
    }
    public static void main(String[] args)
    {
        Test t = new Test();
        t.m1();
        Thread t1 = new Thread(t);
        t1.start();
        System.out.println("Main method executed by main thread");
    }
}

class Test extends ImplementsRunnableThread2 implements Runnable // Here we can extends any other class
{
    public void run()
    {
        System.out.println("Run method executed by child Thread");
    }

}