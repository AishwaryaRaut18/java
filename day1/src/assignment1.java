import java.util.Scanner;
class assignment1{
public static void main(String[] args){
boolean decision;
double number1,number2;
Scanner sc=new Scanner (System.in);

do{
	
         System.out.println("Option \n1:add \n2:sub \n3:mul \n4:div \n");
         int option=sc.nextInt();
		 		 
		 switch(option)
{
	
        
	case 1:
	System.out.println("enter 2 values");
          number1=sc.nextDouble();
          number2=sc.nextDouble();
	     double add = number1 + number2;
	     System.out.println("The addition is:"+add);
    break;
	

    case 2:
	System.out.println("enter 2 values");
          number1=sc.nextDouble();
          number2=sc.nextDouble();
         double sub = number1 - number2;
	     System.out.println("The substraction is:"+sub);
	break;
	
	case 3:
	System.out.println("enter 2 values");
          number1=sc.nextDouble();
          number2=sc.nextDouble();
	     double mul = number1 * number2;
	     System.out.println("The multiplication is:"+mul);
    break;

    case 4:
	System.out.println("enter 2 values");
          number1=sc.nextDouble();
          number2=sc.nextDouble();
	     double div = number1 / number2;
	     System.out.println("The division is:"+div);
    break;
 
    default:
	System.out.println("You have presses wrong choice");
	System.exit(0);
   
}
System.out.println("Do you want to continue (if yes type true else false):");
decision=sc.nextBoolean();
}while(decision==true);	 
}
}
