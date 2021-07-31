package vehicleTester;
import  java.util.Scanner;

import com.app.Vehicle.Vehicle;
public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the number of vehicles");
          Vehicle[] V1=new Vehicle[sc.nextInt()];
         int index=0;
      for(index=0;index<V1.length;index++) {
        	  System.out.println("Enter vehicle Registration number, color, price");
        	  Vehicle vehicle1=new Vehicle(sc.nextInt(), sc.next(), sc.nextInt());
        	
        	  boolean flag=false;
        	  for(int i=0;i<index;i++) {
        		  if(V1[i].equals(vehicle1)) {
        			  flag=true;
        			  break;
        		  }
        	  }
        	  if(!flag) {
        		  V1[index] = vehicle1;
        	  }
        	  else  {
        		  System.out.println("Please re-enter the registration number as entered one is already registered");
        		  index--;
        	  }
        	  sc.close();
          	 }
        	 for(Object o:V1) {
        		 System.out.println(o);
        	  }
           
          }    

}   
//  for(int j=0;j<i;j++) {
//        	  if (V1[i].getRegistrationNo() == V1[j].getRegistrationNo()) {
//        		  System.out.println("This vehicle number already registered");
//        		  i--;
//        		  break;
//        	  }
//        	  else {
//        		   continue;
//        	  }
//        	  }
//          }