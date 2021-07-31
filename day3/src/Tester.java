import java.util.Scanner;
class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter the X and Y co-ordinate");
        Point2D P1;// class type of ref. 
        P1 = new Point2D(sc.nextDouble(), sc.nextDouble());//Getting the coordinates
        System.out.println(P1.details());
        
		System.out.println("Enter the X and Y co-ordinate of another point");
        Point2D P2;// class type of ref. 
        P2 = new Point2D(sc.nextDouble(), sc.nextDouble());
		System.out.println(P2.details());
		

        System.out.println("Are the points equal:"+ P1.isEqual(P2));
 
        //Box box3 = box1.createNewBox(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Distance between two points are:"+P1.calculateDistance(P2));
        sc.close();
    }
}