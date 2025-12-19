package lambda_Expression.applyFunction;

import java.util.Random;
import java.util.function.Supplier;

public class PasswordGenerator {
	
	
	void main() {
	String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	 String lower = "abcdefghijklmnopqrstuvwxyz";
	 String digits = "0123456789";
	 String special = "@#$%!&*";
	 
	 String totalStrinng = upper+lower+digits+special;
	 
	 Supplier<String> pass = ()->{ 
		 
		 Random random = new Random();
		 StringBuilder builder = new StringBuilder();
		 
		 for(int i=1;i<=8;i++) {
			 
			 int randomnumber = random.nextInt(totalStrinng.length());
			 builder.append(totalStrinng.charAt(randomnumber));
		 }
		 
		 return builder.toString();
	 };
	 
	 IO.println("PAssword is "+pass.get());
}
}
