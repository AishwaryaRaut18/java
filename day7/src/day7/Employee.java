package day7;
public  abstract class Employee {
    private static  int id=1;
	private String name;
	private String depId;
	private double basic;
	
	Employee(String name,String depId, double basic){
		this.id=idCounter();
		this.name=name;
		this.depId=depId;
		this.basic=basic;
	}
	
	String getEmpDetails() {
		return "Employee Id:"+idCounter()+" Name:"+name+" Department Id:"+depId+" Basic:"+basic;
	}

	public double getBasic() {
		return basic;
	}

	@Override
	public String toString() {
		return "Emp id=" + idCounter() + ", name=" + name + ", depId=" + depId + ", basic=" + basic ;
	}

	public abstract double netSalary();

	public static int idCounter() {
		return id++;
	}
	
}
