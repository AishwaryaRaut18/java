package EmployeeInformation;

public class Mgr extends Emp {
	private int performanceBonus;

	
	
	public Mgr(int id, String name, String depId, double basic, int performanceBonus) {
		super(id, name, depId, basic);
		this.performanceBonus = performanceBonus;
	}
	
	public int getPerformanceBonus() {
		return performanceBonus;
	}

	@Override
	public String toString() {
		return   super.toString() + " performanceBonus=" + performanceBonus;
	}
	
	public double netSalary() {
		return getBasic() + performanceBonus;
	}

}
