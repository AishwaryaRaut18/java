/*
2. Open Box.java.
2.1 Add another constructor to create a cube.
2.2 Add a method to Box class to compare equality of 2 boxes.
This method should return true if the dimensions of 2 boxes are same , otherwise return false.
(eg method name : checkEquality)

3. Create TestBox2.java
Prompt user for accepting 2 box dimensions & create 2 boxes.
Invoke the checkEquality method & display "Same" if method returns true otherwise display "Different"
Prompt user to accept a side of a cube.
Display it's volume.
*/
public class Box {
    private double width, depth, height;// =>tight encapsulation
   

    Box(double width, double depth, double height) {
        this.width = width;
        this.depth = depth;
        this.height = height;// to un hide instnace variable from method argument

    }
	Box(double side){
		this(side,side,side);
	}

    // To return Box details in string form (dims of Box)
    String getBoxDimensions() {
        return "Box Dims " + this.width + " " + this.depth + " " + this.height;
    }

    // method to return compute volume to the caller
    double computeBoxVolume() {
        return width * depth * height;
    }
	
	boolean isEqual(Box B){
		return this.width == B.width && depth == B.depth && height == B.height;
	}
}