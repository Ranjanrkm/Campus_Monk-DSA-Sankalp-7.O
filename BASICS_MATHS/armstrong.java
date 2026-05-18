import java.util.*;

/*
Problem Statement:
Check whether a given number is an Armstrong number or not.

What is an Armstrong Number?
- For a number with k digits, each digit is raised to the power k.
- Then all those values are added.
- If the final sum is equal to the original number, it is an Armstrong number.

Example:
153 = 1^3 + 5^3 + 3^3 = 153
So, 153 is an Armstrong number.

Input Format:
- A single integer n

Output Format:
- If n is Armstrong:
  Yes it's an armstrong number
- Otherwise:
  No it's not a armstrong number

Dry Run Example 1:
Input:
153

Working:
Number = 153
Number of digits = 3

Step 1:
Last digit = 3
Sum = 3^3 = 27

Step 2:
Last digit = 5
Sum = 27 + 5^3 = 27 + 125 = 152

Step 3:
Last digit = 1
Sum = 152 + 1^3 = 153

Final:
Sum = 153
Since sum == original number, it is Armstrong.

Output:
Yes it's an armstrong number

Dry Run Example 2:
Input:
123

Working:
Number = 123
Number of digits = 3

Step 1:
3^3 = 27

Step 2:
2^3 = 8
Sum = 35

Step 3:
1^3 = 1
Sum = 36

Final:
Sum = 36
Since sum != original number, it is not Armstrong.

Output:
No it's not a armstrong number
*/

public class armstrong {

    // This method checks whether the given number is Armstrong or not
    public static boolean isArmstrong(int n) {

        // Armstrong number is usually defined for non-negative numbers
        if (n < 0) {
            return false;
        }

        // Store original number so we can compare at the end
        int original = n;

        // Count number of digits
        // Example: 153 has 3 digits
        int cnt = String.valueOf(n).length();

        // This variable stores the sum of powered digits
        int sum = 0;

        // Extract digits one by one from right to left
        while (n != 0) {
            int ld = n % 10; // ld = last digit

            // Add digit raised to the power of total digits
            sum += (int) Math.pow(ld, cnt);

            // Remove last digit
            n /= 10;
        }

        // If sum equals original number, it is Armstrong
        return sum == original;
    }

    public static void main(String args[]) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read the number
        int n = sc.nextInt();

        // Call Armstrong check function
        if (isArmstrong(n)) {
            System.out.println("Yes it's an armstrong number");
        } else {
            System.out.println("No it's not a armstrong number");
        }

        // Close Scanner
        sc.close();
    }
}