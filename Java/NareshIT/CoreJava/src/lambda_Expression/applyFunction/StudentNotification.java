package lambda_Expression.applyFunction;
import java.util.function.*;

public class StudentNotification {
	
	
	void main() {
	
	Consumer<String> message = (name)->IO.println("Welcome "+name);
	
	Integer num = Integer.parseInt(IO.readln("Enter number of student:"));
	
	int n=1;
	
	while(num>0) {
		IO.println("Enter details for Student :"+n++);
		Integer Id = Integer.parseInt(IO.readln("Enter ID"));
		String name = IO.readln("Enter name");
		String course = IO.readln("Enter course:");
		
		Consumer<String> msg = (str)->IO.println("welcome to the "+course+" course");
		num--;
		message.accept(name);
		msg.accept(course);
	}
	
	
}

}

record student(Integer id,String name,String course) {}
