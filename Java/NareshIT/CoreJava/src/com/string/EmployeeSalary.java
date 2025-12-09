package com.string;


public class EmployeeSalary{
    void main(){
        int choice = Integer.parseInt(IO.readln());

        switch(choice){
            case  1 ->{
                int id = Integer.parseInt(IO.readln());
                String name = IO.readln();
                double salary = Double.parseDouble(IO.readln());
                if(salary <=0){
                    IO.println("Salary can't be negative!!!");
                    System.exit(0);
                }
                FullTimeEmployee full = new FullTimeEmployee(salary, id, name);
                IO.println(full);

            }
            case 2 ->{
                int id = Integer.parseInt(IO.readln());
                String name = IO.readln();
                double hourlyRate = Double.parseDouble(IO.readln());
                if(hourlyRate <=0){
                    IO.println("Employee hourly rate can't be zero OR Negative");
                    System.exit(0);
                }
                int hourWorked = Integer.parseInt(IO.readln());
                PartTimeEmployee part = new PartTimeEmployee(hourlyRate ,hourWorked, id ,name);
                IO.println(part);
            }
        }
    }
}

class Employee{
    protected int id;
    protected String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public double calculateSalary(){
        return 0.0;
    }
}

class FullTimeEmployee extends Employee{
    protected double salary;

    public FullTimeEmployee(double salary,int id, String name){
        super(id,name);
        this.salary = salary;
    }

    @Override
    public double calculateSalary(){
        return salary;
    }

    public String toString(){
        return name+" Salary is : "+calculateSalary();
    }
}

class PartTimeEmployee extends Employee{
    protected double hourlyRate;
    protected int hourWorked;

    public PartTimeEmployee(double hourlyRate, int hourWorked,int id, String name){
        super(id,name);
        this.hourlyRate = hourlyRate;
        this.hourWorked = hourWorked;
    }

    @Override
    public double calculateSalary(){
        return hourlyRate*hourWorked;
    }

    public String toString(){
        return name+" Salary is :"+calculateSalary();
    }
}
