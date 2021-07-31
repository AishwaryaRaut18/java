/*Create Emp based organization structure having types :  Emp , Mgr , Worker
All of above classes must be in --com.app.org
Organize classes in inheritance  hierarchy.

1 Emp state--- id(int), name, deptId , basic(double)
Accept all of above in constructor arguments.
Behaviour ---1.  get emp details -- by overriding  toString.
2. compute net salary ---return 0
(eg : public double computeNetSalary(){return 0;})

2 Mgr state  ---id,name,basic,deptId , performanceBonus
Behaviour ----1. get mgr details :  override toString. 
2. compute net salary (formula: basic+perfBonus) -- override computeNetSalary
3. get performance bonus. --add a new method to return bonus.(getter)


3 Worker state  --id,name,basic,deptId,hoursWorked,hourlyRate
Behaviour--- 
1. get worker details -- :  override toString.
2.  compute net salary (formula:  = basic+(hoursWorked*hourlyRate) --override computeNetSalary
3. get hrlyRate of the worker  -- add a new method to return hourly rate of a worker.(getter)

4. Write CreateOrganization in "tester" package.
Create suitable array to store organization details.

Provide following options

1. Hire Manager
2. Hire Worker  
3. Display information of all employees(using toString) including net salary(by invoking computeNetSalary)  using single for-each loop.
10. Exit
NOTE : Boundary condition checking & null checking is mandatory. */
package EmployeeTester;
import java.util.Scanner;
import EmployeeInformation.Emp;
import EmployeeInformation.Mgr;
import EmployeeInformation.Worker;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of employees");
Emp[] employee=new Emp[sc.nextInt()];
boolean exit=false;;
int counter=0;
while(!exit) {
	System.out.println("MENU 1.Hire Manager  2.Hire Worker 3.Display information 10.exit");
	System.out.println("choose option");
	switch(sc.nextInt()) {
	case 1: if(counter<employee.length) {
		System.out.println("Enter the Employee Id,Employee Name, Department Id, Basic pay , Performance Bonus");
		employee[counter++]=new Mgr(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble(),sc.nextInt());
	}else {
		System.out.println("Sorry,try again next time");
	}
	break;
	
	case 2:if(counter<employee.length) {
		System.out.println("Enter the Employee Id,Employee Name, Department Id, Basic pay , Hours Worked, Hourly Rate");
		employee[counter++]=new Worker(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble(),sc.nextInt(),sc.nextInt());
	}else {
		System.out.println("Sorry,try again next time");
	}
		break;
	
	case 3:for(int i=0;i<counter;i++) {
		System.out.println(employee[i]);
		System.out.println("Employee Net Salary: ");
		
		Emp e = employee[i];//toString calling 
		if (e instanceof Mgr) 
			System.out.println(((Mgr) e).netSalary());
		else if (e instanceof Worker)
			System.out.println(((Worker) e).netSalary()); 
		else System.out.println("invalid");
		
	}
		break;
		
	case 4:
		exit=true;
		break;
	}
}
sc.close();
	}

}
