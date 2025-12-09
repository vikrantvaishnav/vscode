package com.has_a_relation;

import java.util.Scanner;

public class Change_the_Drive_Scenario{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        String brand = sc.nextLine();
        String model = sc.nextLine();
        int year = Integer.parseInt(sc.nextLine());

        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        Driver d1 = new Driver(name,age);
        Car1 c1 = new Car1(choice,brand,model,year,d1);

        Car1 c2 = new Car1(choice,brand,model,year,d1);
        switch(choice){
            
            case 1 ->{

                String newName = sc.nextLine();
                int newAge = sc.nextInt();
                c1.changeDriver(newName,newAge);
            }
            
        }
        if(choice == 1){
        System.out.println("After Driver Update :");

        }
        else{
            System.out.println("No Driver Change :");
        }
        System.out.println("Car 1: "+c1);
        System.out.println("Car 2: "+c2);
         


    }
}

class Driver{
    private String name;
    private int age;

    public Driver(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return " "+this.name+" ("+this.age+")";
    }
}

class Car1{
    private String brand;
    private String model;
    private int year;
    private Driver driver;
    private int choice;

    public Car1(int choice,String brand, String model, int year, Driver driver){
        this.choice = choice;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.driver = new Driver(driver.getName(),driver.getAge());
    }

    public void changeDriver(String name,int age){
        
        this.driver = new Driver(name,age);    
    }


        public String toString(){

            if(choice ==1){

             return this.brand+" "+this.model+" ("+this.year+"), Driver:"+driver.toString();
            }
            return this.brand+" "+this.model+" ("+this.year+"), Driver:"+driver.toString();
        }
    
}