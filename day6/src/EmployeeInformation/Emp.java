package EmployeeInformation;

public class Emp {
	private int id;
	private String name;
	private String depId;
	private double basic;
	
	Emp(int id,String name,String depId, double basic){
		this.id=id;
		this.name=name;
		this.depId=depId;
		this.basic=basic;
	}
	
	String getEmpDetails() {
		return "Employee Id:"+this.id+" Name:"+name+" Department Id:"+depId+" Basic:"+basic;
	}

	public double getBasic() {
		return basic;
	}

	@Override
	public String toString() {
		return "Emp id=" + id + ", name=" + name + ", depId=" + depId + ", basic=" + basic ;
	}

	public double netSalary() {
		return 0;
	}
}
