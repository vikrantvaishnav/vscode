import java.util.ArrayList;
import java.util.Collections;
public class ArrayListJavaNotes {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrlist = new ArrayList<Integer>();

        //add elements
        arrlist.add(0);
        arrlist.add(2);
        arrlist.add(3);

        System.out.println(arrlist);

        //get element
        int E = arrlist.get(0);
        System.out.println(E);

        //add element in between
        arrlist.add(1,1);
        System.out.println(arrlist);

        //set element
        arrlist.set(0,5);
        System.out.println(arrlist);

        //Remove element
        arrlist.remove(3);
        System.out.println(arrlist);

        //size of arrayList
        System.out.println(arrlist.size());

        //sort array list
        Collections.sort(arrlist);
        System.out.println(arrlist);

    }
}
