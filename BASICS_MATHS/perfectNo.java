import java.util.*;

/*
Problem Statement:
Check whether a given number is a Perfect Number or not.

What is a Perfect Number?
- A perfect number is a number whose sum of proper divisors
  (excluding the number itself) is equal to the number.

Example:
6 -> Divisors are: 1, 2, 3
Sum = 1 + 2 + 3 = 6
So, 6 is a Perfect Number.

Another Example:
28 -> Divisors are: 1, 2, 4, 7, 14
Sum = 28
So, 28 is also a Perfect Number.

Input Format:
- A single integer n

Output Format:
- If number is perfect:
  n : is a perfect number

- Otherwise:
  n : is not a perfect number

--------------------------------------------------
Dry Run Example 1:
Input:
6

Working:
Initial sum = 1

Loop runs from 2 to sqrt(6)

i = 2
6 % 2 == 0

Add divisors:
sum = 1 + 2 = 3

Another divisor:
6 / 2 = 3

sum = 3 + 3 = 6

Final:
sum = 6
sum == n

Output:
6 : is a perfect number

--------------------------------------------------
Dry Run Example 2:
Input:
10

Working:
Initial sum = 1

i = 2
10 % 2 == 0

sum = 1 + 2 = 3

Another divisor:
10 / 2 = 5

sum = 3 + 5 = 8

Final:
sum = 8
sum != n

Output:
10 : is not a perfect number
*/

public class perfectNo {

    // Method to check whether a number is perfect or not
    public static boolean isPerfect(int n) {

        // Perfect numbers are positive integers
        // Numbers less than or equal to 1 are not perfect
        if (n <= 1) {
            return false;
        }

        // 1 is always a proper divisor
        int sum = 1;

        // Loop only till square root of n
        // This reduces time complexity
        for (int i = 2; i <= Math.sqrt(n); i++) {

            // Check if i divides n completely
            if (n % i == 0) {

                // Add divisor i
                sum += i;

                // Add paired divisor (n / i)
                // Avoid duplicate addition for perfect squares
                if (n / i != i) {
                    sum += n / i;
                }
            }
        }

        // If sum of proper divisors equals number,
        // then it is a perfect number
        return sum == n;
    }

    public static void main(String args[]) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read number from user
        int n = sc.nextInt();

        // Check perfect number condition
        if (isPerfect(n)) {
            System.out.println(n + " : is a perfect number");
        } else {
            System.out.println(n + " : is not a perfect number");
        }

        // Close Scanner
        sc.close();
    }
}

/*
==================================================
Important Notes for Revision
==================================================

1) Proper Divisors:
- Proper divisors are divisors excluding the number itself.

Example:
Divisors of 12:
1, 2, 3, 4, 6, 12

Proper divisors:
1, 2, 3, 4, 6

--------------------------------------------------

2) Why sum starts from 1?
- Because 1 is always a proper divisor of every number
  greater than 1.

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
if(n / i != i)

- To avoid duplicate addition in perfect squares.

Example:
For 36:
6 * 6 = 36

Here divisor pair is same,
so add only once.

--------------------------------------------------

5) Time Complexity:
O(sqrt(n))

--------------------------------------------------

6) Space Complexity:
O(1)

--------------------------------------------------

7) Edge Cases:
- n <= 1 -> not a perfect number
- Perfect square numbers
- Large numbers
*/

/*
==================================================
How to Explain This Code in Front of Interviewer
==================================================

1) First explain the problem:
"We need to check whether the sum of proper divisors
of a number is equal to the number itself."

Example:
6 -> 1 + 2 + 3 = 6

--------------------------------------------------

2) Explain the approach:
"I initialize sum with 1 because 1 is always a proper divisor.
Then I iterate from 2 to sqrt(n) to find divisors efficiently."

--------------------------------------------------

3) Explain divisor pair optimization:
"If i divides n,
then n/i is also a divisor.

Example:
For 28:
2 and 14 are divisor pairs.

So instead of checking till n,
I only check till sqrt(n)."

--------------------------------------------------

4) Explain duplicate check:
"For perfect square numbers,
both divisors can become same.

Example:
36 -> 6 and 6

So I avoid adding the same divisor twice."

--------------------------------------------------

5) Explain final comparison:
"If sum becomes equal to the original number,
then it is a perfect number."

--------------------------------------------------

6) Complexity:
Time Complexity:
O(sqrt(n))

Space Complexity:
O(1)

--------------------------------------------------

7) Short Interview Summary:
"This solution uses divisor pair optimization
to efficiently calculate the sum of proper divisors
in O(sqrt(n)) time."
*/