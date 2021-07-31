/*1. Continue with earlier  Customer class , validation rules, custom exception (Make a separate copy)
Customer's Unique ID : email (Override equals method suitably)

Create CustomerManagementSystem as a tester application
Store customer details in the suitable ArrayList.

Options
1. Register new customer
(Rule : Should not allow to add customers with duplicate email.)

2. Customer Login
I/P : email & password
Throw custom exception , in case of invalid login

3. Change Password
I/P : email , old password , new password
Throw custom exception , in case of invalid login
In case of valid login , change password

4. Un subscribe customer
I/P  : email
Throw custom exception , in case of invalid email , otherwise , delete customer information.
*/
package tester;
import java.util.Scanner;
import java.util.ArrayList;
import static util.ValidationRule.*;
import java.text.SimpleDateFormat;
import day11.*;
public class Tester {
	public static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("dd-MM-yyyy");
	}

	public static void main(String[] args) {
		ArrayList<Customer> customer1=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		boolean exit=false;
		String name,email;
		Customer c1;
		
		while(!exit)
	{
	System.out.println("1.Register new customer \n2.Customer Login \n3.Change Password \n4.Unsubscribe customer \n5.Logout");
	System.out.println("enter option");
	try {
		switch(sc.nextInt()){
	case 1: 
	 System.out.println("Enter customer Name,email,password, customer type,registration amount,date(d-m-y): ");
		   name=sc.next();
		   email=sc.next();
		    c1=new Customer(validateName(name), validateEmail(email), validatePassword(sc.next()), validateCustomerType(sc.next()), validateRegistrationAmount(sc.nextDouble()), convertRegistrationDate(sc.next()));
           validateDupEmail(email, customer1);
           customer1.add(c1);
		  	  break;
	
	case 2:
	//for displaying	
//		 for(Customer c : customer1)
//	        	System.out.println(c);	
		//customerlogin
	{
		System.out.println("Please enter your registered Email Id and Password");
			Customer ref=getCustomerDetails(sc.next(), customer1);
		String oldpassword=ref.getPassword();
		if(oldpassword.equals(sc.next())) {
			System.out.println("welcome "+ref.getName());
		}
		
	}

		 break;

	case 3:
	//change password
	{
		System.out.println("Enter email id and old password");
		Customer ref = getCustomerDetails(sc.next(), customer1);
		String oldpassword=ref.getPassword();
		if(oldpassword.equals(sc.next())) {
			System.out.println("please enter new password");
			ref.setPassword(sc.next());
		System.out.println(ref.getName() + " password changed....");
		}
			
	}
		break;
		
	case 4:
	//unsubscribe customer
	{
		System.out.println("Enter Email Id");
		boolean remove = customer1.remove(new Customer(sc.next()));
		System.out.println(remove ? "customer unsubscribed..." : "Invalid Email Id");
		
	}
	break;
	
	case 5:{
		exit=true;
		break;
		}
	
	default:{
		System.out.println("Invalid option");
		System.exit(0);
	}
		sc.close();
		}
	} catch(Exception c) {
		 System.out.println(c.getMessage()+" we cannot accept the customer"); 
	 }
	sc.nextLine();
	}
	}
	
}
	
 

