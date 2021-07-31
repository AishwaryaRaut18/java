
import java.util.Scanner;

class TestBox {
    public static void main(String[] args) {
       
        // create a scanner object attached to stdin : System.in
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Box dims w d h");
        Box box1;// class type of ref. : method local variable : mem allocated on stack
		box1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        // display box dims
        System.out.println(box1.getBoxDimensions());
        // display computed volume
        System.out.println("Computed volume :" + box1.computeBoxVolume());
		
		System.out.println("Enter cube side:");
		Box cube = new Box(sc.nextDouble());
		 System.out.println(cube.getBoxDimensions());
		 System.out.println("Computed cube volume :" + cube.computeBoxVolume());
		 
		 System.out.println(box1.isEqual(cube) ? "SAME Dims" : "Different Dims");
        sc.close();
	}
}