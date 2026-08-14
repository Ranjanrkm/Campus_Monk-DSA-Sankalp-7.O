import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Check whether a given number is an Armstrong Number
or not.

An Armstrong Number is a number that is equal to the
sum of its digits raised to the power of the total
number of digits.

Formula:

For a number having k digits:

(d1^k + d2^k + d3^k + ... + dk^k) = Original Number

Example:

153

Number of Digits = 3

1^3 + 5^3 + 3^3
= 1 + 125 + 27
= 153

Therefore, 153 is an Armstrong Number.

=========================================================
INPUT FORMAT
=========================================================
A single integer n.

Example:
153

=========================================================
OUTPUT FORMAT
=========================================================
Print:

Yes it's an armstrong number

or

No it's not a armstrong number

=========================================================
DRY RUN EXAMPLE 1
=========================================================
Input:
153

Initial:
original = 153
cnt = 3
sum = 0

Iteration 1:
Last Digit = 3

sum = 0 + (3^3)
sum = 27

Remaining Number:
15

Iteration 2:
Last Digit = 5

sum = 27 + (5^3)
sum = 27 + 125
sum = 152

Remaining Number:
1

Iteration 3:
Last Digit = 1

sum = 152 + (1^3)
sum = 153

Remaining Number:
0

Final:

sum = 153
original = 153

sum == original

Output:
Yes it's an armstrong number

=========================================================
DRY RUN EXAMPLE 2
=========================================================
Input:
123

Initial:
original = 123
cnt = 3
sum = 0

Iteration 1:
Last Digit = 3

sum = 27

Iteration 2:
Last Digit = 2

sum = 27 + 8
sum = 35

Iteration 3:
Last Digit = 1

sum = 35 + 1
sum = 36

Final:

sum = 36
original = 123

sum != original

Output:
No it's not a armstrong number

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class armstrong {

    /*
    =====================================================
    METHOD NAME : isArmstrong
    =====================================================

    Purpose:
    Check whether the given number is an
    Armstrong Number or not.

    Returns:
    true  -> Armstrong Number
    false -> Not an Armstrong Number
    =====================================================
    */
    public static boolean isArmstrong(int n) {

        /*
        Armstrong Numbers are generally
        defined for non-negative integers.

        Example:
        -153

        Negative numbers are not
        Armstrong Numbers.
        */
        if (n < 0) {
            return false;
        }

        /*
        Store the original number.

        This value will be used later
        for final comparison.

        Example:

        n = 153

        original = 153
        */
        int original = n;

        /*
        Count the total number of digits.

        Example:

        n = 153

        String.valueOf(153) = "153"

        Length = 3
        */
        int cnt = String.valueOf(n).length();

        /*
        Store the sum of powered digits.

        Initially:

        sum = 0
        */
        int sum = 0;

        /*
        Extract digits one by one from
        right to left until the number
        becomes zero.
        */
        while (n != 0) {

            /*
            Extract the last digit.

            Example:

            n = 153

            ld = 153 % 10

            ld = 3
            */
            int ld = n % 10;

            /*
            Raise the digit to the power
            of total digit count and add
            it to the running sum.

            Example:

            ld = 5
            cnt = 3

            5^3 = 125

            sum += 125
            */
            sum += (int) Math.pow(ld, cnt);

            /*
            Remove the last digit.

            Example:

            n = 153

            n = 15
            */
            n /= 10;
        }

        /*
        Compare the calculated sum
        with the original number.

        If both are equal:

        Armstrong Number

        Otherwise:

        Not an Armstrong Number
        */
        return sum == original;
    }

    public static void main(String args[]) {

        /*
        Create Scanner object for
        reading user input.
        */
        Scanner sc = new Scanner(System.in);

        /*
        Read the integer entered
        by the user.

        Example Input:
        153

        After execution:
        n = 153
        */
        int n = sc.nextInt();

        /*
        Call the Armstrong checking
        method and print the result.
        */
        if (isArmstrong(n)) {

            /*
            Executed when the number
            is an Armstrong Number.
            */
            System.out.println("Yes it's an armstrong number");

        } else {

            /*
            Executed when the number
            is not an Armstrong Number.
            */
            System.out.println("No it's not a armstrong number");
        }

        /*
        Close Scanner resource.
        */
        sc.close();
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. ARMSTRONG NUMBER CONCEPT

   A number is Armstrong if:

   Sum of (Digit ^ Total Digits)
   equals
   Original Number.

2. DIGIT EXTRACTION TECHNIQUE

   Last Digit:
   n % 10

   Remove Last Digit:
   n /= 10

   This is one of the most important
   number manipulation techniques in DSA.

3. Math.pow(base, exponent)

   Used to calculate:

   digit^count

   Example:

   Math.pow(5,3) = 125

4. SPECIAL CASE

   Single digit numbers:

   0, 1, 2, 3, ... 9

   are Armstrong Numbers because:

   5^1 = 5

5. INTERVIEW OPTIMIZATION

   Counting digits using:

   String.valueOf(n).length()

   is simple and readable.

   Another approach is using
   repeated division by 10.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I first store the original number because the
input number will be modified during digit extraction.

Then I count the total number of digits.

Using a loop, I extract each digit using the
modulus operator and raise it to the power of
the digit count using Math.pow().

The powered values are added into a running sum.

Finally, I compare the computed sum with the
original number.

If both values are equal, the number is an
Armstrong Number; otherwise, it is not."

=========================================================
TIME COMPLEXITY
=========================================================

O(d)

Where:

d = Number of Digits

Reason:

The loop processes each digit exactly once.

Examples:

153 -> 3 iterations

9474 -> 4 iterations

Therefore:

Time Complexity = O(d)

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only a few variables are used:

- original
- cnt
- sum
- ld

No additional array or collection is created.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. What is an Armstrong Number?

Answer:
An Armstrong Number is a number that is equal to
the sum of its digits raised to the power of the
total number of digits.

Example:
153 = 1³ + 5³ + 3³ = 153

---------------------------------------------------------

Q2. Why do we use n % 10 and n / 10?

Answer:
n % 10 extracts the last digit of a number,
while n / 10 removes the last digit.
These operations are fundamental for digit-based
problems in DSA.

---------------------------------------------------------

Q3. Why is the time complexity O(d)?

Answer:
Because the algorithm processes each digit exactly
once, where d represents the number of digits in
the given number.

=========================================================
END OF FILE
=========================================================
*/