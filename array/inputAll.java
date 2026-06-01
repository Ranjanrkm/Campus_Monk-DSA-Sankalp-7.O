/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to read a single line of input,
 * clean messy formatting like brackets, braces, commas,
 * and extra spaces, then extract all integers and print
 * them in order.
 *
 * The program should handle inputs like:
 * - [1,2,3,4]
 * - {1, 2, 3, 4}
 * - 1,2,3,4
 * - 1 2 3 4
 * - [1, 2, 3, 4]
 *
 * This is a very useful TCS NQT-style input parser
 * for mixed or unclear array formats.
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - A single line containing integers in any of these
 *   forms:
 *   [1,2,3,4]
 *   {1, 2, 3, 4}
 *   1,2,3,4
 *   1 2 3 4
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - Print all extracted integers in one line
 *   separated by spaces.
 *
 * ==========================================
 * Dry Run Example 1:
 * ==========================================
 * Input:
 * [1, 2, 3, 4]
 *
 * Step-by-step working:
 * 1. Read the full line.
 * 2. Remove outer brackets.
 * 3. Replace commas with spaces.
 * 4. Normalize multiple spaces.
 * 5. Split the line into tokens.
 * 6. Convert each token into integer.
 * 7. Print all numbers.
 *
 * Output:
 * 1 2 3 4
 *
 * ==========================================
 * Dry Run Example 2:
 * ==========================================
 * Input:
 * {10,20,30,40}
 *
 * Step-by-step working:
 * 1. Read the full line.
 * 2. Remove outer braces.
 * 3. Replace commas with spaces.
 * 4. Split and parse numbers.
 * 5. Print numbers in order.
 *
 * Output:
 * 10 20 30 40
 */

import java.util.*;

public class inputAll {

    public static void main(String[] args) {

        // Create Scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // Step 1: Read the full input line
        String input = sc.nextLine().trim();

        // Safety check: if the line is empty, stop safely
        if (input.isEmpty()) {
            sc.close();
            return;
        }

        // Step 2: Remove brackets or braces if present
        // This handles inputs like [1,2,3] or {1,2,3}
        if ((input.startsWith("[") && input.endsWith("]")) ||
            (input.startsWith("{") && input.endsWith("}"))) {
            input = input.substring(1, input.length() - 1).trim();
        }

        // Step 3: Replace commas with spaces
        // Then collapse multiple spaces into a single space
        input = input.replaceAll(",", " ").replaceAll("\\s+", " ");

        // Step 4: Split the cleaned string by space
        String[] arr = input.split(" ");

        // Step 5: Convert strings to integers and store in ArrayList
        ArrayList<Integer> ar = new ArrayList<>();

        for (String token : arr) {
            if (!token.isEmpty()) {
                int num = Integer.parseInt(token.trim());
                ar.add(num);
            }
        }

        // Step 6: Print the numbers in one line with proper spacing
        for (int i = 0; i < ar.size(); i++) {
            System.out.print(ar.get(i));
            if (i != ar.size() - 1) {
                System.out.print(" ");
            }
        }

        // Close Scanner
        sc.close();
    }

    /*
     * ==========================================
     * IMPORTANT NOTES FOR REVISION:
     * ==========================================
     * 1. nextLine() is used because the input may contain
     *    spaces, commas, braces, or brackets.
     *
     * 2. trim() removes unwanted leading and trailing spaces.
     *
     * 3. Brackets [ ] and braces { } are removed first
     *    to avoid parsing errors.
     *
     * 4. replaceAll(",", " ") converts commas into spaces.
     *
     * 5. replaceAll("\\s+", " ") collapses multiple spaces
     *    into a single space.
     *
     * 6. ArrayList is used because the number of values
     *    may vary depending on the input.
     *
     * 7. Integer.parseInt() converts string tokens
     *    into integer values.
     *
     * ==========================================
     * COMMON BEGINNER MISTAKES:
     * ==========================================
     * 1. Forgetting to remove brackets before parsing.
     *
     * 2. Not using trim(), which may cause invisible
     *    space-related errors.
     *
     * 3. Using split(" ") directly on messy input.
     *
     * 4. Forgetting to handle extra commas or spaces.
     *
     * 5. Printing extra trailing space at the end.
     *    Hidden test cases may fail because of this.
     *
     * ==========================================
     * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
     * ==========================================
     * "This program is a safe input parser for mixed
     * array formats. I read the entire line using
     * nextLine(), then clean brackets, braces, commas,
     * and extra spaces. After that, I split the input
     * into tokens and convert them into integers using
     * Integer.parseInt(). Finally, I print the extracted
     * numbers in order. This is useful in TCS NQT-style
     * problems where input format may not be fixed."
     *
     * ==========================================
     * TIME COMPLEXITY & SPACE COMPLEXITY:
     * ==========================================
     * TIME COMPLEXITY: O(n)
     * The program scans the input line and processes each
     * character/token once.
     *
     * SPACE COMPLEXITY: O(n)
     * ArrayList stores the extracted integers.
     *
     * ==========================================
     * INTERVIEW QUICK ANSWER:
     * ==========================================
     * Q: Why do we use nextLine() here?
     *
     * Answer:
     * We use nextLine() because the input may contain
     * commas, spaces, brackets, or braces. Reading the
     * full line first allows us to clean and parse the
     * input safely.
     *
     * ------------------------------------------
     *
     * Q: Why is ArrayList used instead of array?
     *
     * Answer:
     * ArrayList is used because the number of integers
     * is not fixed in advance. It can grow dynamically
     * as we extract values from the input.
     */
}