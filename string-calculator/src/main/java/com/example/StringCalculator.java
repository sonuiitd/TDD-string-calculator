public class StringCalculator {
    public static int add(String numbers) {
    if (numbers.isEmpty()) {
        return 0;
    }
    return Integer.parseInt(numbers);  // Return the single number
}

}
