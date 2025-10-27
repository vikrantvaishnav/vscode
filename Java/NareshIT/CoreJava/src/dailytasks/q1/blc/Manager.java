package dailytasks.q1.blc;

public class Manager {
	private Integer managerId;
	private String managerName;
	private Double basicSalary;
	private Double HRAPer;
	private Double DAPer;
	private Double projectAllowance;
	
	public Manager(Integer managerId, String managerName, Double basicSalary, Double HRAPer, Double DAPer,
			Double projectAllowance) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.basicSalary = basicSalary;
		this.HRAPer = HRAPer;
		this.DAPer = DAPer;
		this.projectAllowance = projectAllowance;
	}
	
	
	public Double calculateGrossSalary() {
		return basicSalary +HRAPer +DAPer + projectAllowance;
	}


	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", basicSalary=" + basicSalary
				+ ", HRAPer=" + HRAPer + ", DAPer=" + DAPer + ", projectAllowance=" + projectAllowance + "]";
	}
	
	
	
}
