package lambda_Expression.testPredicate;
import java.util.function.*;

public class CalculationLogic {
	
	public static boolean testpredicate(int num,Predicate<Integer> pre) {
		return pre.test(num);
	}
	
	void main() {
		
		Integer num = Integer.parseInt(IO.readln("Enter a  number"));
		
		IO.println(num+" is even: "+testpredicate(num, (n)->n%2==0));
		
		IO.println(num+" is greater than 10: "+testpredicate(num, (n)-> n>10));
		IO.println(num+" is Prime: "+testpredicate(num, (n)->{
			for(int i=2;i<n/2;i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}));
	} 
}
