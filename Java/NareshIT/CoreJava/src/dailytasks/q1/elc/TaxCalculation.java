package dailytasks.q1.elc;
import dailytasks.q1.blc.*;
import java.util.Scanner;

public class TaxCalculation {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choise \n1. EmployeeDetail\n2. ManagerDetail\n3. TrainerDetail\n4.SourceDetail");
		Integer choise = Integer.parseInt(sc.nextLine());
		
		switch(choise){
			case 1 :{
				Integer employeeId;
				String employeeName;
				Double basicSalary;
				Double HRAPer;
				Double DAPer;
				
				
				employeeId = Integer.parseInt(sc.nextLine());
				employeeName = sc.nextLine();
				basicSalary = sc.nextDouble();
				HRAPer = sc.nextDouble();
				DAPer = sc.nextDouble();
				
				
				Employee e1 = new Employee(employeeId, employeeName, basicSalary, HRAPer, DAPer);
				TaxUtil t1 = new TaxUtil();
				Double calculateTax = t1.calculateTax(e1);
				System.out.println(e1);
				System.out.println("The employee have to pay the Tax of Rs :"+calculateTax);
			}
		}
		
		

	}

}
