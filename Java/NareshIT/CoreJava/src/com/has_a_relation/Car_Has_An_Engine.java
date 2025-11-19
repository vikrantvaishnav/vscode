package com.has_a_relation;

import java.util.Scanner;

public class Car_Has_An_Engine{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String model = sc.nextLine();
        int engineCapacity = sc.nextInt();
        sc.nextLine();
        String make = sc.nextLine();
        String Model = sc.nextLine();
        int year = sc.nextInt();

        Car c = new Car(model,engineCapacity,make,Model,year);

        System.out.println(c);

        sc.close();
    }
}

class Engine{
    private String model;
    private int engineCapacity;

    public Engine(String model,int engineCapacity){
        this.model = model;

        if(engineCapacity<=0){
            System.out.println("Error Invalid Input");
            System.exit(0);
        }
        else{

            this.engineCapacity = engineCapacity;
        }
    }

    public String getModel(){
        return model;
    }

    public int getEngineCapacity(){
        return engineCapacity;
    }

    @Override
    public String toString(){
        return "Engine Details -> Engine Model: "+this.model+", Engine Capacity: "+this.engineCapacity+"cc";
    }
}

class Car{
    private String make;
    private String model;
    private int year;
    private final Engine engine;

    public Car(String Model,int engineCapacity,String make, String model,int year){
        this.engine = new Engine(Model,engineCapacity);
        this.make = make;
        this.model = model;
        if(year<=0){
            System.out.println("Error Invalid Input");
            System.exit(0);
        }
        else{
            this.year = year;
        }
    }

    @Override
    public String toString(){
        return "Car Make: "+this.make+", Car Model: "+this.model+", Year: "+this.year+"\n"+engine.toString();
    }

    


}