/*
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

*/
package util;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import day11.Customer;
import day11.CustomerType;
import static day11.CustomerType.*;
import CustomException.CustomerHandlingException;
public class ValidationRule {
	
		public static SimpleDateFormat sdf;
		static {
			sdf = new SimpleDateFormat("dd-MM-yyyy");
		}
	public static final int MIN_NAME,MAX_NAME,MIN_PASSWORD;
	static {
		MIN_NAME=2;
		MAX_NAME=25;
		MIN_PASSWORD=5;
	}
	public static String validateName(String name) throws CustomerHandlingException{
		if(name.length()<MIN_NAME || name.length()>MAX_NAME)
			throw new CustomerHandlingException("Invalid Name");
		else{
			return name;
		}
	}
	
	public static String validateDupEmail(String custEmail, ArrayList<Customer> custList) throws CustomerHandlingException {
		Customer c=new Customer(custEmail);
		if (custList.contains(c))
			throw new CustomerHandlingException("Email already registred !!!!!!!");
		else {
		return custEmail;
		}
	}
	
	public static String validateEmail(String email) throws CustomerHandlingException{
		if(!(email.contains("@") && email.endsWith(".com")))
			throw new CustomerHandlingException("Invalid Email");
		else {
			return email;
		}
	}
	
	public static String validatePassword(String password) throws CustomerHandlingException{
		if(password.length()<MIN_PASSWORD)
			throw new CustomerHandlingException("Invalid as password should have more than 5 character");
		else {
			return password;
		}
	}
	
	 public static CustomerType validateCustomerType(String customerType) throws CustomerHandlingException {
		try {
			return valueOf(customerType.toUpperCase());
		}
		catch(IllegalArgumentException e){
			throw new CustomerHandlingException("invalid customer type");
		}
		}
	 
	 public static double validateRegistrationAmount(double registrationAmount) throws CustomerHandlingException {
			if((registrationAmount % 500)!=0)
				throw new CustomerHandlingException("Invalid Registartion Amount");
			else {
				return registrationAmount;
			}
        }
	 
	 public static Date convertRegistrationDate(String registrationDate) throws ParseException {
		return sdf.parse(registrationDate);
			
       }
	public static Customer getCustomerDetails(String email,ArrayList<Customer> List) throws CustomerHandlingException {
		int index=List.indexOf(new Customer(email));
		if(index==-1)
			throw new  CustomerHandlingException("Email not registered");
		else {
		return List.get(index);	
		}
	}
	}

