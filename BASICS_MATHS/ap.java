import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Print the first n terms of an Arithmetic Progression (AP).

Given:
First Term (a) = 4
Common Difference (d) = 2

Arithmetic Progression (AP) is a sequence in which
the difference between consecutive terms remains constant.

Formula:

Next Term = Previous Term + Common Difference

Example:

Input:
5

Output:
4 6 8 10 12

=========================================================
INPUT FORMAT
=========================================================
A single integer n representing the number of
terms to be printed.

Example:
5

=========================================================
OUTPUT FORMAT
=========================================================
Print the first n terms of the Arithmetic Progression.

Example:
4 6 8 10 12

=========================================================
DRY RUN EXAMPLE 1
=========================================================
Input:
5

Initial:
a = 4
d = 2
n = 5

Term 1:
4

Term 2:
4 + 2 = 6

Term 3:
6 + 2 = 8

Term 4:
8 + 2 = 10

Term 5:
10 + 2 = 12

Output:
4 6 8 10 12

=========================================================
DRY RUN EXAMPLE 2
=========================================================
Input:
3

Initial:
a = 4
d = 2
n = 3

Term 1:
4

Term 2:
6

Term 3:
8

Output:
4 6 8

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class ap {

    /*
    =====================================================
    METHOD NAME : ap_sum
    =====================================================

    Purpose:
    Print the first n terms of an Arithmetic
    Progression (AP).

    Parameters:

    a -> First term of the AP

    d -> Common difference between consecutive terms

    n -> Total number of terms to print

    Example:

    a = 4
    d = 2
    n = 5

    Output:
    4 6 8 10 12
    =====================================================
    */
    public static void ap_sum(int a, int d, int n) {

        /*
        Check whether the number of terms
        is less than or equal to zero.

        In such cases, nothing should be printed.
        */
        if (n <= 0) {
            return;
        }

        /*
        Print the first term of the AP.

        Example:
        a = 4

        Output:
        4
        */
        System.out.print(a);

        /*
        Traverse from the second term
        up to the nth term.

        Example:

        n = 5

        Loop executes for:
        i = 2, 3, 4, 5
        */
        for (int i = 2; i <= n; i++) {

            /*
            Add the common difference to
            the current term to generate
            the next AP term.

            Example:

            Current Term = 4
            d = 2

            Next Term = 6
            */
            a = a + d;

            /*
            Print a space followed by
            the current AP term.

            This avoids unnecessary
            trailing spaces.
            */
            System.out.print(" " + a);
        }
    }

    public static void main(String args[]) {

        /*
        Create Scanner object for
        reading user input.
        */
        Scanner sc = new Scanner(System.in);

        /*
        Read the number of AP terms.

        Example Input:
        5

        After execution:
        n = 5
        */
        int n = sc.nextInt();

        /*
        Call the AP printing method.

        First Term = 4
        Common Difference = 2
        */
        ap_sum(4, 2, n);

        /*
        Close Scanner object to
        release system resources.
        */
        sc.close();
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Arithmetic Progression (AP) is a sequence in which
   the difference between consecutive terms remains
   constant.

2. General AP Formula:
   nth Term = a + (n - 1) * d

3. In this solution, each next term is generated using:
   a = a + d

4. Edge Case:
   If n <= 0, no term should be printed.

5. Interview Trick:
   AP problems can be solved either iteratively
   using loops or directly using the nth-term formula.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I am generating the first n terms of an Arithmetic
Progression where the first term is 4 and the common
difference is 2.

I first print the initial term and then use a loop
to generate each next term by adding the common
difference to the current term.

This continues until n terms are printed.

The solution uses iterative AP generation and
requires constant extra space."

=========================================================
TIME COMPLEXITY
=========================================================

O(n)

Reason:

The loop generates and prints each term exactly once.

For n terms:

Total Operations = n

Therefore:

Time Complexity = O(n)

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only a few variables are used:

- a
- d
- n
- i

No extra array, collection, or auxiliary
data structure is created.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. What is an Arithmetic Progression (AP)?

Answer:
An Arithmetic Progression is a sequence in which the
difference between consecutive terms remains constant.
This constant value is called the common difference.

---------------------------------------------------------

Q2. What is the formula for the nth term of an AP?

Answer:
nth Term = a + (n - 1) * d

where:
a = first term
d = common difference
n = term position

---------------------------------------------------------

Q3. Why is the time complexity O(n)?

Answer:
Because each AP term is generated and printed exactly
once, requiring one traversal from the first term to
the nth term.

=========================================================
END OF FILE
=========================================================
*/