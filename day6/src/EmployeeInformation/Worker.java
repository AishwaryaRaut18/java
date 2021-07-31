package EmployeeInformation;

public class Worker extends Emp {
	private int hoursWorked;
	private int hourlyRate;
	
	public Worker(int id, String name, String depId, double basic, int hoursWorked, int hourlyRate) {
		super(id, name, depId, basic);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public int getHourlyRate() {
		return hourlyRate;
	}
	@Override
	public String toString() {
		return super.toString() +" hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate ;
	}
	
	public double netSalary() {
		return getBasic()+(hoursWorked*hourlyRate);
	}

}
