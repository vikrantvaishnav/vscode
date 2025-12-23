package exception_Handling;

import java.util.Scanner;


public class IllegalArgumentExceptionDemo {


	    
	    public static double calculateArea(double length, double width) {
	        if (length <= 0 || width <= 0) {
	            throw new IllegalArgumentException("Length and width must be > 0.");
	        }
	        return length * width;
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter length of rectangle: ");
	            double length = sc.nextDouble();

	            System.out.print("Enter width of rectangle: ");
	            double width = sc.nextDouble();

	            double area = calculateArea(length, width);

	            System.out.println(
	                "Area of rectangle with length " + length +
	                " and width " + width + " is: " + area
	            );
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            sc.close();
	        }
	    }
	}

