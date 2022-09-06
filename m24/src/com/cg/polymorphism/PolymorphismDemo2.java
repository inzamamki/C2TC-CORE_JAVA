package com.cg.polymorphism;

class Bank{  //Consider a scenario where Bank is a class that provides a method to get the rate of interest.
float getRateOfInterest(){return 0;}  
} 
//However, the rate of interest may differ according to banks. For example, IDBI, ICICI, and BOM
//banks are providing 1.4%, 5.3%, and 10.7% rate of interest.
class IDBI extends Bank{  
float getRateOfInterest(){return 1.5f;}  
}  
class ICICI extends Bank{  
float getRateOfInterest(){return 5.3f;}  
}  
class BOM extends Bank{  
float getRateOfInterest(){return 10.7f;}  
}  

public class PolymorphismDemo2 {

	public static void main(String[] args) {
		Bank b;  
		b=new IDBI();  
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
		b=new ICICI();  
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
		b=new BOM();  
		System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  

	}

}


