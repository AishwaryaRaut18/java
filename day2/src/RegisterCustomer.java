import java.util.Scanner;
class RegisterCustomer{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Customer cust=new Customer();
		System.out.println("Enter the employee name:");
		cust.setName(sc.next());
		System.out.println("Enter the employee email:");
		cust.setEmail(sc.next());
		System.out.println("Enter the employee age:");
		cust.setAge(sc.nextInt());
		System.out.println("Enter the employee Credit limit:");
		cust.setCredit(sc.nextDouble());
		System.out.println("The employee name is:"+cust.getName()+"\nThe employee email:"+cust.getEmail()+"\nThe employee age:"+cust.getAge()+"\nThe employee credit limit is:"+cust.getCredit());
	}	
}