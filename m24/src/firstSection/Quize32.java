package firstSection;

public class Quize32 {

}

A thread can be created by implementing the Runnable interface and overriding the run() method. Then a Thread object can be created and the start() method called.

The Main thread in Java is the one that begins executing when the program starts. All the child threads are spawned from the Main thread and it is the last thread to finish execution.

A program that demonstrates this is given as follows:

Example
 Live Demo

class ThreadDemo implements Runnable {
   Thread t;
   ThreadDemo() {
      t = new Thread(this, "Thread");
      System.out.println("Child thread: " + t);
      t.start();
   }
   public void run() {
      try {
         System.out.println("Child Thread");
         Thread.sleep(50);
      } catch (InterruptedException e) {
         System.out.println("The child thread is interrupted.");
      }
      System.out.println("Exiting the child thread");
   }
}
public class Demo {
   public static void main(String args[]) {
      new ThreadDemo();
      try {
         System.out.println("Main Thread");
         Thread.sleep(100);
      } catch (InterruptedException e) {
         System.out.println("The Main thread is interrupted");
      }
      System.out.println("Exiting the Main thread");
   }
}