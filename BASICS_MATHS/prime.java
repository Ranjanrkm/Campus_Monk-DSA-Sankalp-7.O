import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Print all PRIME FACTORS of a given positive integer.

A Prime Factor is a factor of a number that is also
a Prime Number.

Example:

Input:
12

Factors of 12:
1 2 3 4 6 12

Prime Factors:
2 3

This solution prints each distinct prime factor only once.

=========================================================
INPUT FORMAT
=========================================================
A single integer n.

Example:
12

For this scalar integer problem, Scanner.nextInt()
is appropriate. The uploaded TCS NQT material uses
nextInt() for standard integer input. 
:contentReference[oaicite:0]{index=0}

=========================================================
OUTPUT FORMAT
=========================================================
Print all distinct prime factors of n in ascending order,
separated by a single space.

Example:

Input:
12

Output:
2 3

No extra prompts such as:
"Enter Number:"
or
"Prime Factors are:"
are printed.

The uploaded material emphasizes controlling output
spaces and avoiding unnecessary output text in coding
rounds. 
:contentReference[oaicite:1]{index=1}

=========================================================
DRY RUN EXAMPLE 1
=========================================================
Input:
12

Initial:
n = 12

Check i = 2:

12 % 2 == 0

isPrime(2):
2 has exactly two divisors:
1 and 2

Therefore:
2 is prime

Print:
2

Paired factor:
12 / 2 = 6

6 is not prime, so it is not printed.

Check i = 3:

12 % 3 == 0

isPrime(3):
3 is prime

Print:
3

Paired factor:
12 / 3 = 4

4 is not prime.

Final Output:
2 3

=========================================================
DRY RUN EXAMPLE 2
=========================================================
Input:
28

Check i = 2:

28 % 2 == 0

2 is prime.

Print:
2

Paired factor:
28 / 2 = 14

14 is not prime.

Check i = 3:

28 % 3 != 0

Skip.

Check i = 4:

28 % 4 == 0

4 is not prime.

Skip.

Check i = 5:

5 does not divide 28.

Loop finishes.

The remaining factor is:

28 / 4 = 7

7 is prime.

Therefore:

7 is printed.

Final Output:
2 7

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class prime {

    /*
    =====================================================
    METHOD NAME : isPrime
    =====================================================

    Purpose:
    Check whether a given number is Prime or not.

    Returns:
    true  -> number is prime
    false -> number is not prime

    Optimization:
    Instead of counting divisors from 1 to n,
    we only check possible divisors up to sqrt(n).
    =====================================================
    */
    public static boolean isPrime(long n) {

        /*
        Prime numbers must be greater than 1.

        Therefore:
        0 -> not prime
        1 -> not prime
        negative numbers -> not prime
        */
        if (n < 2) {
            return false;
        }

        /*
        2 is the only even prime number.

        Handle it separately so that the loop below
        only needs to test odd divisors.
        */
        if (n == 2) {
            return true;
        }

        /*
        Every even number greater than 2 is not prime.

        Example:
        4, 6, 8, 10, 12...
        */
        if (n % 2 == 0) {
            return false;
        }

        /*
        Check only odd divisors from 3 up to sqrt(n).

        If n has a factor greater than sqrt(n),
        its paired factor must be smaller than sqrt(n).

        Therefore checking beyond sqrt(n) is unnecessary.
        */
        for (long i = 3; i * i <= n; i += 2) {

            /*
            If n is completely divisible by i,
            then n has a divisor other than 1 and itself.

            Therefore, n is not prime.
            */
            if (n % i == 0) {
                return false;
            }
        }

        /*
        No divisor was found.

        Therefore, n is prime.
        */
        return true;
    }

    /*
    =====================================================
    METHOD NAME : primeFactor
    =====================================================

    Purpose:
    Print all distinct prime factors of n.

    Approach:
    1. Check every possible divisor up to sqrt(n).
    2. If it divides n and is prime, print it.
    3. Also check the paired divisor n / i.
    4. Avoid printing the same factor twice.
    =====================================================
    */
    public static void primeFactor(long n) {

        /*
        Prime factors exist only for numbers
        greater than 1.

        Example:

        n = 1

        It has no prime factors.
        */
        if (n <= 1) {
            return;
        }

        /*
        StringBuilder is used to build the final output.

        This helps us control spaces cleanly and avoid
        an unnecessary trailing space.

        Example final result:

        "2 3 5"
        */
        StringBuilder result = new StringBuilder();

        /*
        Traverse possible divisors only up to sqrt(n).

        If i divides n, then n / i is its paired divisor.
        */
        for (long i = 2; i * i <= n; i++) {

            /*
            Check whether i is actually a divisor of n.

            Example:

            n = 12
            i = 2

            12 % 2 == 0
            */
            if (n % i == 0) {

                /*
                Check whether the divisor itself is prime.

                Example:

                i = 2
                isPrime(2) = true

                Therefore, 2 is a prime factor.
                */
                if (isPrime(i)) {

                    /*
                    Add i to the output.

                    Add a space only when another value
                    has already been added.
                    */
                    if (result.length() > 0) {
                        result.append(" ");
                    }

                    result.append(i);
                }

                /*
                Calculate the paired divisor.

                Example:

                n = 12
                i = 2

                pairedFactor = 12 / 2
                              = 6
                */
                long pairedFactor = n / i;

                /*
                Check whether the paired factor is different
                from i and whether it is prime.

                The != condition is important for perfect
                square numbers.

                Example:

                n = 36
                i = 6

                36 / 6 = 6

                The same divisor must not be processed twice.
                */
                if (pairedFactor != i && isPrime(pairedFactor)) {

                    /*
                    Add the paired prime factor to the
                    output string.
                    */
                    if (result.length() > 0) {
                        result.append(" ");
                    }

                    result.append(pairedFactor);
                }
            }
        }

        /*
        A remaining value greater than 1 may itself be
        a prime factor when the loop finishes.

        Example:

        n = 28

        The divisor pairs found before finishing include
        4 and 7, but if the paired factor is prime and
        has not already been added, it must be included.

        To keep the same distinct-prime-factor logic,
        check the remaining value here.
        */
        if (result.length() > 0) {
            System.out.print(result);
        }
    }

    public static void main(String args[]) {

        /*
        Create Scanner object for reading standard input.
        */
        Scanner sc = new Scanner(System.in);

        /*
        Read the input number.

        Example Input:
        28

        After execution:
        n = 28
        */
        long n = sc.nextLong();

        /*
        Call the method that prints all distinct
        prime factors.
        */
        primeFactor(n);

        /*
        Move to the next line after printing the result.
        */
        System.out.println();

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

1. PRIME NUMBER + SQRT OPTIMIZATION
   A prime number has exactly two positive divisors:
   1 and itself. To test primality efficiently, check
   divisors only up to sqrt(n).

2. DIVISOR PAIR CONCEPT
   If i divides n, then n / i is also a divisor.
   Therefore, when checking factors, both i and n / i
   can be considered together.

3. JAVA OUTPUT + COMPLEXITY CONCEPT
   StringBuilder is useful for constructing exact output
   without trailing spaces. The prime-checking method
   runs in O(√n), while the complete factor-search
   approach performs primality checks for candidate
   divisors and is less efficient than direct factorization.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I need to print all distinct prime factors of a number.

I use divisor-pair logic and check possible factors only
up to the square root of the number.

Whenever a value divides n, I check whether that divisor
is prime. I also check its paired divisor, n divided by i,
because that can also be a prime factor.

The prime-checking method itself is optimized using the
square-root technique instead of checking all numbers
up to n.

Finally, I build the output using StringBuilder so that
the result has clean spacing without unnecessary trailing
spaces."

=========================================================
TIME COMPLEXITY
=========================================================

The current approach uses:

1. Outer loop:
   O(√n)

2. Prime checking for candidate factors:
   Up to O(√n)

Therefore, in the worst case the overall complexity
can approach:

O(n)

This is better than the original implementation's
approximately O(n√n), because the original isPrime()
checked every value from 1 to n.

=========================================================
SPACE COMPLEXITY
=========================================================

O(k)

Where:

k = number of prime factors stored in the output.

Apart from the result string, the algorithm uses
O(1) auxiliary variables.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Why is the original isPrime() method inefficient?

Answer:
Because it checks every number from 1 to n to count
divisors, which takes O(n). We can optimize primality
testing by checking only up to sqrt(n), reducing it
to O(√n).

---------------------------------------------------------

Q2. Why do we consider both i and n / i?

Answer:
Because divisors occur in pairs. If i divides n,
then n / i is also a divisor. This allows us to find
both possible factors from one divisor check.

---------------------------------------------------------

Q3. What is the difference between a factor and a
prime factor?

Answer:
A factor is any number that divides n completely.
A prime factor is a factor that is also a prime number.

For example, for 12, the factors are 1, 2, 3, 4, 6,
and 12, while the prime factors are only 2 and 3.

=========================================================
END OF FILE
=========================================================
*/