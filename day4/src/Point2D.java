/*5. Create a Point class Point2D  for representing a point in x-y co-ordinate system.

5.1 Create a parameterized constructor to accept x & y co-ords.

5.2 Add public String show()) --to return point's x & y co-ords

5.3 Add isEqual method to Point2D class : boolean returning method : must return true if both points are having same x,y co-ords or false otherwise. : 

5.4 Write a Tester class to test your functionality

1.4 Add calculateDistance method to calculate distance between current point n  specified point & return the distance to the caller.
(eg double  calcDistance(Point2D p2))
Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.

1.5 Write TestPoint class , under "tester" package with a main method
Accept co ordinates of 2 points from user (Scanner) --p1 & p2

1.6 Use show method to display point details.(p1's details & p2's details)

1.7 Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same position)

1.8 Display distance between 2 points.(between p1 & p2)*/
import java.lang.Math;
public class Point2D{
	private double X,Y;//tight encapsulation
	//parameterized constructor	
	Point2D(double X,double Y){
		this.X=X;
		this.Y=Y;
	}
	String details(){
		return "X co-ordinate="+this.X+"\nY co-ordinate="+this.Y;
	}
	 
    boolean isEqual(Point2D Point){
		return this.X ==Point.X && this.Y == Point.Y;
	}
	 double calculateDistance(Point2D P) {
		return Math.sqrt(Math.pow((P.X - this.X),2)+ Math.pow((P.Y - this.Y),2));
    }
	
}