package dailytasks.q1.blc;

public class TaxUtil {

	public Double calculateTax(Employee e) {
		
		if(e.calcualateGrossSalary()>50000) {
			return e.calcualateGrossSalary()*0.20;
		}
		else {
			return e.calcualateGrossSalary()*0.05;
		}
	}
	
	
	
	 public Double calculateTax(Manager m) {
		
		 if(m.calculateGrossSalary()>50000) {
				return m.calculateGrossSalary()*0.20;
			}
			else {
				return m.calculateGrossSalary()*0.05;
			}
	}
	 
	 
	 public Double calculateTax(Trainer t) {
			
		 if(t.calculateGrossSalary()>50000) {
				return t.calculateGrossSalary()*0.20;
			}
			else {
				return t.calculateGrossSalary()*0.05;
			}
		}
	 
	 
	 
	 public Double calculateTax(Sourcing s) {
			
		 if(s.calculateGrossSalary()>50000) {
				return s.calculateGrossSalary()*0.20;
			}
			else {
				return s.calculateGrossSalary()*0.05;
			}
		}
	 
	 
	 
}
