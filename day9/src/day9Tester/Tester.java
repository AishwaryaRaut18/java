/*Tester
Create Customer array to store customer details.
Supply following options
1. Register new customer
Accept customer details : name,email,password,custType,reg amount
Invoke validation rules.
In case of errors , show error message(via catch block) & application should continue.
In case of no erros , display "Customer registration successful" message & store customer details. 
2. Display all customer details (for-each)
3. Exit*/
package day9Tester;
import java.util.Scanner;

import day9.Customer;

import static util.ValidationRule.*;
public class Tester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int counter=0;
		boolean exit=false;
		String name,email,password,customerType;
		double registrationAmount;
		System.out.println("Enter number of customer");
		Customer[] cust=new Customer[sc.nextInt()];
		while(!exit)
	{
	System.out.println("1.Register new customer \n2.Display \n3.Exit");
	System.out.println("enter option");
		switch(sc.nextInt()){
	case 1: {for(counter=0;counter<cust.length;counter++) {
		System.out.println("Enter customer Name,email,password, customer type,registration amount: ");
		name=sc.next();
		email=sc.next();
		password=sc.next();
		customerType=sc.next();
		registrationAmount=sc.nextDouble();
		//Customer customer1=new Customer(name,email,password,customerType,registrationAmount);
	   try {
		   validateName(name);
		   validateEmail(email);
		   validatePassword(password);
		   validateCustomerType(customerType);
		   validateRegistrationAmount(registrationAmount);
	   }
	 catch(Exception c) {
		 System.out.println(c.getMessage());
		 break;
	 }
   	 
	   cust[counter++]=new Customer(name,email,password,customerType,registrationAmount);
	}
 	  break;
	}
	
	case 2:{
		 for(Customer c:cust)
	        	if(c!=null) {
	        	System.out.println(c);		
	}
		 break;
	}
	case 3:{
		exit=true;
		break;
		}
	}
	}
		sc.close();
	}
	
}
