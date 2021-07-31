/*
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
filter,count*/
package newTester;
import java.util.Scanner;
import java.util.List;
import static newTester.util.populateData;
import newday13.*;
import java.text.SimpleDateFormat;
import static newday13.Subject.*;
import java.util.Collections;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.time.LocalDate;
public class Tester {
 public static SimpleDateFormat sdf;
		static {
			sdf = new SimpleDateFormat("dd-MM-yyyy");
		} 
	public static void main(String[] args) {
	 String A;
	 Student s1;
	
  try(Scanner sc=new Scanner(System.in)){
	  List<Student> student=populateData();	
	  System.out.println("List of original students");
	  student.forEach(s->System.out.println(s));
      
	  //sorting the arraylist
	  Collections.sort(student,new StudentCompare());
      
	  //storing arraylist as text file in buffered manner
       Writer output=new BufferedWriter(new FileWriter("StudentOutput.txt"));
     int sz=student.size();
     for(int i=0;i<sz;i++) {
    	 output.write(student.get(i).toString()+"\n");
     }
     output.close();
      
	 //avg gpa of java student
	  System.out.println("Average gpa of java student=");
	  double average=student.stream(). //Stream<Product> : all
				filter(p -> p.getSubject().equals(JAVA)).//Stream<Product> filtered by category
				filter(p -> p.getGpa() > 0).//Stream<Product>  filtered by gpa
				mapToDouble(p -> p.getGpa()).
				average().getAsDouble();
				System.out.println(average);
	
	//to find name of java topper
	System.out.println("Name of JAVA topper is="+student.stream().
	filter(p->p.getSubject().equals(JAVA)).
	max((o1,o2)->((Double)o1.getGpa()).compareTo(o2.getGpa())).
	orElse(null).getName());
	 
	 /*Check if there are any failures for the specified subject from user.
	 (gpa < 5 : failed case)
	 (filter,anyMatch)*/
	 System.out.println("enter course:");
	 Subject s=valueOf(sc.next().toUpperCase());
	 System.out.println("Failed ="+student.stream().
	 filter(p->p.getSubject().equals(s)).
	 filter(p->p.getGpa()<5).
	 findAny().orElse(null));
	 
	 //4.5  Display Names of failures in Java
	 //filter,findAny
	 System.out.println("Failed in java="+student.stream().
			 filter(p->p.getSubject().equals(JAVA)).
			 filter(p->p.getGpa()<5).
			 findAny().orElse(null));
	 
	 /*How many distinctions for a specific subject
(gpa > 7.5 : distinction)
filter,count*/
	 System.out.println("Enter subject :");
	 Subject sub=valueOf(sc.next().toUpperCase());
	 System.out.println("Number of students with destinction");
	         long count=(student.stream().
			 filter(p->p.getSubject().equals(sub)).
			 filter(p->p.getGpa()>7.5).count());
	         System.out.println(count);	 

//If user want to add more student	         
System.out.println("do you want to add more students(yes/no)");
A=sc.next();
if(A.equals("yes")) {
	System.out.println("enter rollNo, name, dob, subject,gpa");
	s1=new Student(sc.next(), sc.next(),LocalDate.of(sc.nextInt(),sc.nextInt(),sc.nextInt()),valueOf(sc.next().toUpperCase()) , sc.nextDouble());
	student.add(s1);
	
}else if(A.equals("no")){	
	System.out.println("");
} 
System.out.println("student according to their gpa "+student.stream().
max((o1,o2)->((Double)o1.getGpa()).compareTo(o2.getGpa())).
orElse(null).getName());
}
catch(Exception e) {
e.printStackTrace();
	}
}
}
