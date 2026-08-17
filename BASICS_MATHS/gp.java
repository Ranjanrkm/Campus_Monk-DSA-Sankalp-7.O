import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Print the first m terms of a Geometric Progression (GP).

In a Geometric Progression:

a = First Term
r = Common Ratio
m = Number of Terms

Each term is obtained by multiplying the previous
term by the common ratio.

Formula:

nth Term = a * r^(n - 1)

Example:

a = 2
r = 3

GP:
2 6 18 54 162

=========================================================
INPUT FORMAT
=========================================================
Three integers:

a -> First term
r -> Common ratio
m -> Number of terms

Example:
2
3
5

=========================================================
OUTPUT FORMAT
=========================================================
Print the first m terms of the GP in one line,
separated by spaces.

Example:
2 6 18 54 162

=========================================================
DRY RUN EXAMPLE 1
=========================================================
Input:
2
3
5

Initial:
a = 2
r = 3
m = 5

Term 1:
2 * 3^0 = 2

Term 2:
2 * 3^1 = 6

Term 3:
2 * 3^2 = 18

Term 4:
2 * 3^3 = 54

Term 5:
2 * 3^4 = 162

Output:
2 6 18 54 162

=========================================================
DRY RUN EXAMPLE 2
=========================================================
Input:
5
2
4

Initial:
a = 5
r = 2
m = 4

Term 1:
5 * 2^0 = 5

Term 2:
5 * 2^1 = 10

Term 3:
5 * 2^2 = 20

Term 4:
5 * 2^3 = 40

Output:
5 10 20 40

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class gp {

    /*
    =====================================================
    METHOD NAME : gp_series
    =====================================================

    Purpose:
    Print the first m terms of a Geometric Progression.

    Parameters:

    a -> First term of the GP

    r -> Common ratio of the GP

    m -> Number of terms to print

    Example:

    a = 2
    r = 3
    m = 5

    Output:
    2 6 18 54 162
    =====================================================
    */
    public static void gp_series(int a, int r, int m) {

        /*
        Check whether the requested number
        of terms is zero or negative.

        If m <= 0, there are no terms
        to print.
        */
        if (m <= 0) {
            return;
        }

        /*
        Traverse from the first term
        to the m-th term.

        Example:

        m = 5

        i = 1, 2, 3, 4, 5
        */
        for (int i = 1; i <= m; i++) {

            /*
            Calculate the current GP term
            using the formula:

            nth Term = a * r^(n - 1)

            For i = 1:

            a * r^0

            For i = 2:

            a * r^1

            For i = 3:

            a * r^2
            */
            int temp = (int) (a * Math.pow(r, i - 1));

            /*
            Print the current GP term.

            A space is printed before the term
            except for the first term so that
            unnecessary trailing spaces are avoided.
            */
            if (i > 1) {
                System.out.print(" ");
            }

            System.out.print(temp);
        }
    }

    public static void main(String args[]) {

        /*
        Create Scanner object for
        reading input.
        */
        Scanner sc = new Scanner(System.in);

        /*
        Read the first term of the GP.

        Example Input:
        2

        After execution:
        a = 2
        */
        int a = sc.nextInt();

        /*
        Read the common ratio.

        Example Input:
        3

        After execution:
        r = 3
        */
        int r = sc.nextInt();

        /*
        Read the number of terms.

        Example Input:
        5

        After execution:
        m = 5
        */
        int m = sc.nextInt();

        /*
        Call the GP method with
        the given values.
        */
        gp_series(a, r, m);

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

1. GEOMETRIC PROGRESSION

   In a GP, every term is obtained by multiplying
   the previous term by a constant value called
   the common ratio.

2. GP FORMULA

   nth Term = a * r^(n - 1)

   where:

   a = first term
   r = common ratio
   n = position of the term

3. FIRST TERM

   For n = 1:

   a * r^0 = a

   Therefore, the first term is always
   equal to the first term given.

4. COMMON RATIO

   If:

   a = 2
   r = 3

   Then:

   2 -> 6 -> 18 -> 54

   Every term is multiplied by 3.

5. EDGE CASES

   - m <= 0 -> no terms are printed.
   - r = 0 -> first term is followed by zeros.
   - r = 1 -> every term is the same as a.
   - r can also be negative.

6. COMPETITIVE PROGRAMMING TIP

   Avoid unnecessary output such as:

   "Enter first term:"

   Online judges expect only the required output.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I am generating the first m terms of a Geometric
Progression.

The first term is represented by a, the common ratio
by r, and m represents the number of terms.

For every position i, I calculate the term using
the formula a multiplied by r to the power i minus 1.

I then print each calculated term in sequence.

The solution directly applies the mathematical
formula of a GP."

=========================================================
TIME COMPLEXITY
=========================================================

O(m)

Reason:

The loop runs exactly m times, once for each
term of the Geometric Progression.

Therefore:

Time Complexity = O(m)

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only a constant number of variables are used.

No array, collection, or additional data structure
is created.

Therefore:

Space Complexity = O(1)

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. What is a Geometric Progression?

Answer:
A Geometric Progression is a sequence where the ratio
between consecutive terms remains constant. This
constant value is called the common ratio.

---------------------------------------------------------

Q2. What is the formula for the nth term of a GP?

Answer:
The nth term is calculated as:

nth Term = a * r^(n - 1)

where a is the first term and r is the common ratio.

---------------------------------------------------------

Q3. What happens when the common ratio is 1 or 0?

Answer:
If r is 1, every term remains equal to the first term.
If r is 0, the first term is followed by zero for all
subsequent terms.

=========================================================
END OF FILE
=========================================================
*/