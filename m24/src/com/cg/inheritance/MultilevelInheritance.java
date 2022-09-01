package com.cg.inheritance;

class BankLoan
{  
void interest(){
	System.out.println("2%");
	} 
}
class HomeLoan extends BankLoan{
	void interestHL() {
		System.out.println("5%");
		}
}
class BusinessLoan extends HomeLoan{
	void interestBL() {
		System.out.println("10%");
		}
	
}
public class MultilevelInheritance {
	public static void main(String[] args) {
		BusinessLoan i=new BusinessLoan(); 
		i.interestBL(); 
		i.interestHL(); 
		i.interest(); 
		

	}

}

