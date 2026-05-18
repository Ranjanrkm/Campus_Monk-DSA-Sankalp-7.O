
import java.util.*;

/*
Problem Statement:
Check whether a given number is a Palindrome number or not.

What is a Palindrome Number?
- A number is called palindrome if it remains the same
  when its digits are reversed.

Example:
121  -> Palindrome
1331 -> Palindrome
123  -> Not Palindrome

Input Format:
- A single integer n

Output Format:
- Print "Yes" if the number is palindrome
- Otherwise print "No"

Dry Run Example 1:
Input:
121

Working:
Original number = 121

Step 1:
lastDigit = 1
reverse = 0 * 10 + 1 = 1

Step 2:
lastDigit = 2
reverse = 1 * 10 + 2 = 12

Step 3:
lastDigit = 1
reverse = 12 * 10 + 1 = 121

Final:
reverse = 121
original = 121

Since both are equal,
the number is palindrome.

Output:
Yes

Dry Run Example 2:
Input:
123

Working:
Original number = 123

Step 1:
lastDigit = 3
reverse = 3

Step 2:
lastDigit = 2
reverse = 32

Step 3:
lastDigit = 1
reverse = 321

Final:
reverse = 321
original = 123

Since both are not equal,
the number is not palindrome.

Output:
No
*/

public class palindrome {

    // This method checks whether the number is palindrome or not
    public static boolean isPalindrome(int n) {

        // Store original number for comparison later
        int originalNumber = n;

        // This variable will store the reversed number
        int reverse = 0;

        // Reverse the number digit by digit
        while (n != 0) {

            // Extract last digit
            int lastDigit = n % 10;

            // Build reversed number
            reverse = reverse * 10 + lastDigit;

            // Remove last digit from n
            n /= 10;
        }

        // If reversed number equals original number,
        // then it is palindrome
        return reverse == originalNumber;
    }

    public static void main(String args[]) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read the number
        int n = sc.nextInt();

        // Check palindrome condition
        if (isPalindrome(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Close Scanner
        sc.close();
    }
}

/*
Important Notes for Revision:
1) n % 10 gives the last digit.
2) n / 10 removes the last digit.
3) reverse = reverse * 10 + digit
   is used to build the reversed number.
4) If reversed number == original number,
   then the number is palindrome.
5) Time Complexity:
   O(number of digits)
*/