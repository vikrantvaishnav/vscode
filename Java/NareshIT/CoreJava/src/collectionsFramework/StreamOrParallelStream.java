package collectionsFramework;

import java.util.Vector;

public class StreamOrParallelStream {



    public static void main(String[] args) {

        Vector<String> listOfCity = new Vector<>();

        listOfCity.add("Hyderabad");
        listOfCity.add("Kolkata");
        listOfCity.add("Pune");
        listOfCity.add("Indore");
        listOfCity.add("Mumbai");

        System.out.println("Using stream():");

        listOfCity.stream().forEach(System.out::println);

        System.out.println("\nUsing parallelStream():");

        listOfCity.parallelStream().forEach(System.out::println);
    }
}
