package day7;

public class Worker extends Employee {
	private int hoursWorked;
	private int hourlyRate;
	
	public Worker(String name, String depId, double basic, int hoursWorked, int hourlyRate) {
		super( name, depId, basic);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
//	public int getHoursWorked() {
//		return hoursWorked;
//	}
//	public int getHourlyRate() {
//		return hourlyRate;
//	}
	
	
	@Override
	public String toString() {
		return super.toString() +" Hours Worked=" + hoursWorked + ", Hourly Rate=" + hourlyRate +"Net Salary=" +netSalary();
	}
	
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}


	public double netSalary() {
		return getBasic()+(hoursWorked*hourlyRate);
	}

}

