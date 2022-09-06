package com.cg.polymorphism;

class Shape{  
		void draw(){
			System.out.println("drawing...");
			}  
			}  
			class Rectangle extends Shape{  
			void draw(){
				System.out.println("drawing rectangle...Length * Breadth");
				}  
			}  
			class Circle extends Shape{  
			void draw(){
				System.out.println("drawing circle...     PI*r^2");
				}  
			}  
			class Triangle extends Shape{  
			void draw(){
				System.out.println("drawing triangle...   1/2 × b × h");
				}  
			}  

			public class PolymorphismDemo3 {

				public static void main(String[] args) {
					Shape s;  
					s=new Rectangle();  
					s.draw();  
					s=new Circle();  
					s.draw();  
					s=new Triangle();  
					s.draw();  

				}

			}