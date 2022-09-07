package com.cg.multithreading;


public class ImplementsRunnableThread  implements Runnable{  
	public void run(){  
		System.out.println("thread is running...");  
		}  
		  
		public static void main(String args[]){  
			ImplementsRunnableThread m1=new ImplementsRunnableThread();  
		Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
		t1.start();  
		 }  
		}  