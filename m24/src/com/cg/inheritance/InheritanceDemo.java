package com.cg.inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		class Vehicle {
			  protected String brand = "Ford";
			  public void honk() {
			    System.out.println("Tuut, tuut!");
			  }
			}

			class Car extends Vehicle {
			  private String modelName = "Mustang";
			  public void main(String[] args) {
			    Car myFastCar = new Car();
			    myFastCar.honk();
			    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
			  }
			}


	}

}
