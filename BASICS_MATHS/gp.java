import java.util.*;

/*
Problem Statement:
Print the first m terms of a Geometric Progression (GP).

In a GP:
- first term = a
- common ratio = r
- number of terms = m

Formula:
nth term = a * r^(n-1)

Input Format:
- Three integers:
  a
  r
  m

Output Format:
- Print the GP series terms in one line, separated by spaces

Dry Run Example 1:
Input:
2
3
5

Working:
a = 2, r = 3, m = 5

Term 1 = 2 * 3^0 = 2
Term 2 = 2 * 3^1 = 6
Term 3 = 2 * 3^2 = 18
Term 4 = 2 * 3^3 = 54
Term 5 = 2 * 3^4 = 162

Output:
2 6 18 54 162

Dry Run Example 2:
Input:
5
2
4

Working:
a = 5, r = 2, m = 4

Term 1 = 5 * 2^0 = 5
Term 2 = 5 * 2^1 = 10
Term 3 = 5 * 2^2 = 20
Term 4 = 5 * 2^3 = 40

Output:
5 10 20 40
*/

public class gp {

    // This method prints the GP series
    public static void gp_series(int a, int r, int m) {
        // Loop from the 1st term to the m-th term
        for (int i = 1; i <= m; i++) {
            // Formula for ith term:
            // a * r^(i-1)
            int temp = (int) (a * Math.pow(r, i - 1));

            // Print the term followed by a space
            System.out.print(temp + " ");
        }
    }

    public static void main(String args[]) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read first term of GP
        int a = sc.nextInt();

        // Read common ratio
        int r = sc.nextInt();

        // Read number of terms
        int m = sc.nextInt();

        // Call the function to print the GP series
        gp_series(a, r, m);

        // Close Scanner
        sc.close();
    }
}