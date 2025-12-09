package com.string;

public class ShoppingMall {
	    void main(){
	        int choice = Integer.parseInt(IO.readln());

	            String name = IO.readln();
	            int noItems = Integer.parseInt(IO.readln());
	            String ItemName[] = new String[noItems];
	            double ItemPrice[] = new double[noItems];
	            for(int i=0;i<noItems;i++){
	                ItemName[i]= IO.readln();
	                ItemPrice[i] = Double.parseDouble(IO.readln());
	                if(ItemPrice[i]<=0){
	                    IO.println("Item price cannot be negative.");
	                    System.exit(0);
	                }
	            }
	        switch(choice){
	            case 1 ->{
	                GeneralCustomer general = new GeneralCustomer(name);
	                generateBill(general,ItemPrice);
	                general.displayDetails();
	            }
	            case 2 ->{
	                PrimeCustomer prime = new PrimeCustomer(name);
	                generateBill(prime,ItemPrice);
	                prime.displayDetails();
	            }
	            case 3 ->{
	                VIPCustomer vip = new VIPCustomer(name);
	                generateBill(vip,ItemPrice);
	                vip.displayDetails();
	            }
	        }
	    }
	    public static void generateBill(Customer  cust, double ...prices){
	        cust.calculateBill(prices);
	    }
	}

	class Customer{
	    protected String name;

	    public Customer(String name){
	        this.name = name;
	    }

	    public void calculateBill(double ...prices){

	    }

	    public void displayDetails(){
	        IO.println("Welcome to Hyderabad Mall :\nCustomer: "+this.name);
	    }




	}

	class GeneralCustomer extends Customer{
	    public GeneralCustomer(String name){
	        super(name);
	    }
	    double totalbill=0.0;

	    @Override
	    public void calculateBill(double ...prices){

	        for(double price1 :prices){
	            totalbill += price1; 
	        }
	    }


	    public void displayDetails(){
	        super.displayDetails();
	        IO.println("Total cost RS : "+this.totalbill+"\nDiscount: No discount for general customers.");

	    }
	}

	class PrimeCustomer extends Customer{
	    protected double discountRate = 0.10;

	    public PrimeCustomer(String name){
	        super(name);
	    }
	    double totalbill=0.0;
	    double discountRS=0.0;
	    @Override
	    public void calculateBill(double ...prices){

	        for(double price1 : prices){
	            totalbill += price1;
	        }
	        discountRS = totalbill*discountRate; 
	    }

	    public void displayDetails(){
	        super.displayDetails();
	        IO.println("Total cost RS : "+totalbill+"\nDiscount RS : "+discountRS+"\nFinal amount RS : "+(totalbill-discountRS));
	    }
	}

	class VIPCustomer extends Customer{
	    protected double discountRate = 0.15;

	    public VIPCustomer(String name){
	        super(name);
	    }

	    double totalbill=0.0;
	    double discountRS=0.0;

	    @Override
	    public void calculateBill(double ...prices){
	        for(double price1 : prices){
	            totalbill += price1;
	        }
	        discountRS = totalbill*discountRate;
	    }

	    public void displayDetails(){
	        super.displayDetails();
	        IO.println("Total cost RS : "+totalbill+"\nDiscount RS : "+discountRS+"\nFinal amount RS : "+(totalbill-discountRS));
	    }
	
}
