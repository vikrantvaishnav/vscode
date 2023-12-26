package Collection_Framework;
import java.util.ArrayList;
import java.util.List;

public class Array_List {
    
    public static void main(String[] args) {
        
        List<Integer> student = new ArrayList<>();

        // add element at the last index
        student.add(1);
        student.add(2);
        student.add(3);

        //add elemet at perticular potion
        student.add(1,8);

        //add a another List in other present List
        List<Integer> num = new ArrayList<>();
        num.add(56);
        num.add(86);

        student.addAll(num);

       System.out.println( student.size());

        System.out.println(student);
        
    }
   
}
