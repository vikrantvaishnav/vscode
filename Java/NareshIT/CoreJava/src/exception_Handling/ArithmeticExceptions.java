package exception_Handling;

import java.util.Scanner;

public class ArithmeticExceptions {
	
	void main() {
		 Scanner sc = new Scanner(System.in);
		try {
			  System.out.print("Enter dividend : ");
	            int dividend = sc.nextInt();

	            System.out.print("Enter divisor : ");
	            int divisor = sc.nextInt();

	            int result = performDivision(dividend, divisor);
	            System.out.println("Result of division : " + result);
		}
		catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        };

        sc.close();
		
	}
	
	public static int performDivision(int dividend, int divisor) {
        if (divisor == 0) {
            // Explicitly throwing ArithmeticException
            throw new ArithmeticException(
                "Division by zero: dividend=" + dividend + ", divisor=" + divisor
            );
        }
        return dividend / divisor;
    }
	
	
}