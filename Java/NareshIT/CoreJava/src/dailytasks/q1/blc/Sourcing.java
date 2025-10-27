package dailytasks.q1.blc;

public class Sourcing {
	private Integer souceId;
	private String souceName;
	private Double basicSalary;
	private Double HRAPer;
	private Double DAPer;
	private Integer enrollmentTarget;
	private Integer enrollmentReached;
	private Double perkPerEnrollment;
	
	
	public Sourcing(Integer souceId, String souceName, Double basicSalary, Double HRAPer, Double DAPer,
			Integer enrollmentTarget, Integer enrollmentReached, Double perkPerEnrollment, Integer batchCount,
			Double perkPerBatch) {
		super();
		this.souceId = souceId;
		this.souceName = souceName;
		this.basicSalary = basicSalary;
		this.HRAPer = HRAPer;
		this.DAPer = DAPer;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
		
	}
	
	
	public Double calculateGrossSalary() {
		return basicSalary +HRAPer +DAPer +(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);
	}


	@Override
	public String toString() {
		return "Sourcing [souceId=" + souceId + ", souceName=" + souceName + ", basicSalary=" + basicSalary
				+ ", HRAPer=" + HRAPer + ", DAPer=" + DAPer + ", enrollmentTarget=" + enrollmentTarget
				+ ", enrollmentReached=" + enrollmentReached + ", perkPerEnrollment=" + perkPerEnrollment + "]";
	}
	
	
	
}
