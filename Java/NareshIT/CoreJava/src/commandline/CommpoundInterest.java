package commandline;

import java.text.DecimalFormat;

public class CommpoundInterest {

	public static void main(String[] args) {
		double principle = Integer.parseInt(args[0]);
		double rate = Integer.parseInt(args[1]);
		double time = 3;
		
		double amount = principle*Math.pow((1+rate/100),time);
		
		DecimalFormat df =new DecimalFormat("0000.00");
		
		System.out.println("Amount after 3 years ="+df.format(amount));
	}

}
