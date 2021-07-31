/*Create a class Vehicle , under the package : com.app.vehicles , to represent any vehicle. 
state  : registrationNo : int , color : String , price : double
registrationNo  MUST be unique (non duplicate) for any vehicle
Override toString

Create a class TestVehicle under the package "tester"
Create an array to store vehicle details
Business Rule : If user enters duplicate registrationNo  : give error message & do not that vehicle details in the array.
After filling up the array , display all vehicle details(Use : toString)

How will you check the equality ? 
You can add your own method "isEqual" in the Vehicle class n test it.
BUT why not use Object class method & override it suitably ?
Hint : Use Object class method
public boolean equals(Object o)
(Do it with lab faculty's help)*/
package com.app.Vehicle;

public class Vehicle {
	private int registrationNo;
	private String color;
	private double  price;
	
	public Vehicle(int registrationNo, String color, double price) {
		super();
		this.registrationNo = registrationNo;
		this.color = color;
		this.price = price;
	}

	
	public int getRegistrationNo() {
		return registrationNo;
	}

	@Override
	public String toString() {
		return "Vehicle Registration Number=" + registrationNo + ", color=" + color + ", price=" + price;
	}
	
	public boolean equals(Object o1) {
		
			return registrationNo == ((Vehicle) o1).registrationNo;
	
	}
	

}
