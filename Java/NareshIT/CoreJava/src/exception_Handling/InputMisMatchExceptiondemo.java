package exception_Handling;
import java.util.InputMismatchException;

import java.util.Scanner;

public class InputMisMatchExceptiondemo {

	void  main() {
		Scanner sc = new Scanner(System.in);
		try {
		int num = sc.nextInt();
		IO.println(num);
		}
		catch(InputMismatchException e){
			IO.println("Inpur must be integer");
			IO.println(e.getMessage());
			e.printStackTrace();
			IO.println(e.toString());
		}
	}
}
