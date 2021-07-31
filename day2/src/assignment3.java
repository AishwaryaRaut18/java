/*Display food menu to user. Assign fixed prices to food items.
User will select items from menu along with the quantity. (eg 1. Dosa 2. Samosa 3. Rice 4. Noodles .......10 . Generate Bill ) When user chooses 'Generate Bill' option, display total bill & exit.
Hint : Use scanner for user interaction*/
import java.util.Scanner;
class assignment3{
	public static void main(String[] args){
		int bill=0,number;
		boolean decision=true;
		Scanner sc=new Scanner(System.in);
	System.out.println("**MENU**");
	System.out.println("1.Dosa=100 \n2.Samosa=30 \n3.Rice=50 \n4.Noodle=120 \n5.Sambarwada=50 \n6.Manchurian=90 \n7.FriesRice=150 \n8.curry=200 \n9.Naan=25 \n10.Generate Bill");
	do{
	System.out.println("Please select your dishes number and then select the quantity");
	if(sc.hasNextInt()){
	int option=sc.nextInt();
	switch(option){
		
	case 1:System.out.println("Dosa=");
	number=sc.nextInt();
	bill=100*number;
	break;
	
	case 2:System.out.println("\nSamosa=");
	number=sc.nextInt();
	bill=bill+(30*number);
	break;
	
	case 3:System.out.println("\nRice=");
	number=sc.nextInt();
	bill=bill+(50*number);
	break;
	
	case 4:System.out.println("\nNoodle=");
	number=sc.nextInt();
	bill=bill+(120*number);
	break;
	
	case 5:System.out.println("\nSambarwada=");
	number=sc.nextInt();
	bill=bill+(50*number);
	break;
	
	case 6:System.out.println("\nManchurian=");
	number=sc.nextInt();
	bill=bill+(90*number);
	break;
	
	case 7:System.out.println("\nFriedRice=");
	number=sc.nextInt();
	bill=bill+(150*number);
	break;
	
	case 8:System.out.println("\nCurry=");
	number=sc.nextInt();
	bill=bill+(200*number);
	break;
	
	case 9:System.out.println("\nNaan=");
	number=sc.nextInt();
	bill=bill+(25*number);
	break;
	
	default:
	System.out.println("you have pressed wrong option ");
	System.exit(0);
	
	}
	System.out.println("Do you want to add more dishes (if yes type true else false)");
	decision=sc.nextBoolean();
	}
	else{
		System.out.println("please enter whole number");
	}
	}while(decision==true);
	System.out.println("\nYour bill is:"+ bill);
	
}
}