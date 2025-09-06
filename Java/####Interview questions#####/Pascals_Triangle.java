import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascals_Triangle {
     public static String encryptNumber(String digits) {
        List<Integer> arr = new ArrayList<>();
        
        // Convert string digits to list of integers
        for (char c : digits.toCharArray()) {
            arr.add(c - '0');
        }
        
        // Keep reducing until only 2 digits remain
        while (arr.size() > 2) {
            List<Integer> next = new ArrayList<>();
            for (int i = 0; i < arr.size() - 1; i++) {
                int sum = arr.get(i) + arr.get(i + 1);
                next.add(sum % 10);  // take only the rightmost digit
            }
            arr = next;
        }
        
        // Convert final 2 digits to string
        return "" + arr.get(0) + arr.get(1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digits: ");
        String digits = sc.nextLine().trim();
        
        String encrypted = encryptNumber(digits);
        System.out.println("Encrypted Number: " + encrypted);
    }
}
