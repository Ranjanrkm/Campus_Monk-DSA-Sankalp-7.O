import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Check whether a given number is a Perfect Number or not.

A Perfect Number is a positive integer whose sum of all
proper divisors, excluding the number itself, is equal
to the number.

Example:

6 -> Proper Divisors: 1, 2, 3
Sum = 1 + 2 + 3 = 6

Therefore, 6 is a Perfect Number.

Another Example:

28 -> Proper Divisors: 1, 2, 4, 7, 14
Sum = 1 + 2 + 4 + 7 + 14 = 28

Therefore, 28 is a Perfect Number.

=========================================================
INPUT FORMAT
=========================================================
A single integer n.

Example:
6

For this problem, the uploaded TCS NQT input/output
material's standard scalar-integer input style applies:

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

No array, string-line, comma-separated, bracketed, or
2D-matrix parsing is required because the problem
contains only one integer input.

=========================================================
OUTPUT FORMAT
=========================================================
If the number is a Perfect Number, print:

n : is a perfect number

Otherwise print:

n : is not a perfect number

No additional prompts such as:

Enter Number:

or

Output:

should be printed in a coding-round solution.

=========================================================
DRY RUN EXAMPLE 1
=========================================================
Input:
6

Initial:
sum = 1

Why?
1 is always a proper divisor of every number greater
than 1.

Loop checks values from 2 to sqrt(6).

i = 2

6 % 2 == 0

First divisor:
2

Paired divisor:
6 / 2 = 3

Update:

sum = 1 + 2 + 3
sum = 6

Final:

sum = 6
n = 6

sum == n

Therefore, 6 is a Perfect Number.

Output:
6 : is a perfect number

=========================================================
DRY RUN EXAMPLE 2
=========================================================
Input:
10

Initial:
sum = 1

i = 2

10 % 2 == 0

First divisor:
2

Paired divisor:
10 / 2 = 5

Update:

sum = 1 + 2 + 5
sum = 8

sqrt(10) is approximately 3.16,
so the loop finishes after i = 3.

Final:

sum = 8
n = 10

sum != n

Therefore, 10 is not a Perfect Number.

Output:
10 : is not a perfect number

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class perfectNo {

    /*
    =====================================================
    METHOD NAME : isPerfect
    =====================================================

    Purpose:
    Check whether the given number is a Perfect Number.

    Approach:
    1. Reject numbers <= 1.
    2. Start sum with 1.
    3. Check divisors only up to sqrt(n).
    4. Whenever i divides n, add both:
       i
       n / i
    5. Avoid adding the same divisor twice for
       perfect-square numbers.
    6. Compare the divisor sum with n.

    Returns:
    true  -> Perfect Number
    false -> Not a Perfect Number
    =====================================================
    */
    public static boolean isPerfect(int n) {

        /*
        Perfect Numbers are positive integers greater
        than 1.

        Examples:

        0  -> Not Perfect
        1  -> Not Perfect
        -6 -> Not Perfect
        */
        if (n <= 1) {
            return false;
        }

        /*
        Use long for the sum.

        This gives safer arithmetic when adding
        divisor pairs for large integer inputs.
        */
        long sum = 1;

        /*
        Check possible divisors only up to sqrt(n).

        Instead of checking every value from 2 to n - 1,
        divisor pairs allow us to stop at sqrt(n).

        Example:

        For 28:

        2 -> paired with 14
        4 -> paired with 7

        Once we pass sqrt(28), the corresponding
        paired divisors have already been found.
        */
        for (int i = 2; (long) i * i <= n; i++) {

            /*
            Check whether i divides n completely.

            If the remainder is zero,
            i is a divisor of n.
            */
            if (n % i == 0) {

                /*
                Add the smaller divisor i
                to the proper-divisor sum.
                */
                sum += i;

                /*
                Calculate the paired divisor.

                Example:

                n = 28
                i = 2

                n / i = 14

                Therefore, 2 and 14 form
                a divisor pair.
                */
                int pairedDivisor = n / i;

                /*
                For a perfect square, both divisor
                values can be the same.

                Example:

                n = 36
                i = 6

                36 / 6 = 6

                Adding both would count 6 twice,
                so add the paired divisor only
                when the two values are different.
                */
                if (pairedDivisor != i) {
                    sum += pairedDivisor;
                }
            }
        }

        /*
        If the sum of all proper divisors is exactly
        equal to the original number, it is a
        Perfect Number.
        */
        return sum == n;
    }

    public static void main(String args[]) {

        /*
        Create Scanner object to read the integer
        from standard input.

        This follows the standard scalar integer
        input pattern from the uploaded TCS NQT
        input/output material.
        */
        Scanner sc = new Scanner(System.in);

        /*
        Read the number.

        Example Input:
        6

        After execution:
        n = 6
        */
        int n = sc.nextInt();

        /*
        Call the Perfect Number checking method.

        If it returns true, print the required
        Perfect Number output.
        */
        if (isPerfect(n)) {

            /*
            Print the exact required output format.
            */
            System.out.println(n + " : is a perfect number");

        } else {

            /*
            Print the exact required output format
            for a non-perfect number.
            */
            System.out.println(n + " : is not a perfect number");
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

1. DIVISOR-PAIR OPTIMIZATION
   If i divides n, then n / i is also a divisor.
   Therefore, checking only up to sqrt(n) is enough
   to find all divisor pairs.

2. PERFECT-SQUARE DUPLICATE CHECK
   When n is a perfect square, i and n / i can be equal.
   Example:
   36 -> 6 and 6
   So the paired divisor must not be added twice.

3. JAVA OVERFLOW + LOOP OPTIMIZATION
   - long is used for the divisor sum for safer arithmetic.
   - (long) i * i <= n avoids repeated Math.sqrt(n)
     calculations and prevents i * i overflow.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I first reject numbers less than or equal to 1 because
Perfect Numbers are positive integers greater than 1.

Then I initialize the sum with 1 because 1 is always
a proper divisor of every number greater than 1.

Instead of checking every value up to n, I check only
up to the square root of n. Whenever I find a divisor i,
I also get its paired divisor using n divided by i.

For perfect-square numbers, both divisors can be the same,
so I make sure not to add that value twice.

Finally, if the sum of all proper divisors equals the
original number, I return true.

The optimized solution runs in O(sqrt(n)) time and uses
O(1) auxiliary space."

=========================================================
TIME COMPLEXITY
=========================================================

O(√n)

Reason:

The loop checks possible divisors only up to
the square root of n.

Instead of:

1, 2, 3, ... , n - 1

we check approximately:

1, 2, 3, ... , √n

Therefore the time complexity is O(√n).

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only a constant number of variables are used:

- sum
- i
- pairedDivisor

No array, ArrayList, HashMap, or other additional
data structure is created.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Why is it sufficient to check divisors only up to √n?

Answer:
Divisors occur in pairs. If i divides n, then n / i
is also a divisor. Once i becomes greater than √n,
its paired divisor would already have been found.

---------------------------------------------------------

Q2. Why do we check pairedDivisor != i?

Answer:
To avoid counting the same divisor twice when n is
a perfect square. For example, for 36, when i is 6,
n / i is also 6, so 6 should be added only once.

---------------------------------------------------------

Q3. Why is this solution O(√n) instead of O(n)?

Answer:
Because the algorithm does not check every number up
to n. It checks only possible divisor values up to
√n and gets the second divisor from n / i.

=========================================================
END OF FILE
=========================================================
*/