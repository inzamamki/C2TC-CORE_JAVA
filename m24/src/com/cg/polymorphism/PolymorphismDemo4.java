package com.cg.polymorphism;


	class Animal{  
		void eat(){
			System.out.println("eating...");
			}  
		}  
		class Dog extends Animal{  
		void eat(){
			System.out.println("Dog eating biscuits...");
			}  
		}  
		class Cat extends Animal{  
		void eat(){
			System.out.println("Cat eating fish and rats...");
			}  
		}  
		class Lion extends Animal{  
		void eat(){
			System.out.println("Lion eating meat...");
			}  
		}  
		class Giraff extends Animal{  
			void eat(){
				System.out.println("Giraff eating Leaf...");
				}  
			} 
		  
		public class PolymorphismDemo4 {

			public static void main(String[] args) {
				Animal a;  
				a=new Dog();  
				a.eat();  
				a=new Cat();  
				a.eat();  
				a=new Lion();  
				a.eat();
				a=new Giraff();  
				a.eat();
			}

		}