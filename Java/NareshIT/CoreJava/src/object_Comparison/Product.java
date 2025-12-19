package object_Comparison;

public class Product {
	
	
	void main() {
		
		Productblc p1  = new Productblc(111,"Scott");
		Productblc p2  = new Productblc(111,"Scott");
	
	
		IO.println(p1==p2);
		IO.println(p1.equals(p2));
	}
	

}

class Productblc{
	private int productid;
	private String productName;
	
	public Productblc(int productid,String productName) {
		this.productid = productid;
		this.productName = productName;
	}
	
	@Override
	public int hashCode() {
		return this.productid;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		
		if(obj instanceof Productblc) {
		
		int id1 = this.productid;
		String name1 = this.productName;
		
		Productblc p2 = (Productblc)obj;
		
		int id2 = p2.productid;
		String name2 = p2.productName;
		
		if(id1 == id2 && name1.equals(name2)) {
			return true;
		}
		else {
			return false;
		}
	}
		else {
			IO.println("Onject are not Comparable ");
			return false;
		}
		
		
	}
}

