package exception_Handling;

public class NumberFormatExceptions {
	
	void main() {
		String str1 = IO.readln();
		
		
		handleExceptions(str1);
		
		handleExceptions(null);
	}
	
	public static void handleExceptions (String str) {
		
		try{
			
			IO.println("Length of the input string:"+str.length());
			int n = Integer.parseInt(str);
			IO.println("Converted to integer:"+n);
			System.out.println("Uppercase version: " + str.toUpperCase());
			
			
			
		}
		catch(NumberFormatException | NullPointerException e) {
			
			if(e instanceof NumberFormatException) {
				IO.println("NumberFormatException: Input is not a valid integer.");
			}
			else if(e instanceof NullPointerException) {
				IO.println("NullPointerException: Input is null.");
			}
			
		};
	}
}
