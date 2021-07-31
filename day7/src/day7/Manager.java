package day7;

public class Manager extends Employee {
	private int performanceBonus;
    
	
	
	public Manager(String name, String depId, double basic, int performanceBonus) {
		super( name, depId, basic);
		this.performanceBonus = performanceBonus;
	}
	
//	public int getPerformanceBonus() {
//		return performanceBonus;
//	}

	public void setPerformanceBonus(int performanceBonus) {
		this.performanceBonus = performanceBonus;
	}

	@Override
	public String toString() {
		return   super.toString() + " performanceBonus=" + performanceBonus+"Net Salary="+ netSalary();
	}
	
	public double netSalary() {
		return getBasic() + performanceBonus;
	}

}
