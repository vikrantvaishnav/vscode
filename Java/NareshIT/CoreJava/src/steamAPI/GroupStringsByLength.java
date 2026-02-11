package steamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GroupStringsByLength {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<String> strings = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            strings.add(sc.nextLine());
        }

        Map<Integer, Long> result =
                strings.stream()
                       .collect(Collectors.groupingBy(
                               s -> s.length(),
                               Collectors.counting()
                       ));

        
    

        result.forEach((length, count) ->
                System.out.println(length + " -> " + count)
        );
    }
}
