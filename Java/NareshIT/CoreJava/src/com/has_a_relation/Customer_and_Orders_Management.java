package com.has_a_relation;

import java.util.Scanner;

public class Customer_and_Orders_Management{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String orderId = sc.nextLine();
        String itemName = sc.nextLine();
        double price = sc.nextDouble();
        sc.nextLine();
        String name = sc.nextLine();
        String email = sc.nextLine();
        String address = sc.nextLine();
        String mobileNo = sc.nextLine();

        Customer c = new Customer(orderId,itemName,price,name,email,address,mobileNo);

        System.out.println(c);
        
        sc.close();
    }
}

class Order{
    private String orderId;
    private String itemName;
    private double price;

    public Order(String orderId, String itemName, double price){
        this.orderId = orderId;
        this.itemName = itemName;
        this.price = price;
    }

    public String getOrderId(){
        return orderId;
    }
    public String getProductName(){
        return itemName;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return "Order Details:\nOrder ID: "+this.orderId+"\nProduct Name: "+this.itemName+"\nPrice: "+this.price;
    }
}

class Customer{
    private String name;
    private String email;
    private String address;
    private String mobileNo;
    private Order order;

    public Customer(String orderId, String itemName, double price, String name,String email, String address, String mobileNo){
        this.order = new Order(orderId,itemName,price);
        this.name = name;
        this.email = email;
        this.address = address;
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString(){
        return "Customer Details:\nName: "+this.name+"\nEmail: "+this.email+"\nAddress: "+this.address+"\nMobile: "+this.mobileNo+"\n\n"+order.toString();
    }
}