/* rollNo(string),name,dob(LocalDate),subject(enum),gpa(double)
JAVA,CLOUD,ML,R,DBT;*/
package newTester;
import java.util.ArrayList;
import java.util.List;
import  static newday13.Subject.*;
import static java.time.LocalDate.*;
import newday13.Student;

public class util {
	public static List<Student> populateData() {
		ArrayList<Student> student = new ArrayList<>();
		student.add(new Student("dac100","ravi", parse("2019-01-01"),CLOUD,8.5));
		student.add(new Student("dbda101","anita", parse("2019-11-21"),JAVA, 7.0));
		student.add(new Student("dac102","satish", parse("2019-05-11"),ML, 4.5));
		student.add(new Student("dbda108","sai", parse("2019-01-13"),R, 9.7));
		student.add(new Student("dbda175","luv",parse("2020-01-01"), DBT, 6.5));
		student.add(new Student("dbda104", "kush",parse("2018-07-11"),JAVA, 8.8));
		return student;
	}

}
