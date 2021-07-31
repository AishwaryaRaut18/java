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
package day11;
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
	
	
	public Customer(String email) {
		super();
		this.email = email;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}

	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}

	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", password=" + password + ", customerType=" + customerType
				+ ", registrationAmount=" + registrationAmount +", Date of registration="+ sdf.format(registrationDate) + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if(o instanceof Customer) {
		  return this.email.equals(((Customer)o).email);
		}
		else {
			return false;
		}
		
	}

}
