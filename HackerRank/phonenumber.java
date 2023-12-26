import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static String getPhoneNumber(String s) {
        Map<String, Integer> wordToNumberMap = new HashMap<>();
        wordToNumberMap.put("zero", 0);
        wordToNumberMap.put("one", 1);
        wordToNumberMap.put("two", 2);
        wordToNumberMap.put("three", 3);
        wordToNumberMap.put("four", 4);
        wordToNumberMap.put("five", 5);
        wordToNumberMap.put("six", 6);
        wordToNumberMap.put("seven", 7);
        wordToNumberMap.put("eight", 8);
        wordToNumberMap.put("nine", 9);
        wordToNumberMap.put("ten", 10);

        String[] words = s.split("\\s+");
        StringBuilder numericForm = new StringBuilder();

        boolean repeatNext = false; // Tracks if the next digit should be repeated
        int repeatCount = 1; // Tracks the number of times to repeat a digit

        for (String word : words) {
            if (word.equals("double")) {
                repeatNext = true;
                repeatCount = 2;
            } else if (word.equals("triple")) {
                repeatNext = true;
                repeatCount = 3;
            } else if (word.matches(".*\\d+.*")) {
                // If the word contains digits, append the digits directly.
                numericForm.append(word.replaceAll("[^\\d]", ""));
            } else {
                int number = wordToNumberMap.getOrDefault(word, -1);
                if (number != -1) {
                    for (int i = 0; i < repeatCount; i++) {
                        numericForm.append(number);
                    }
                    repeatNext = false; // Reset repeatNext
                    repeatCount = 1; // Reset repeatCount
                } else {
                    numericForm.append(word); // If the word is not recognized, keep it as is.
                }
            }
        }

        return numericForm.toString();
    }
}

public class phonenumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.getPhoneNumber(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
