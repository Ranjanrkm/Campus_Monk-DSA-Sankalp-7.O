/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to count how many elements
 * in an array are greater than all previous elements.
 *
 * In this program:
 * - Read the size of the array.
 * - Read all array elements.
 * - Count the number of times a new maximum appears
 *   while traversing the array from left to right.
 * - Print the final count.
 *
 * Example:
 * Array = [3, 1, 4, 2, 5]
 * New maximums are: 3, 4, 5
 * So answer = 3
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - First line contains an integer n, the size of the array.
 * - Second line contains n space-separated integers.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - Print a single integer representing the count of
 *   elements that are greater than all previous elements.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Input:
 * 5
 * 3 1 4 2 5
 *
 * Step-by-step working:
 * 1. Start with maxi = -infinity, cnt = 0
 * 2. Read 3 -> 3 > maxi, so maxi = 3, cnt = 1
 * 3. Read 1 -> 1 > 3? No
 * 4. Read 4 -> 4 > 3, so maxi = 4, cnt = 2
 * 5. Read 2 -> 2 > 4? No
 * 6. Read 5 -> 5 > 4, so maxi = 5, cnt = 3
 *
 * Final Output:
 * 3
 */

import java.util.*;

public class greaterthanprior {

    /*
     * This method counts how many elements are
     * greater than all previous elements.
     */
    public static int greaterthanprevious(int[] arr) {

        // Counter for new maximum elements
        int cnt = 0;

        // Store the maximum value seen so far
        int maxi = Integer.MIN_VALUE;

        // Traverse the array from left to right
        for (int i = 0; i < arr.length; i++) {

            /*
             * If current element is greater than
             * the maximum element seen so far,
             * it becomes a new maximum.
             */
            if (maxi < arr[i]) {
                maxi = arr[i];
                cnt++;
            }
        }

        // Return the total count
        return cnt;
    }

    public static void main(String args[]) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Read size of array
        int n = sc.nextInt();

        // Create array of size n
        int[] arr = new int[n];

        // Read all array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call function to count new maximum elements
        int result = greaterthanprevious(arr);

        // Print the final answer
        System.out.print(result);

        // Close Scanner
        sc.close();
    }

    /*
     * ==========================================
     * IMPORTANT NOTES FOR REVISION:
     * ==========================================
     * 1. This logic counts "record-breaking" elements
     *    from left to right.
     *
     * 2. The first element is always counted
     *    because maxi starts from Integer.MIN_VALUE.
     *
     * 3. If the array is:
     *    [10, 20, 20, 30]
     *    Count = 3
     *
     *    Because:
     *    10 -> new maximum
     *    20 -> new maximum
     *    20 -> not greater
     *    30 -> new maximum
     *
     * 4. Integer.MIN_VALUE is used so that even
     *    very small negative numbers are handled properly.
     *
     * 5. The condition used is:
     *    if(maxi < arr[i])
     *
     *    This means duplicates are NOT counted.
     *
     * ==========================================
     * COMMON BEGINNER MISTAKES:
     * ==========================================
     * 1. Using <= instead of <
     *
     * That would count duplicate values also.
     *
     * 2. Forgetting to update maxi
     *
     * If maxi is not updated, the logic becomes wrong.
     *
     * 3. Starting maxi from 0
     *
     * That fails for negative arrays.
     *
     * 4. Confusing this with counting
     *    elements greater than the previous element.
     *
     * This program counts elements greater than
     * all previous elements, not just the immediate previous one.
     *
     * ==========================================
     * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
     * ==========================================
     * "This program counts how many elements in the array
     * are greater than all the previous elements.
     * I traverse the array from left to right and keep
     * track of the maximum value seen so far.
     * Whenever I find an element greater than the current
     * maximum, I update the maximum and increment the count.
     * Finally, I print the total count of such elements."
     *
     * ==========================================
     * TIME COMPLEXITY & SPACE COMPLEXITY:
     * ==========================================
     * TIME COMPLEXITY: O(n)
     * The array is traversed only once.
     *
     * SPACE COMPLEXITY: O(1)
     * Only a few extra variables are used.
     *
     * ==========================================
     * INTERVIEW QUICK ANSWER:
     * ==========================================
     * Q: What does this program count?
     *
     * Answer:
     * It counts how many elements are greater than
     * all previous elements while scanning the array
     * from left to right.
     *
     * ------------------------------------------
     *
     * Q: Why is Integer.MIN_VALUE used?
     *
     * Answer:
     * It allows the program to correctly handle
     * any integer array, including negative values.
     */
}