import java.util.*;

/*
Problem Statement:
Print all Prime Factors of a given number.

What is a Prime Factor?
- A prime factor is a factor of a number
  that is also a prime number.

Example:
For n = 12

Factors of 12:
1, 2, 3, 4, 6, 12

Prime Factors:
2, 3

--------------------------------------------------
Input Format:
- A single integer n

Output Format:
- Print all prime factors separated by spaces

--------------------------------------------------
Dry Run Example 1:
Input:
12

Working:

Step 1:
i = 1
1 divides 12
But 1 is not prime

--------------------------------------------------

Step 2:
i = 2
12 % 2 == 0

Check prime:
2 has exactly 2 divisors
So 2 is prime

Print 2

Another divisor:
12 / 2 = 6

6 is not prime

--------------------------------------------------

Step 3:
i = 3
12 % 3 == 0

3 is prime
Print 3

Another divisor:
12 / 3 = 4

4 is not prime

--------------------------------------------------

Final Output:
2 3

--------------------------------------------------
Dry Run Example 2:
Input:
28

Prime Factors:
2 7

Output:
2 7
*/

public class prime {

    // Method to count divisors of a number
    // If divisor count is exactly 2,
    // then the number is prime
    public static int isPrime(int n) {

        // Counter to count divisors
        int cnt = 0;

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {

            // Check if i divides n completely
            if (n % i == 0) {
                cnt++;
            }
        }

        // Return divisor count
        return cnt;
    }

    // Method to print prime factors of a number
    public static void primeFactor(int n) {

        // Loop till square root of n
        // because divisors come in pairs
        for (int i = 1; i <= Math.sqrt(n); i++) {

            // Check if i is a divisor
            if (n % i == 0 && isPrime(i) == 2) {

                // Print divisor if it is prime
                System.out.print(i + " ");

                // Check paired divisor
                // Avoid duplicate printing for perfect squares
                if (i != n / i && isPrime(n / i) == 2) {

                    // Print paired divisor if it is also prime
                    System.out.print(n / i + " ");
                }
            }
        }
    }

    public static void main(String args[]) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read the number
        int n = sc.nextInt();

        // Call method to print prime factors
        primeFactor(n);

        // Close Scanner
        sc.close();
    }
}

/*
==================================================
Important Notes for Revision
==================================================

1) Prime Number:
- A number having exactly 2 divisors:
  1 and itself.

Examples:
2, 3, 5, 7, 11

--------------------------------------------------

2) Prime Factor:
- A factor that is also prime.

Example:
Factors of 18:
1, 2, 3, 6, 9, 18

Prime Factors:
2 and 3

--------------------------------------------------

3) Why loop till sqrt(n)?
- Divisors always come in pairs.

Example:
For 28:
2 and 14
4 and 7

So checking till sqrt(n) is enough.

--------------------------------------------------

4) Why check:
i != n/i

- To avoid duplicate printing in perfect squares.

Example:
36 -> divisor pair:
6 and 6

Print only once.

--------------------------------------------------

5) Time Complexity of Current Code:
Prime checking:
O(n)

Overall:
Approximately O(n * sqrt(n))

--------------------------------------------------

6) Better Optimization:
Instead of counting divisors,
we can directly check prime using sqrt(n).

--------------------------------------------------

7) Edge Cases:
- n = 1
- prime numbers
- perfect square numbers
*/

/*
==================================================
How to Explain This Code in Front of Interviewer
==================================================

1) First explain the problem:
"We need to print all factors of a number
that are also prime."

--------------------------------------------------

2) Explain prime checking:
"I created an isPrime() method
which counts divisors of a number.

If divisor count is exactly 2,
then the number is prime."

--------------------------------------------------

3) Explain factor finding:
"I iterate till sqrt(n)
because divisors occur in pairs."

Example:
For 28:
2 and 14
4 and 7

--------------------------------------------------

4) Explain main condition:
"If i divides n
and i is prime,
then print it."

--------------------------------------------------

5) Explain paired divisor logic:
"If n/i is different from i
and it is also prime,
then print it."

--------------------------------------------------

6) Complexity:
Time Complexity:
Approximately O(n * sqrt(n))

Space Complexity:
O(1)

--------------------------------------------------

7) Mention optimization:
"This solution works correctly,
but prime checking can be optimized further
using sqrt(n) instead of checking till n."

--------------------------------------------------

8) Short Interview Summary:
"This solution finds divisors efficiently using
sqrt optimization and prints only those divisors
which satisfy the prime condition."
*/