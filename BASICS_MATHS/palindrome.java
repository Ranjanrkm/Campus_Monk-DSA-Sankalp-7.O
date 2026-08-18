import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Check whether a given number is a Palindrome Number
or not.

A number is called a Palindrome Number if it remains
the same after reversing all of its digits.

Examples:

121  -> Palindrome
1331 -> Palindrome
123  -> Not Palindrome

=========================================================
INPUT FORMAT
=========================================================
A single integer n.

Example:
121

According to the uploaded TCS NQT Java I/O material,
when the problem requires one integer, Scanner with
nextInt() is an appropriate input method.

=========================================================
OUTPUT FORMAT
=========================================================
Print:

Yes

if the number is a palindrome.

Otherwise print:

No

Do not print extra prompts such as:
"Enter Number:"
or
"Output:"

=========================================================
DRY RUN EXAMPLE 1
=========================================================
Input:
121

Initial:
originalNumber = 121
reverse = 0

Step 1:
lastDigit = 121 % 10
lastDigit = 1

reverse = 0 * 10 + 1
reverse = 1

n = 12

Step 2:
lastDigit = 12 % 10
lastDigit = 2

reverse = 1 * 10 + 2
reverse = 12

n = 1

Step 3:
lastDigit = 1 % 10
lastDigit = 1

reverse = 12 * 10 + 1
reverse = 121

n = 0

Final:
reverse = 121
originalNumber = 121

reverse == originalNumber

Therefore, it is a palindrome.

Output:
Yes

=========================================================
DRY RUN EXAMPLE 2
=========================================================
Input:
123

Initial:
originalNumber = 123
reverse = 0

Step 1:
lastDigit = 3
reverse = 3

n = 12

Step 2:
lastDigit = 2
reverse = 32

n = 1

Step 3:
lastDigit = 1
reverse = 321

n = 0

Final:
reverse = 321
originalNumber = 123

reverse != originalNumber

Therefore, it is not a palindrome.

Output:
No

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class palindrome {

    /*
    =====================================================
    METHOD NAME : isPalindrome
    =====================================================

    Purpose:
    Check whether the given number is a palindrome.

    Approach:
    1. Store the original number.
    2. Extract each digit using % 10.
    3. Build the reversed number.
    4. Remove the last digit using / 10.
    5. Compare reverse with original number.

    A long variable is used internally for the
    reversed value so that integer overflow is avoided
    while reversing values such as Integer.MIN_VALUE.
    =====================================================
    */
    public static boolean isPalindrome(int n) {

        /*
        Negative numbers are not considered palindrome
        numbers in the standard integer definition.

        Example:
        -121 is not treated as a palindrome because
        reversing its digits does not preserve the
        same signed integer.
        */
        if (n < 0) {
            return false;
        }

        /*
        Store the original number because 'n' will be
        reduced digit by digit inside the loop.

        Example:
        n = 121

        originalNumber = 121
        */
        int originalNumber = n;

        /*
        Use long for the reversed number.

        This is safer than int because the reversed value
        can temporarily exceed the int range.
        */
        long reverse = 0;

        /*
        Continue processing until all digits
        have been removed from n.
        */
        while (n != 0) {

            /*
            Extract the last digit.

            Example:
            n = 121

            121 % 10 = 1

            So:
            lastDigit = 1
            */
            int lastDigit = n % 10;

            /*
            Add the extracted digit to the end
            of the reversed number.

            Formula:
            reverse = reverse * 10 + lastDigit

            Example:
            reverse = 12
            lastDigit = 1

            reverse = 12 * 10 + 1
                    = 121
            */
            reverse = reverse * 10 + lastDigit;

            /*
            Remove the last digit from n.

            Example:
            n = 121

            121 / 10 = 12
            */
            n /= 10;
        }

        /*
        Compare the reversed number with
        the original number.

        If both are equal:
        Palindrome

        Otherwise:
        Not Palindrome
        */
        return reverse == originalNumber;
    }

    public static void main(String args[]) {

        /*
        Create a Scanner object to read input
        from standard input.

        This follows the size-independent scalar
        integer input style used in the uploaded PDFs.
        */
        Scanner sc = new Scanner(System.in);

        /*
        Read the integer entered by the user.

        Example Input:
        121

        After execution:
        n = 121
        */
        int n = sc.nextInt();

        /*
        Call the palindrome checking method.

        If the method returns true, print "Yes".
        Otherwise, print "No".
        */
        if (isPalindrome(n)) {

            /*
            Print exactly the required output.
            */
            System.out.println("Yes");

        } else {

            /*
            Print exactly the required output.
            */
            System.out.println("No");
        }

        /*
        Close Scanner after input processing.
        */
        sc.close();
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. DIGIT REVERSAL PATTERN

   n % 10
   -> extracts the last digit.

   n / 10
   -> removes the last digit.

   This pattern is fundamental for digit-based
   number problems in Java and DSA.

2. REVERSE NUMBER FORMULA

   reverse = reverse * 10 + lastDigit

   Multiplying reverse by 10 shifts the existing
   digits left, and adding lastDigit appends the
   newly extracted digit.

3. JAVA INTEGER OVERFLOW CONCEPT

   The reversed number is stored in long instead
   of int because an int reversal can overflow for
   values near the integer limits.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I first store the original number because I need
it for comparison after reversing the number.

Then I extract each digit from right to left using
the modulus operator.

I build the reversed number using reverse multiplied
by 10 plus the current digit.

After removing all digits, I compare the reversed
value with the original value.

If both are equal, the number is a palindrome.
Otherwise, it is not.

The solution processes each digit once and uses
constant auxiliary space."

=========================================================
TIME COMPLEXITY
=========================================================

O(d)

Where d is the number of digits in the input.

Reason:
Each digit is extracted and processed exactly once.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:
Only a constant number of variables are used.
No array, ArrayList, StringBuilder, or other
data structure is created.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Why do we use reverse = reverse * 10 + lastDigit?

Answer:
Multiplying reverse by 10 shifts its current digits
one position to the left. Adding lastDigit then places
the newly extracted digit at the last position.

---------------------------------------------------------

Q2. Why is long used for reverse instead of int?

Answer:
Because the reversed number can exceed the int range
during calculation. Using long prevents integer overflow
for extreme int inputs.

---------------------------------------------------------

Q3. What Java/DSA technique is used to extract digits?

Answer:
The modulus and integer-division technique is used.
n % 10 extracts the last digit, while n / 10 removes
that digit. This is a common pattern in number-based
DSA problems.

=========================================================
END OF FILE
=========================================================
*/