/*Create a java application for the following.

4.1 Create a Customer class , with data members (all private : tight encapsulation)
name(String),email(String),age(int), creditLimit(double)

Do not supply any constructor.

Supply getters for accesing the data members.
Supply setters for setting the values.
(eg : public void setEmail(String mail)
{email=mail;}
)

Rules : Valid value of age is between 21 to 61
Valid value of credit limit is between 5000 to 50,000
In case of invalid inputs values should not be set.
Display suitable error message.

4.2 Create RegisterCustomer class with main method
Create a customer class instance . Accept customer details from user & set them.
Display cusotmer details*/
public class Customer{
	private double creditLimit;
	private int age;
	private String name,email;
	
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email=email;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		if(age>20 && age<62){
		this.age=age;
		}
		else{
			System.out.println("Sorry, entered age is invalid");
			System.exit(0);
		}
	}
	
	public double getCredit(){
		return creditLimit;
	}
	public void setCredit(double creditLimit){
		if(creditLimit>4999 && creditLimit<50001){
		this.creditLimit=creditLimit;
		}
		else{
			System.out.println("Sorry, entered credit limit is invalid");
			System.exit(0);
		}
	
	}
}	
	