package com.has_a_relation;

import java.util.Scanner;

public class ModelingEmployee_and_AddressDetails{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String street = sc.nextLine();
        String city = sc.nextLine();
        String name = sc.nextLine();

        Address d = new Address(street,city);
        Person p = new Person(name,d);
        
        System.out.println(p);

    }
}

class Address{
    private String street;
    private String city;

    public Address(String street,String city){
        this.street = street;
        this.city = city;
    }

    public String getStreet(){
        return street;
    }

    public String getCity(){
        return city;
    }


    public String toString(){
        return "Address: Street - "+this.street+", City - "+this.city;
    }
}

class Person{
    private String name;
    private Address address;

    public Person(String name, Address address){
        this.name = name;
        this.address = address;
    }

    public String toString(){
        return "Person Name: "+this.name+"\n"+address.toString();
    }
}