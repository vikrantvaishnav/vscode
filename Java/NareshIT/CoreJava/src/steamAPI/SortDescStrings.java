package steamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortDescStrings {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        List<String> strings = new ArrayList<>();

    

        for(int i = 0; i < n; i++) {
            strings.add(sc.nextLine());
        }

        IO.println("Sorted Strings in Descending Order:");
        strings.stream()
               .sorted(Comparator.reverseOrder())
               .forEach(System.out::println);
    }
}