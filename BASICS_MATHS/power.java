import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Find the value of n raised to the power x using
Binary Exponentiation, also called the Fast Power
Algorithm.

Calculate:

n^x

Example:

2^5 = 32
3^4 = 81

Why Binary Exponentiation?

A normal multiplication approach takes O(x) time.

Binary Exponentiation reduces the number of operations
to O(log x) by repeatedly reducing the exponent.

=========================================================
INPUT FORMAT
=========================================================
Two integers:

First integer:
n -> Base number

Second integer:
x -> Power / Exponent

Example:
2
5

For this problem, the input is scalar integer input,
so Scanner.nextInt() is the appropriate format rather
than array or line-based parsing.

=========================================================
OUTPUT FORMAT
=========================================================
Print the value of:

n^x

Example:

Input:
2
5

Output:
32

No extra prompts such as:
"Enter base:"
"Enter power:"
are printed.

=========================================================
DRY RUN EXAMPLE 1
=========================================================
Input:
2
5

Initial:
n = 2
x = 5
ans = 1

Step 1:
x = 5 -> odd

ans = ans * n
ans = 1 * 2
ans = 2

x = x - 1
x = 4

Step 2:
x = 4 -> even

n = n * n
n = 2 * 2
n = 4

x = x / 2
x = 2

Step 3:
x = 2 -> even

n = n * n
n = 4 * 4
n = 16

x = x / 2
x = 1

Step 4:
x = 1 -> odd

ans = ans * n
ans = 2 * 16
ans = 32

x = x - 1
x = 0

Loop ends.

Final:
ans = 32

Output:
32

=========================================================
DRY RUN EXAMPLE 2
=========================================================
Input:
3
4

Initial:
n = 3
x = 4
ans = 1

Step 1:
x = 4 -> even

n = 3 * 3
n = 9

x = 4 / 2
x = 2

Step 2:
x = 2 -> even

n = 9 * 9
n = 81

x = 2 / 2
x = 1

Step 3:
x = 1 -> odd

ans = 1 * 81
ans = 81

x = 1 - 1
x = 0

Loop ends.

Output:
81

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class power {

    /*
    =====================================================
    METHOD NAME : expo
    =====================================================

    Purpose:
    Calculate n^x using Binary Exponentiation.

    Parameters:
    n -> Base
    x -> Non-negative exponent

    Core idea:

    If x is odd:
        ans = ans * n
        x = x - 1

    If x is even:
        n = n * n
        x = x / 2

    The exponent becomes smaller very quickly,
    which makes the algorithm much faster than
    repeated multiplication.
    =====================================================
    */
    public static void expo(long n, long x) {

        /*
        Store the final result.

        Initially:

        ans = 1

        This is also correct for x = 0 because:

        n^0 = 1
        */
        long ans = 1;

        /*
        Continue processing while the exponent
        is greater than zero.
        */
        while (x > 0) {

            /*
            Check whether the exponent is odd.

            If x % 2 is 1, the current base contributes
            one factor to the answer.
            */
            if (x % 2 == 1) {

                /*
                Multiply the current base into the
                running answer.

                Example:

                ans = 2
                n = 16

                ans = 2 * 16
                    = 32
                */
                ans *= n;

                /*
                Reduce the odd exponent by 1.

                Example:

                x = 5

                x = 5 - 1
                  = 4

                Now the exponent becomes even and can
                be divided by 2 in the next iteration.
                */
                x -= 1;

            } else {

                /*
                The exponent is even.

                Square the current base.

                Example:

                n = 4

                n = 4 * 4
                  = 16

                This combines two equal powers into
                one larger base.
                */
                n *= n;

                /*
                Divide the exponent by 2.

                Example:

                x = 4

                x = 4 / 2
                  = 2

                This is the main reason Binary
                Exponentiation achieves logarithmic
                time complexity.
                */
                x /= 2;
            }
        }

        /*
        Print the final calculated value.

        No additional text is printed because
        competitive-programming output should contain
        only the required result.
        */
        System.out.println(ans);
    }

    public static void main(String args[]) {

        /*
        Create Scanner object to read input
        from standard input.
        */
        Scanner sc = new Scanner(System.in);

        /*
        Read the base number.

        Example Input:
        2

        After execution:
        n = 2
        */
        long n = sc.nextLong();

        /*
        Read the exponent.

        Example Input:
        5

        After execution:
        x = 5
        */
        long x = sc.nextLong();

        /*
        Call Binary Exponentiation method
        to calculate n^x.
        */
        expo(n, x);

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

1. BINARY EXPONENTIATION
   Also called Fast Power.
   It reduces the exponent by halving it whenever
   the exponent is even, giving O(log x) time.

2. CORE JAVA LOGIC
   Odd exponent:
       ans *= n
       x -= 1

   Even exponent:
       n *= n
       x /= 2

   This combines arithmetic operations with
   integer division and modulus.

3. OVERFLOW CONCEPT
   Even though the algorithm is O(log x), the actual
   value of n^x can become extremely large.
   Using long increases the safe range compared
   with int, but very large powers can still overflow.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I use Binary Exponentiation to calculate n raised
to the power x efficiently.

I maintain an answer variable starting from 1.

When the exponent is odd, I multiply the current
base into the answer and reduce the exponent by 1.

When the exponent is even, I square the base and
divide the exponent by 2.

This repeatedly reduces the exponent, so instead
of performing x multiplications, the algorithm
takes logarithmic time with respect to the exponent."

=========================================================
TIME COMPLEXITY
=========================================================

O(log x)

Reason:

Whenever the exponent becomes even, it is divided
by 2.

Therefore, the number of iterations grows
logarithmically with x.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only a constant number of variables are used:

- n
- x
- ans

No array, collection, recursion stack, or other
additional data structure is used.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Why is Binary Exponentiation O(log x)?

Answer:
Because for an even exponent, the algorithm squares
the base and divides the exponent by 2. Therefore,
the exponent decreases exponentially fast rather
than one step at a time.

---------------------------------------------------------

Q2. What is the difference between the normal power
approach and Binary Exponentiation?

Answer:
The normal approach performs multiplication roughly
x times, so it takes O(x). Binary Exponentiation
reduces the exponent using squaring and halving,
so it takes O(log x).

---------------------------------------------------------

Q3. Why do we square the base when the exponent is even?

Answer:
Because for an even exponent:

n^x = (n^2)^(x/2)

So we can replace the base with n^2 and the exponent
with x/2 without changing the mathematical result.
This is the key optimization behind Fast Power.

=========================================================
END OF FILE
=========================================================
*/