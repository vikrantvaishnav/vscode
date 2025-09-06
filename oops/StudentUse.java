package oops;
import java.util.Scanner;

public class StudentUse{

   
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        Student s1= new Student();
        s.name="lucky";
        s1.age=19;

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s.name+" "+s1.age);

    }
}