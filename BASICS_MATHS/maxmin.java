import java.util.*;

/*
Problem Statement:
Find the maximum digit and minimum digit present in a given number.

Example:
If the number is:
583920

Digits are:
5, 8, 3, 9, 2, 0

Maximum digit = 9
Minimum digit = 0

Input Format:
- A single integer n

Output Format:
Max is : <maximum digit> and Min is : <minimum digit>

Dry Run Example 1:
Input:
583920

Working:
Initial:
max = -2147483648
min = 2147483647

Step 1:
lastDigit = 0
max = 0
min = 0

Step 2:
lastDigit = 2
max = 2
min = 0

Step 3:
lastDigit = 9
max = 9
min = 0

Step 4:
lastDigit = 3
max = 9
min = 0

Step 5:
lastDigit = 8
max = 9
min = 0

Step 6:
lastDigit = 5
max = 9
min = 0

Final:
Maximum digit = 9
Minimum digit = 0

Output:
Max is : 9 and Min is : 0

Dry Run Example 2:
Input:
7641

Working:
Digits:
1, 4, 6, 7

Maximum digit = 7
Minimum digit = 1

Output:
Max is : 7 and Min is : 1
*/

public class maxmin {

    // This method finds the maximum and minimum digit in a number
    public static void MaxMin(int n) {

        // Convert negative number to positive
        // because digits are normally handled as positive values
        if (n < 0) {
            n = -n;
        }

        // Special case:
        // If number is 0, then both max and min are 0
        if (n == 0) {
            System.out.println("Max is : 0 and Min is : 0");
            return;
        }

        // Initialize max with smallest possible integer value
        int max = Integer.MIN_VALUE;

        // Initialize min with largest possible integer value
        int min = Integer.MAX_VALUE;

        // Extract digits one by one
        while (n != 0) {

            // Get last digit
            int lastDigit = n % 10;

            // Update maximum digit if needed
            max = Math.max(lastDigit, max);

            // Update minimum digit if needed
            min = Math.min(lastDigit, min);

            // Remove last digit
            n /= 10;
        }

        // Print final answer
        System.out.println("Max is : " + max + " and Min is : " + min);
    }

    public static void main(String args[]) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read number from user
        int n = sc.nextInt();

        // Call method to find maximum and minimum digit
        MaxMin(n);

        // Close Scanner
        sc.close();
    }
}

/*
Important Notes for Revision:
1) n % 10 gives the last digit.
2) n / 10 removes the last digit.
3) Math.max(a, b) returns the larger value.
4) Math.min(a, b) returns the smaller value.
5) Always handle edge cases like:
   - negative numbers
   - n = 0
*/