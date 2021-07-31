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
package tester;
import java.util.Scanner;
import static day10.CustomerType.*;
import static util.ValidationRule.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import day10.*;
public class Tester {
	public static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("dd-MM-yyyy");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int counter=0;
		boolean exit=false;
		String name,email,password,date;
		double registrationAmount;
		CustomerType customerType;
		Date Regdate;
		System.out.println("Enter number of customer");
		Customer[] cust=new Customer[sc.nextInt()];
		while(!exit)
	{
	System.out.println("1.Register new customer \n2.Display \n3.Exit");
	System.out.println("enter option");
		switch(sc.nextInt()){
	case 1: 
label:		for(counter=0;counter<cust.length;counter++) {
		System.out.println("Enter customer Name,email,password, customer type,registration amount,date(d-m-y): ");
		name=sc.next();
		email=sc.next();
		password=sc.next();
		customerType=valueOf(sc.next().toUpperCase());
		registrationAmount=sc.nextDouble();
		 date=sc.next();
		
		 
	   try {
		   validateName(name);
		   validateEmail(email);
		   validatePassword(password);
		   Regdate=sdf.parse(date);
		   //validateCustomerType(customerType);
		   validateRegistrationAmount(registrationAmount);
	   }
	 catch(Exception c) {
		 System.out.println("Due to "+c.getMessage()+"we cannot accept the customer");
		 System.out.println("Enter true to again write or false to cancel the registration ");
		if(sc.nextBoolean()==true) {
		counter--;
		   continue label;
	   }
		else{
			break;
		}
	 }

	cust[counter]=new Customer(name,email,password,customerType,registrationAmount,Regdate);
}

	  	  break;

	
	case 2:{
		 for(Customer c:cust)
	        	if(c!=null) {
	        	System.out.println(c);		
	}
	}
		 break;

	case 3:{
		exit=true;
		break;
		}
	}
	}
		sc.close();
	}
	
}
	
 

