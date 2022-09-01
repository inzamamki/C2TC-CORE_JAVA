package com.cg.inheritance;

	class Loan
	{  
	void interest(){
		System.out.println("3%");
		} 
	}
	class HomeLoan extends Loan{
		void interestHL() {
			System.out.println("7%");
			}
			}

	public class SingleInheritanc {

		public static void main(String[] args) {
			HomeLoan i=new HomeLoan();  
			i.interestHL();  
			i.interest();  
		}
	}