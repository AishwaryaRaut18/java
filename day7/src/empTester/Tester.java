/* Modify Day 6's emp based assignment for the following
2.1 Since Emp class , does not know about salary computation formula ,
make compute net salary functionality abstract instead of returning 0.
Make suitable changes & test the functionality.

2.2 Add emp id generator in Emp class . Emp ids for manager & worker while registering , should be generated in auto increment manner (starting from 1 onwards)
Hint : use static eg : public static int idCounter

2.3 Add another option to the Menu in tester code.
1. Hire Manager
2. Hire Worker  
3. Display information of all employees(using toString) including net salary(by invoking computeNetSalary)  using single for-each loop.

4.New option
Update Emp Salary
Input : emp id & increment
If it's a manager , this increment is for performance bonus. If it's a worker this is an increment in hourly rate. So update suitably (Hint : instanceof & add suitable methods in classes)
Display updated computed salary of the employee.

10. Exit
NOTE : Boundary condition checking & null checking is mandatory.
 */
package empTester;
import java.util.Scanner;

import day7.Employee;
import day7.Manager;
import day7.Worker;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of employees");
Employee[] employee=new Employee[sc.nextInt()];
boolean exit=false;
int counter=0,EmployeeId;
while(!exit) {
	System.out.println("MENU 1.Hire Manager  2.Hire Worker 3.Display information 4:Upadate Salary 10.exit");
	System.out.println("choose option");
	switch(sc.nextInt()) {
	case 1: if(counter<employee.length) {
		System.out.println("Enter the Employee Name, Department Id, Basic pay , Performance Bonus");
		employee[counter++]=new Manager(sc.next(),sc.next(),sc.nextDouble(),sc.nextInt());
	}else {
		System.out.println("Sorry,try again next time");
	}
	break;
	
	case 2:if(counter<employee.length) {
		System.out.println("Enter the Employee Name, Department Id, Basic pay , Hours Worked, Hourly Rate");
		employee[counter++]=new Worker(sc.next(),sc.next(),sc.nextDouble(),sc.nextInt(),sc.nextInt());
	}else {
		System.out.println("Sorry,try again next time");
	}
		break;
	
	case 3:
//      for(int i=0;i<employee.length;i++) {
//		System.out.println(employee[i]);
        for(Employee e:employee)
        	if(e!=null) {
        	System.out.println(e);
	}
		break;
		
	case 4:
		System.out.println("Enter employee Id");
		EmployeeId=sc.nextInt();
		if(EmployeeId<=counter) {
			if(employee[EmployeeId-1] instanceof  Manager) {
				System.out.println("Enter new performance bonus");
				((Manager)employee[EmployeeId-1]).setPerformanceBonus(sc.nextInt());
				
			}
			else if(employee[EmployeeId-1] instanceof  Worker) {
				System.out.println("Enter new hourly rate");
				((Worker)employee[EmployeeId-1]).setHourlyRate(sc.nextInt());
			}
		}
		else {
			System.out.println("Invalid employee id");
		}
		break;
	
		
	case 10:
		exit=true;
		break;
	}
}
sc.close();
	}

}

