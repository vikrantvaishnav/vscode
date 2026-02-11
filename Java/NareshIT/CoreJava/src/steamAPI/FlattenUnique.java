package steamAPI;

import java.util.ArrayList;
import java.util.List;

public class FlattenUnique {

    void main(){
        int x = Integer.parseInt(IO.readln());
        List<List<Integer>> list = new ArrayList<>();
        while(x>0){
            List<Integer> li = new ArrayList<>(); 
            int n = Integer.parseInt(IO.readln());
            while(n>0){
                li.add(Integer.parseInt(IO.readln()));
                n--;
            }
            list.add(li);
            x--;
        }
            IO.println("Flattened List without Duplicates:");
            list.stream().flatMap(li -> li.stream()).distinct().forEach(IO::println);
    }
}