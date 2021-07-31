package newday13;
import java.util.Comparator;

public class StudentCompare implements Comparator<Student>{
	//public int compare(T o1,T o2)
	@Override
	public int compare(Student s1,Student s2) {
		if(s1.getGpa() < s2.getGpa())
		return -1;
		if (s1.getGpa() == s2.getGpa())
			return 0;
		return 1;
	}
	
	

}
