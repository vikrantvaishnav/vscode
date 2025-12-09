package com.string;

public class OrderCake {
	
	void main() {
		
		String shape = IO.readln();
		String flavor = IO.readln();
		int quantity =  Integer.parseInt(IO.readln());
		String message = IO.readln();
		
		Cake ck = new OrderCakes();
		IO.println(ck);
		
		Cake ckk = new OrderCakes(shape,flavor,quantity);
		IO.println(ckk);
		
		Cake ck1 = new OrderCakes(shape,flavor,quantity,message);
		IO.println(ck1);
		
	}
	
	

}

abstract class Cake{
	private String shape;
	private String flavor;
	private int quantity;
	public static double price = 400;
	
	public Cake(String shape,String flavor, int quantity) {
		this.shape = shape;
		this.flavor = flavor;
		this.quantity = quantity;
	}
	
	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		return "A "+shape+" "+flavor +"Cake of "+quantity+" KG is Ready @ RS. "+price;
	}
}

class OrderCakes extends Cake{
	
	private String message;
	
	public OrderCakes() {
		super("Round","Vanilla",1);
		message = null;
		
	}
	public OrderCakes(String shape,String flavor,int quantity) {
		super(shape,flavor,quantity);
		message = null;
	}
	public OrderCakes(String shape,String flavor,int quantity,String message) {
		super(shape,flavor,quantity);
		this.message = message;
	}
	
	
	public String toString() {
		
		
		if(message!=null) {
		return "A "+getShape()+" "+getFlavor() +"Cake of "+getQuantity()+" KG is Ready with "+message+" message @ RS. "+price;
	}
		
		return super.toString();
	}
	
}