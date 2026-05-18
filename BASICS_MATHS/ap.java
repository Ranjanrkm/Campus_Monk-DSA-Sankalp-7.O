import java.util.*;

/*
Problem Statement:
Print the first n terms of an Arithmetic Progression (AP).

Given:
- First term = 5
- Common difference = 2

For example:
If n = 5
Output will be:
5 7 9 11 13
*/

public class ap {

    // This method prints the AP terms
    public static void ap_sum(int a, int d, int n) {
        // Print the first term
        System.out.print(a + " ");

        // Print the remaining terms from 2nd term to nth term
        for (int i = 2; i <= n; i++) {
            a = a + d;              // Add common difference to get next term
            System.out.print(a + " ");
        }
    }

    public static void main(String args[]) {
        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Read number of terms
        int n = sc.nextInt();

        // Call the AP function
        ap_sum(5, 2, n);

        // Close Scanner to release resources
        sc.close();
    }
}

/*
Dry Run Example 1:
Input:
5

Working:
a = 5, d = 2, n = 5
Term 1 = 5
Term 2 = 5 + 2 = 7
Term 3 = 7 + 2 = 9
Term 4 = 9 + 2 = 11
Term 5 = 11 + 2 = 13

Output:
5 7 9 11 13

Dry Run Example 2:
Input:
3

Working:
a = 5, d = 2, n = 3
Term 1 = 5
Term 2 = 7
Term 3 = 9

Output:
5 7 9
*/