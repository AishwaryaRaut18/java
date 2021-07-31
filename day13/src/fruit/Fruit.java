/*
  Create Fruit class , with 1 instance var : name(string)
Add constr & toString
Add a abstract taste() method to return String form of taste.
Create sub classes --Mango,Cherry,Apple,Banana.
Use Arrays.asList --to create fixed size list of Fruits (mango --sweet
,cherry sweet
apple --sour
,banana --sweet)
Convert List to Stream & filter fruits having sweet taste &
Display their names. 
 */package fruit;

	

 public abstract class Fruit {

 	private String name;

 	
 	
 	public Fruit() {
 		super();
 	}

 	public Fruit(String name) {
 		this.name = name;
 	}

 	public String getName() {
 		return name;
 	}

 	public void setName(String name) {
 		this.name = name;
 	}
 	
 	public abstract String taste();
	
}
