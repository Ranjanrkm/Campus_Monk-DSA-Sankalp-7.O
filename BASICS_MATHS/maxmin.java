import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Find the maximum digit and minimum digit present in
a given integer.

Example:

Input:
583920

Digits:
5, 8, 3, 9, 2, 0

Maximum digit = 9
Minimum digit = 0

=========================================================
INPUT FORMAT
=========================================================
A single integer n.

Example:
583920

=========================================================
OUTPUT FORMAT
=========================================================
Print the maximum and minimum digit in the following
format:

Max is : <maximum digit> and Min is : <minimum digit>

Example:
Max is : 9 and Min is : 0

=========================================================
DRY RUN EXAMPLE 1
=========================================================
Input:
583920

Initial:
max = Integer.MIN_VALUE
min = Integer.MAX_VALUE

Step 1:
lastDigit = 0

max = max(0, Integer.MIN_VALUE) = 0
min = min(0, Integer.MAX_VALUE) = 0

Step 2:
lastDigit = 2

max = max(2, 0) = 2
min = min(2, 0) = 0

Step 3:
lastDigit = 9

max = max(9, 2) = 9
min = min(9, 0) = 0

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

=========================================================
DRY RUN EXAMPLE 2
=========================================================
Input:
7641

Digits extracted from right to left:

1
4
6
7

Initial:
max = Integer.MIN_VALUE
min = Integer.MAX_VALUE

After 1:
max = 1
min = 1

After 4:
max = 4
min = 1

After 6:
max = 6
min = 1

After 7:
max = 7
min = 1

Final:
Maximum digit = 7
Minimum digit = 1

Output:
Max is : 7 and Min is : 1

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class maxmin {

    /*
    =====================================================
    METHOD NAME : MaxMin
    =====================================================

    Purpose:
    Find the maximum and minimum digit present
    in the given number.

    The method extracts digits from right to left
    using:

    n % 10 -> last digit
    n / 10 -> removes last digit
    =====================================================
    */
    public static void MaxMin(int n) {

        /*
        Store the number in long so that even the
        minimum int value, -2147483648, can be safely
        converted to its positive value.

        This avoids integer overflow during:

        -n

        for the extreme negative integer.
        */
        long number = n;

        /*
        Convert a negative number into its positive
        magnitude.

        Example:

        n = -583920

        number = 583920
        */
        if (number < 0) {
            number = -number;
        }

        /*
        Special case:

        If the number is 0, its only digit is 0.

        Therefore:

        Maximum = 0
        Minimum = 0
        */
        if (number == 0) {
            System.out.println("Max is : 0 and Min is : 0");
            return;
        }

        /*
        Initialize max with the smallest possible
        integer value.

        The first extracted digit will replace
        this value.
        */
        int max = Integer.MIN_VALUE;

        /*
        Initialize min with the largest possible
        integer value.

        The first extracted digit will replace
        this value.
        */
        int min = Integer.MAX_VALUE;

        /*
        Continue processing until all digits
        have been extracted.

        Example:

        number = 583920

        The loop processes:

        0 -> 2 -> 9 -> 3 -> 8 -> 5
        */
        while (number != 0) {

            /*
            Extract the last digit using modulus 10.

            Example:

            number = 583920

            lastDigit = 583920 % 10
            lastDigit = 0
            */
            int lastDigit = (int) (number % 10);

            /*
            Update the maximum digit.

            Math.max() returns the larger of
            the two values.

            Example:

            max = 2
            lastDigit = 9

            max becomes 9.
            */
            max = Math.max(lastDigit, max);

            /*
            Update the minimum digit.

            Math.min() returns the smaller of
            the two values.

            Example:

            min = 2
            lastDigit = 0

            min becomes 0.
            */
            min = Math.min(lastDigit, min);

            /*
            Remove the last digit using integer
            division by 10.

            Example:

            number = 583920

            number / 10 = 58392
            */
            number /= 10;
        }

        /*
        Print the final maximum and minimum digits.

        No additional prompt text is used because
        coding platforms require the exact expected
        output format.
        */
        System.out.println("Max is : " + max + " and Min is : " + min);
    }

    public static void main(String args[]) {

        /*
        Create Scanner object to read the integer
        from standard input.
        */
        Scanner sc = new Scanner(System.in);

        /*
        Read the integer entered by the user.

        Example Input:
        583920

        After execution:
        n = 583920
        */
        int n = sc.nextInt();

        /*
        Call the method that finds the maximum
        and minimum digit.
        */
        MaxMin(n);

        /*
        Close Scanner to release the input resource.
        */
        sc.close();
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. DIGIT EXTRACTION TECHNIQUE

   n % 10
   gives the last digit.

   n / 10
   removes the last digit.

2. MAXIMUM AND MINIMUM TRACKING

   Math.max(lastDigit, max)
   updates the largest digit.

   Math.min(lastDigit, min)
   updates the smallest digit.

3. ZERO EDGE CASE

   For n = 0:

   Maximum digit = 0
   Minimum digit = 0

   This case must be handled separately because
   the while loop would otherwise not execute.

4. NEGATIVE NUMBER HANDLING

   The absolute value of the number is used so
   the sign does not become part of the digit
   processing.

5. INTEGER OVERFLOW TRICK

   Using long for the working value safely handles
   Integer.MIN_VALUE before taking its positive value.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I solve this problem by extracting every digit of
the number from right to left.

I use modulus 10 to get the last digit and division
by 10 to remove that digit.

For every extracted digit, I compare it with the
current maximum and minimum values using Math.max()
and Math.min().

After all digits are processed, the maximum and
minimum digit are printed.

I also handle zero and negative numbers separately,
and I use long internally to avoid overflow for
the minimum integer value."

=========================================================
TIME COMPLEXITY
=========================================================

O(d)

Where d is the number of digits in the input number.

Reason:

Each digit is processed exactly once.

For example:

583920 -> 6 digits -> 6 iterations

Therefore:

Time Complexity = O(d)

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only a constant number of variables are used.

No array, ArrayList, StringBuilder, or other
additional data structure is created.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. How do you extract the last digit of a number?

Answer:
I use the modulus operator with 10.
For example, n % 10 gives the last digit,
and n / 10 removes that digit.

---------------------------------------------------------

Q2. Why do we use Math.max() and Math.min()?

Answer:
For every extracted digit, Math.max() updates the
largest digit seen so far, while Math.min() updates
the smallest digit seen so far.

---------------------------------------------------------

Q3. Why is the time complexity O(d) instead of O(n)?

Answer:
Because the algorithm processes digits, not every
number from 1 to n. If the number has d digits,
the loop executes exactly d times.

=========================================================
END OF FILE
=========================================================
*/