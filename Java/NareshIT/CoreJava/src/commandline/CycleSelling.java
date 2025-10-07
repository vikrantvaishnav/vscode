package commandline;

public class CycleSelling {

	public static void main(String[] args) {
		int oldCycle = Integer.parseInt(args[0]);
		int repairs = Integer.parseInt(args[1]);
		int coloring = Integer.parseInt(args[2]);
		int newAccessories = Integer.parseInt(args[3]);
		int profit = 1500;
		
		int totalCost = oldCycle+repairs+coloring+newAccessories+profit;
		
		System.out.println("Selling Price: "+totalCost);
		
		
		

	}
	
	

}
