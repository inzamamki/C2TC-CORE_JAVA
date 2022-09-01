package com.cg.inheritance;

class bank1loan{  
void Intrest(){System.out.println("2%");}  
}  
class PersonalLoan1 extends bank1loan{  
void IntrestPL(){System.out.println("5%");}  
}  
class carloan extends bank1loan{  
void IntrestCL(){System.out.println("8%");}  
}  

public class HierarchicalInheritance {

	public static void main(String[] args) {
		carloan c=new carloan();  
		c.IntrestCL();  
		c.Intrest(); 

	}
}
