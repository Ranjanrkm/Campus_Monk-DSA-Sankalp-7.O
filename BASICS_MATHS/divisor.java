import java.util.*;

/*
Problem Statement:
Print all divisors of a given number.

A divisor of a number n is a number that divides n completely
without leaving any remainder.

Example:
If n = 12
Divisors are: 1, 2, 3, 4, 6, 12

Input Format:
- A single integer n

Output Format:
- Print all divisors of n in one line, separated by spaces

Dry Run Example 1:
Input:
12

Working:
i = 1 -> 12 % 1 == 0  -> divisors: 1 and 12
i = 2 -> 12 % 2 == 0  -> divisors: 2 and 6
i = 3 -> 12 % 3 == 0  -> divisors: 3 and 4

Output:
1 2 3 4 6 12

Dry Run Example 2:
Input:
15

Working:
i = 1 -> divisors: 1 and 15
i = 2 -> 15 % 2 != 0
i = 3 -> divisors: 3 and 5

Output:
1 3 5 15
*/

public class divisor {

    // This method finds and prints all divisors of n
    public static void Alldivisor(int n) {
        // If the number is negative, convert it to positive
        // because divisors are usually discussed for positive numbers
        if (n < 0) {
            n = -n;
        }

        // If n is 0, every number divides 0 mathematically,
        // but in coding problems this case is usually not used.
        // So we simply return without printing anything.
        if (n == 0) {
            return;
        }

        // Store smaller divisors in one StringBuilder
        // and larger divisors in another StringBuilder
        // so that final output comes in ascending order.
        StringBuilder small = new StringBuilder();
        StringBuilder large = new StringBuilder();

        // Loop only up to square root of n
        // This makes the solution faster than checking every number till n
        for (int i = 1; i <= Math.sqrt(n); i++) {
            // If i divides n completely, then i is a divisor
            if (n % i == 0) {
                // Add the smaller divisor
                small.append(i).append(" ");

                // If i and n/i are different, add the larger divisor
                // Example: for 12, when i = 2:
                // smaller divisor = 2
                // larger divisor = 6
                if (i != n / i) {
                    large.insert(0, (n / i) + " ");
                }
            }
        }

        // Print all divisors in ascending order
        System.out.print(small.toString() + large.toString());
    }

    public static void main(String args[]) {
        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Read the number
        int n = sc.nextInt();

        // Call the divisor function
        Alldivisor(n);

        // Close Scanner
        sc.close();
    }
}

/*
Important Note for Revision:
- Use sqrt optimization to reduce time complexity.
- Check only till sqrt(n), not till n.
- When i divides n, both i and n/i are divisors.
- If i == n/i, print it only once.
- Do not print extra prompt text like "Enter a Number :" in coding round files.
*/