package dailytasks.q1.blc;

public class Trainer {
	private Integer trainerId;
	private String trainerName;
	private Double basicSalary;
	private Double HRAPer;
	private Double DAPer;
	private Integer batchCount;
	private Double perkPerBatch;
	
	public Trainer(Integer trainerId, String trainerName, Double basicSalary, Double HRAPer, Double DAPer,
			Integer batchcount, Double perkPerBatch) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.basicSalary = basicSalary;
		this.HRAPer = HRAPer;
		this.DAPer = DAPer;
		this.batchCount = batchcount;
		this.perkPerBatch = perkPerBatch;
	}
	
	public Double calculateGrossSalary() {
		return basicSalary +HRAPer +DAPer +(batchCount * perkPerBatch);
	}

	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", basicSalary=" + basicSalary
				+ ", HRAPer=" + HRAPer + ", DAPer=" + DAPer + ", batchCount=" + batchCount + ", perkPerBatch="
				+ perkPerBatch + "]";
	}
	
	
	
	
	
}
