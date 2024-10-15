import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringCalculator {
    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0; // Return 0 for an empty string
        }

        // Default delimiter
        String delimiter = "[,\n]";
        
        // Check if custom delimiter is provided
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterIndex); // Custom delimiter
            numbers = numbers.substring(delimiterIndex + 1);  // Numbers part after delimiter declaration
        }

        // Split the input string by the delimiter
        String[] numArray = numbers.split(delimiter);

        int sum = 0;
        List<String> negativeNumbers = new ArrayList<>();

        // Parse and sum numbers, and collect negative numbers
        for (String num : numArray) {
            int number = Integer.parseInt(num.trim()); // Ensure to trim the number
            if (number < 0) {
                negativeNumbers.add(num); // Collect negative numbers
            }
            sum += number;
        }

        // Throw exception if there are negative numbers
        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + String.join(",", negativeNumbers));
        }

        return sum;
    }
}
