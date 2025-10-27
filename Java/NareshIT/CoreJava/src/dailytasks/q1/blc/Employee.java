package dailytasks.q1.blc;

public class Employee {
	
	private Integer employeeId;
	private String employeeName;
	private Double basicSalary;
	private Double HRAPer;
	private Double DAPer;
	
	public Employee(Integer employeeId, String employeeName, Double basicSalary, Double HRAPer, Double DAPer) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.HRAPer = HRAPer;
		this.DAPer = DAPer;
	}

	
	public Double calcualateGrossSalary() {
		return basicSalary+HRAPer+DAPer;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary
				+ ", HRAPer=" + HRAPer + ", DAPer=" + DAPer + "]";
	}
	
	
	
	
	
	
	
	
}
