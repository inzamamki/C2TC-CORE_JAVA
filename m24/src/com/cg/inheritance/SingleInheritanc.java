package com.cg.inheritance;

	class Loan
	{  
	void interest(){
		System.out.println("3%");
		} 
	}
	class BusinessLoan2 extends Loan{
		void interestHL() {
			System.out.println("7%");
			}
			}

	public class SingleInheritanc {

		public static void main(String[] args) {
			BusinessLoan2 i=new BusinessLoan2();  
			i.interestHL();  
			i.interest();  
		}
	}