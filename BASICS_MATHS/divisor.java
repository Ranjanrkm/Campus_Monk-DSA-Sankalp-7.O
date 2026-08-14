import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Print all divisors of a given number.

A divisor of a number n is a number that divides n
completely without leaving any remainder.

Example:

Input:
12

Output:
1 2 3 4 6 12

This solution uses Square Root Optimization,
which is a very important interview concept.

=========================================================
INPUT FORMAT
=========================================================
A single integer n.

Example:
12

=========================================================
OUTPUT FORMAT
=========================================================
Print all divisors of n in ascending order,
separated by spaces.

Example:
1 2 3 4 6 12

=========================================================
DRY RUN EXAMPLE 1
=========================================================
Input:
12

Initial:
n = 12

Square Root of 12 ≈ 3

i = 1

12 % 1 == 0

Divisors:
1 and 12

i = 2

12 % 2 == 0

Divisors:
2 and 6

i = 3

12 % 3 == 0

Divisors:
3 and 4

Final Divisors:
1 2 3 4 6 12

Output:
1 2 3 4 6 12

=========================================================
DRY RUN EXAMPLE 2
=========================================================
Input:
15

Initial:
n = 15

Square Root of 15 ≈ 3

i = 1

15 % 1 == 0

Divisors:
1 and 15

i = 2

15 % 2 != 0

Skip

i = 3

15 % 3 == 0

Divisors:
3 and 5

Final Divisors:
1 3 5 15

Output:
1 3 5 15

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class divisor {

    /*
    =====================================================
    METHOD NAME : Alldivisor
    =====================================================

    Purpose:
    Print all divisors of a given number
    in ascending order.

    Approach:
    Use Square Root Optimization.

    If i divides n, then both:

    i
    and
    n / i

    are divisors.

    Example:

    n = 12

    i = 2

    Divisors:
    2 and 6

    This reduces unnecessary iterations.
    =====================================================
    */
    public static void Alldivisor(int n) {

        /*
        Convert negative numbers into
        positive numbers.

        Example:

        n = -12

        becomes

        n = 12
        */
        if (n < 0) {
            n = -n;
        }

        /*
        Divisors of 0 are not generally
        considered in coding interview
        problems.

        Therefore, simply return.
        */
        if (n == 0) {
            return;
        }

        /*
        Store smaller divisors.

        Example:

        1 2 3
        */
        StringBuilder small = new StringBuilder();

        /*
        Store larger divisors.

        Example:

        4 6 12
        */
        StringBuilder large = new StringBuilder();

        /*
        Traverse from 1 to sqrt(n).

        Example:

        n = 12

        sqrt(12) ≈ 3

        Loop runs only till 3.

        This is the optimization
        used in the solution.
        */
        for (int i = 1; i <= Math.sqrt(n); i++) {

            /*
            Check whether i divides n
            completely.

            If remainder becomes zero,
            i is a divisor.
            */
            if (n % i == 0) {

                /*
                Store the smaller divisor.

                Example:

                i = 2

                Store:
                2
                */
                small.append(i).append(" ");

                /*
                Check whether both divisors
                are different.

                Example:

                n = 36

                i = 6

                n / i = 6

                Same divisor, print only once.
                */
                if (i != n / i) {

                    /*
                    Store the larger divisor
                    at the beginning.

                    Example:

                    n = 12
                    i = 2

                    Larger Divisor:
                    6
                    */
                    large.insert(0, (n / i) + " ");
                }
            }
        }

        /*
        Print all divisors in
        ascending order.

        Example:

        small:
        1 2 3

        large:
        4 6 12

        Output:
        1 2 3 4 6 12
        */
        System.out.print(small.toString() + large.toString());
    }

    public static void main(String args[]) {

        /*
        Create Scanner object
        for reading input.
        */
        Scanner sc = new Scanner(System.in);

        /*
        Read the number.

        Example Input:
        12

        After execution:
        n = 12
        */
        int n = sc.nextInt();

        /*
        Call divisor method.
        */
        Alldivisor(n);

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

1. SQUARE ROOT OPTIMIZATION

   Instead of checking all numbers
   from 1 to n, check only till √n.

2. DIVISOR PAIR CONCEPT

   If i divides n:

   Then both

   i
   and
   n / i

   are divisors.

   Example:

   12 ÷ 2 = 6

   Divisors:
   2 and 6

3. PERFECT SQUARE CASE

   Example:

   n = 36

   i = 6

   n / i = 6

   Print 6 only once.

4. IMPORTANT INTERVIEW PATTERN

   Divisor problems, Prime Number,
   Factors, and Number Theory
   frequently use sqrt(n) optimization.

5. OPTIMIZATION BENEFIT

   Brute Force:
   O(n)

   Optimized:
   O(√n)

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I used the Square Root Optimization approach.

Instead of checking every number from 1 to n,
I only check from 1 to √n.

Whenever a divisor i is found, I immediately
get another divisor using n / i.

I store smaller divisors separately and larger
divisors separately so that the final output
appears in ascending order.

This reduces the time complexity from O(n)
to O(√n), which is the expected interview
solution."

=========================================================
TIME COMPLEXITY
=========================================================

O(√n)

Reason:

The loop runs only from:

1 to √n

instead of:

1 to n

Therefore:

Time Complexity = O(√n)

=========================================================
SPACE COMPLEXITY
=========================================================

O(k)

Where:

k = Number of divisors

Reason:

StringBuilder stores divisors before printing.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Why do we iterate only till √n?

Answer:
Because divisors always occur in pairs.
If i is a divisor of n, then n/i is also a
divisor. Therefore checking beyond √n is
unnecessary.

---------------------------------------------------------

Q2. Why do we check i != n / i?

Answer:
To avoid printing duplicate divisors for
perfect square numbers.

Example:
36

√36 = 6

Both divisors become 6, so it should be
printed only once.

---------------------------------------------------------

Q3. What is the main optimization used here?

Answer:
Square Root Optimization. It reduces the
time complexity from O(n) to O(√n), making
the solution much faster for large numbers.

=========================================================
END OF FILE
=========================================================
*/