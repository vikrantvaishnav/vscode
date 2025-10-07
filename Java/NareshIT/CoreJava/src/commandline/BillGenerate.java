package commandline;

public class BillGenerate {

	public static void main(String[] args) {
		
		int noOfChickenroll = Integer.parseInt(args[0]);
		int vegePuff = Integer.parseInt(args[1]);
		
		int price = (60*noOfChickenroll)+(25*vegePuff);
		
		System.out.println("chicken Rolls Bill: "+60*noOfChickenroll);
		System.out.println("Vegetable Puffs Bill: "+25*vegePuff);
		System.out.println("Total Bill(before discounts): "+price);
		System.out.println("Discount: "+50);
		System.out.println("Final Bill: "+(price-50));
		
		

	}

}
