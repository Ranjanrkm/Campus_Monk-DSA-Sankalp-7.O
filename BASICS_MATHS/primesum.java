import java.util.*;

/*
Problem Statement:
Check whether a given number can be represented
as the sum of two prime numbers.

If possible:
- Print the two prime numbers
- Print "Yes possible"

Otherwise:
- Print "Not possible"

--------------------------------------------------
What is a Prime Number?
- A number greater than 1
- Having exactly two divisors:
  1 and itself

Examples:
2, 3, 5, 7, 11 ...

--------------------------------------------------
Input Format:
- A single integer n

Output Format:
- If possible:
  prime1 prime2
  Yes possible

- Otherwise:
  Not possible

--------------------------------------------------
Dry Run Example 1:
Input:
34

Working:

i = 1
1 is not prime

--------------------------------------------------

i = 2
2 is prime

34 - 2 = 32
32 is not prime

--------------------------------------------------

i = 3
3 is prime

34 - 3 = 31
31 is also prime

So:
34 = 3 + 31

Output:
3 31
Yes possible

--------------------------------------------------
Dry Run Example 2:
Input:
11

Working:

11 cannot be represented
as sum of two prime numbers.

Output:
Not possible
*/

public class primesum {

    // Method to check whether a number is prime or not
    public static boolean isPrime(int num) {

        // Numbers less than or equal to 1 are not prime
        if (num <= 1) {
            return false;
        }

        // Check divisibility from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {

            // If divisible, then not prime
            if (num % i == 0) {
                return false;
            }
        }

        // If no divisor found, number is prime
        return true;
    }

    // Method to check whether n can be expressed
    // as sum of two prime numbers
    public static boolean prime_Sum(int n) {

        // Loop from 1 to n-1
        for (int i = 1; i < n; i++) {

            // Check:
            // i is prime
            // n-i is also prime
            if (isPrime(i) && isPrime(n - i)) {

                // Print the two prime numbers
                System.out.println(i + " " + (n - i));

                // Pair found
                return true;
            }
        }

        // No valid pair found
        return false;
    }

    public static void main(String args[]) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read the number
        int n = sc.nextInt();

        // Check whether representation is possible
        if (prime_Sum(n)) {
            System.out.println("Yes possible");
        } else {
            System.out.println("Not possible");
        }

        // Close Scanner
        sc.close();
    }
}

/*
==================================================
Important Notes for Revision
==================================================

1) Prime Number:
- A number greater than 1
- Has exactly two divisors:
  1 and itself

--------------------------------------------------

2) Prime Checking Optimization:
- Instead of checking till n,
  check only till sqrt(n).

Reason:
Divisors occur in pairs.

--------------------------------------------------

3) Main Logic:
For every i:
Check:
i is prime
AND
(n - i) is prime

If both are prime:
n can be represented as sum of two primes.

--------------------------------------------------

4) Example:
34

Possible pairs:
3 + 31
5 + 29
11 + 23
17 + 17

Current code prints first valid pair only.

--------------------------------------------------

5) Time Complexity:
Outer Loop:
O(n)

Prime Checking:
O(sqrt(n))

Overall:
O(n * sqrt(n))

--------------------------------------------------

6) Space Complexity:
O(1)

--------------------------------------------------

7) Edge Cases:
- n <= 2
- odd numbers
- prime numbers
- very small inputs

--------------------------------------------------

8) Related Concept:
This problem is related to
Goldbach’s Conjecture:
"Every even number greater than 2
can be represented as sum of two primes."
*/

/*
==================================================
How to Explain This Code in Front of Interviewer
==================================================

1) First explain the problem:
"We need to check whether a number
can be represented as sum of two prime numbers."

--------------------------------------------------

2) Explain prime checking:
"I created an isPrime() method
which checks divisibility till sqrt(num)
for efficient prime checking."

--------------------------------------------------

3) Explain the main idea:
"I iterate from 1 to n-1.

For every number i:
- check if i is prime
- check if n-i is also prime"

--------------------------------------------------

4) Explain stopping condition:
"If both numbers are prime,
I print the pair and return true immediately."

--------------------------------------------------

5) Explain optimization:
"Prime checking is optimized using sqrt(num)
instead of checking till num."

--------------------------------------------------

6) Complexity:
Time Complexity:
O(n * sqrt(n))

Space Complexity:
O(1)

--------------------------------------------------

7) Short Interview Summary:
"This solution checks all possible pairs
and verifies whether both numbers are prime
using sqrt optimization."
*/
