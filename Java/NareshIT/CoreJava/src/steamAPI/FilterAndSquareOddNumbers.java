package steamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterAndSquareOddNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> numbers = new ArrayList<>();

      

        for(int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

  
        numbers.stream()
               .filter(num -> num % 2 != 0)  
               .map(num -> num * num)         
               .forEach(System.out::println); 
    }
}

