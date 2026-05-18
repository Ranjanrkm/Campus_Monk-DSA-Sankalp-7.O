import java.util.*;

/*
Problem Statement:
Check whether a given number is an Armstrong number or not.

Input Format:
- A single integer n

Output Format:
- Print "Yes it's an armstrong number" if n is Armstrong
- Print "No it's not a armstrong number" if n is not Armstrong

Dry Run Example 1:
Input:
153

Working:
Digits = 3
1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

Output:
Yes it's an armstrong number

Dry Run Example 2:
Input:
123

Working:
Digits = 3
1^3 + 2^3 + 3^3 = 1 + 8 + 27 = 36

Output:
No it's not a armstrong number
*/

public class armstrong {

    // This method checks whether the given number is Armstrong or not
    public static boolean isArmstrong(int n) {
        // Store original number for final comparison
        int temp = n;

        // Count number of digits
        // Example: 153 has 3 digits
        int cnt = String.valueOf(temp).length();

        // This variable stores the sum of each digit raised to the power of total digits
        int sum = 0;

        // Reset temp back to original number
        temp = n;

        // Extract each digit one by one from the right side
        while (temp != 0) {
            int ld = temp % 10; // ld = last digit

            // Add digit^(number of digits) to sum
            sum = sum + (int) Math.pow(ld, cnt);

            // Remove the last digit
            temp /= 10;
        }

        // If the calculated sum is equal to original number,
        // then it is an Armstrong number
        return sum == n;
    }

    public static void main(String args[]) {
        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Read number from user
        int n = sc.nextInt();

        // Check Armstrong condition and print result
        if (isArmstrong(n)) {
            System.out.println("Yes it's an armstrong number");
        } else {
            System.out.println("No it's not a armstrong number");
        }

        // Close Scanner
        sc.close();
    }
}
