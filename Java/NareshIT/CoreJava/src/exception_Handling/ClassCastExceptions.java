package exception_Handling;

public class ClassCastExceptions {
	
	void main() {
		handleClassCastException();
	}
	
	
	public static void handleClassCastException() {
		
		Object arr[]= {23,"Hello",45.23,'a',true};
		for (Object obj : arr) {
		 try {
             // Attempting to cast Object to String
             String str = (String) obj;
             System.out.println("Casting successful: " + str);

         } catch (ClassCastException e) {
             // User-friendly error message
             System.out.println(
                 "ClassCastException: Cannot cast " +
                 obj.getClass().getName() +
                 " to String."
             );
             // Printing stack trace for debugging
//             e.printStackTrace();
         }
	}
}
	
}

