package lambda_Expression.acceptConsumer;
import java .util.function.*;
public class ValueModifier {
	
	public static void modifyvalue(Integer value, Consumer<Integer> con) {
		con.accept(value);
	}
	
	void main() {
		Integer num = Integer.parseInt(IO.readln("Enter a number"));
		
		modifyvalue(num, (num1)-> IO.println("After doubling the value:"+num1*2));
		
		modifyvalue(num, (num1)-> IO.println("After incrementing the value by 3: "+(num1+3)));
		
		if(num>0) {
		modifyvalue(num, (num1)-> IO.println("After squaring the value: "+num1*num1));
		}
	}

}
