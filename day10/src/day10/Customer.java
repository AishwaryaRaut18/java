/*
2.Create a customer management application along with validations. 
2.1 Customer class
state --name,email,password,custType(String),reg amount(double)
Add constructor n toString.

2.2 Create custom exception class(eg : CustomerHandlingException or InvalidInputException) , as a checked exception

2.3 
Add I/P Validation rules in utils package : ValidationRules.java 
Add them using different public static methods(eg : validateEmail, validatePassword etc)
Must use exception delegation (throws)

1.Customer email must contain "@"  &  email  should end with ".com" (Use String class methods
contains , endsWith methods)
eg : public static String validateEmail(String email) throws InvalidInputException{...}
  
2. customer type must be either SILVER or GOLD or PLATUNUM (Hint :  String class contains method)

3. Reg amount must be in multiples of 500.(Hint : % operator)

In case of validation failures , throw your custom exception , which will be actually handled in catch-all block of main method  of Tester class.
i.e Centralized exception handling is expected.

Tester
Create Customer array to store customer details.
Supply following options
1. Register new customer
Accept customer details : name,email,password,custType,reg amount
Invoke validation rules.
In case of errors , show error message(via catch block) & application should continue.
In case of no erros , display "Customer registration successful" message & store customer details. 
2. Display all customer details (for-each)
3. Exit

 */
package day10;
import static tester.Tester.sdf;

import java.util.Date;

public class Customer {
	private String name;
	private String email;
	private String password;
	private CustomerType customerType;
	private double registrationAmount;
	private Date registrationDate ;
	
	
	public Customer(String name, String email, String password, CustomerType customerType, double registrationAmount,Date registrationDate) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.customerType = customerType;
		this.registrationAmount = registrationAmount;
		this.registrationDate=registrationDate;
	}
	
	

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", password=" + password + ", customerType=" + customerType
				+ ", registrationAmount=" + registrationAmount +", Date of registration="+ sdf.format(registrationDate) + "]";
	}

	



}
