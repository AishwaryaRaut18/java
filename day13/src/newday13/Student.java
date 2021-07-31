/*
4.  Create Student class -- rollNo(string),name,dob(LocalDate),subject(enum),gpa(double)
Create Subject enum --JAVA,CLOUD,ML,R,DBT
Add constr & to string & getters.
4.1  Create sample data for storing list of students (5 records minimum)
4.2 Write a tester to print avg gpa of students opted for subject JAVA
(Hint : filter,map,reduce)
4.3 Print name of java topper
(filter ,  max )
4.4  Check if there are any failures for the specified subject from user.
(gpa < 5 : failed case)
(filter,anyMatch)

4.5  Display Names of failures in Java
filter,findAny

4.6 How many distinctions for a specific subject
(gpa > 7.5 : distinction)
filter,count
*/
package newday13;
import java.time.LocalDate;


public class Student {
	private String rollNo;
	private String name;
	private LocalDate  dob;
	private Subject subject;
	private double gpa;
	public Student(String rollNo, String name, LocalDate dob, Subject subject, double gpa) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dob = dob;
		this.subject = subject;
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", dob=" + dob + ", subject=" + subject + ", gpa=" + gpa
				+ "]";
	}
	public String getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public Subject getSubject() {
		return subject;
	}
	public double getGpa() {
		return gpa;
	}
	
}
