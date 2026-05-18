import java.util.*;

/*
Problem Statement:
Find the value of n raised to the power x using
Binary Exponentiation (Fast Power Algorithm).

Meaning:
Calculate:
n^x

Example:
2^5 = 32
3^4 = 81

--------------------------------------------------
Why use Binary Exponentiation?
- Normal method takes O(x) time.
- Binary Exponentiation reduces it to O(log x).
- Very useful for coding interviews and competitive programming.

--------------------------------------------------
Input Format:
- First integer -> base number (n)
- Second integer -> power/exponent (x)

Output Format:
- Print the value of n^x

--------------------------------------------------
Dry Run Example 1:
Input:
2
5

Working:
Initial:
n = 2
x = 5
ans = 1

Step 1:
x is odd

ans = ans * n
ans = 1 * 2 = 2

x = x - 1 = 4

--------------------------------------------------

Step 2:
x is even

n = n * n = 2 * 2 = 4
x = x / 2 = 2

--------------------------------------------------

Step 3:
x is even

n = 4 * 4 = 16
x = 2 / 2 = 1

--------------------------------------------------

Step 4:
x is odd

ans = 2 * 16 = 32
x = 1 - 1 = 0

Loop ends.

Output:
32

--------------------------------------------------
Dry Run Example 2:
Input:
3
4

Working:
3^4 = 81

Output:
81
*/

public class power {

    // Method to calculate n^x using Binary Exponentiation
    public static void expo(int n, int x) {

        // Variable to store final answer
        int ans = 1;

        // Continue until power becomes 0
        while (x > 0) {

            // If power is odd
            if (x % 2 == 1) {

                // Multiply current base with answer
                ans *= n;

                // Reduce power by 1
                x -= 1;

            } else {

                // If power is even:
                // square the base
                n *= n;

                // divide power by 2
                x /= 2;
            }
        }

        // Print final result
        System.out.println(ans);
    }

    public static void main(String args[]) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read base number
        int n = sc.nextInt();

        // Read exponent/power
        int x = sc.nextInt();

        // Call exponentiation method
        expo(n, x);

        // Close Scanner
        sc.close();
    }
}

/*
==================================================
Important Notes for Revision
==================================================

1) Binary Exponentiation:
- Also called Fast Power Algorithm.
- Used to calculate powers efficiently.

--------------------------------------------------

2) Key Logic:
If power is odd:
ans = ans * n
x = x - 1

If power is even:
n = n * n
x = x / 2

--------------------------------------------------

3) Why is it faster?
Normal method:
2^1000 requires 1000 multiplications.

Binary Exponentiation:
Requires only log2(1000) operations.

--------------------------------------------------

4) Time Complexity:
O(log x)

--------------------------------------------------

5) Space Complexity:
O(1)

--------------------------------------------------

6) Common Uses:
- Competitive Programming
- Modular Exponentiation
- Matrix Exponentiation
- Recursion Optimization
- Large Power Calculations

--------------------------------------------------

7) Edge Cases:
- x = 0 -> answer is 1
- n = 0
- large values of x
*/

/*
==================================================
How to Explain This Code in Front of Interviewer
==================================================

1) First explain the problem:
"We need to calculate n raised to the power x efficiently."

--------------------------------------------------

2) Explain normal approach problem:
"A normal loop would take O(x) time,
which becomes slow for very large powers."

--------------------------------------------------

3) Explain Binary Exponentiation idea:
"In Binary Exponentiation,
if the power is even,
I square the base and divide the power by 2.

If the power is odd,
I multiply the current base with the answer
and reduce power by 1."

--------------------------------------------------

4) Explain important observation:
Example:
2^8

Instead of:
2 * 2 * 2 * 2 * 2 * 2 * 2 * 2

We do:
2^8 = (2^2)^4
     = (4^2)^2
     = (16^2)^1

This reduces operations significantly.

--------------------------------------------------

5) Explain loop working:
"The loop continues until exponent becomes 0.
At every step,
the exponent reduces quickly."

--------------------------------------------------

6) Complexity:
Time Complexity:
O(log x)

Space Complexity:
O(1)

--------------------------------------------------

7) Short Interview Summary:
"This solution uses Binary Exponentiation
to compute powers efficiently in logarithmic time
instead of linear time."
*/