/*Accept 2 double values from User (using Scanner). Check data type.(hasNextDouble)
. If arguments are not doubles , supply suitable error message & terminate.
If numbers are double values , print its average.*/
import java.util.Scanner;
class assignment2{
public static void main(String[] args){
//double number1,number2;-->if declared here it will allocate double space and if you give input char then it will directly terminate rather than displaying message
Scanner sc=new Scanner (System.in);
System.out.println("Enter one values");

if(sc.hasNextDouble()){
	double number1=sc.nextDouble();
	System.out.println("Enter another values");
	if(sc.hasNextDouble()){
		double number2=sc.nextDouble();
		double avg=(number1 + number2)/2;
		System.out.println("Average of two number is:"+avg);
      }
    else{
	     System.out.println("second number is not double");
        }
}
else{
	System.out.println("first number is not double");
    }
}
}
