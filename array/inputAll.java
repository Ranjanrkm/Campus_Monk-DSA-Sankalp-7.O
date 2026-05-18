import java.util.*;

public class inputAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read the full input line
        String input = sc.nextLine().trim(); // Removes leading/trailing spaces

        // Step 2: Remove brackets if present
        if ((input.startsWith("[") && input.endsWith("]")) ||
            (input.startsWith("{") && input.endsWith("}"))) {
            input = input.substring(1, input.length() - 1).trim();
        }

        // Step 3: Replace commas with space for uniform splitting
        input = input.replaceAll(",", " ").replaceAll("\\s+", " ");

        // Step 4: Split the cleaned string by space
        String[] arr = input.split(" ");

        // Step 5: Convert strings to integers and store in ArrayList
        ArrayList<Integer> ar = new ArrayList<>();
        for (String token : arr) {
            if (!token.isEmpty()) { // Avoid empty strings
                int num = Integer.parseInt(token.trim());
                ar.add(num);
            }
        }

        // Step 6: Print the numbers
        for (int i : ar) {
            System.out.print(i + " ");
        }
    }
}
