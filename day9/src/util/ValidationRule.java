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
import CustomException.CustomerHandlingException;
public class ValidationRule {
	
	public static final int MIN_NAME,MAX_NAME,MIN_PASSWORD;
	static {
		MIN_NAME=2;
		MAX_NAME=25;
		MIN_PASSWORD=5;
	}
	public static void validateName(String name) throws CustomerHandlingException{
		if(name.length()<MIN_NAME || name.length()>MAX_NAME)
			throw new CustomerHandlingException("Invalid Name");
		System.out.print("");
	}
	
	public static void validateEmail(String email) throws CustomerHandlingException{
		if(!(email.contains("@") && email.endsWith(".com")))
			throw new CustomerHandlingException("Invalid Email");
		System.out.print("");
	}
	
	public static void validatePassword(String password) throws CustomerHandlingException{
		if(password.length()<MIN_PASSWORD)
			throw new CustomerHandlingException("Invalid as password should have more than 5 character");
		System.out.print("");
	}
	
	 public static void validateCustomerType(String customerType) throws CustomerHandlingException {
		if(!(customerType.equals("SILVER") || customerType.equals("GOLD") ||customerType.equals("PLATINUM")))
			throw new CustomerHandlingException("Invalid customer");
		System.out.print("");
		}
	 
	 public static void validateRegistrationAmount(Double registrationAmount) throws CustomerHandlingException {
			if((registrationAmount % 500)!=0)
				throw new CustomerHandlingException("Invalid Registartion Amount");
			System.out.print("");
}

}
