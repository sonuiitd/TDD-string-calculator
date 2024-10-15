public class StringCalculator {
    public static int add(String numbers) {
    if (numbers.isEmpty()) {
        return 0;
    }
    String delimiter = "[,\n]";  // Default delimiters
    if (numbers.startsWith("//")) {
        int delimiterIndex = numbers.indexOf("\n");
        delimiter = numbers.substring(2, delimiterIndex);
        numbers = numbers.substring(delimiterIndex + 1);
    }
    String[] numArray = numbers.split(delimiter);
    int sum = 0;
    for (String num : numArray) {
        sum += Integer.parseInt(num);
    }
    return sum;
}




}
