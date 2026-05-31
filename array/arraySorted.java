/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to check whether a given
 * array is sorted in ascending order or not.
 *
 * The program should:
 * - Read the size of the array.
 * - Read array elements from the user.
 * - Check whether every element is less than
 *   or equal to the next element.
 * - Print true if the array is sorted.
 * - Print false otherwise.
 *
 * This program demonstrates:
 * - Array Input
 * - Array Traversal
 * - Function Creation
 * - Boolean Return Type
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * First Line:
 * - Integer n (size of array)
 *
 * Second Line:
 * - n space-separated integers
 *
 * Example:
 * 5
 * 10 20 30 40 50
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * Print:
 * true  -> If array is sorted
 * false -> If array is not sorted
 *
 * ==========================================
 * Dry Run Example 1:
 * ==========================================
 * Input:
 * 5
 * 10 20 30 40 50
 *
 * Step 1:
 * Array:
 * [10, 20, 30, 40, 50]
 *
 * Step 2:
 * Compare:
 *
 * 10 <= 20 -> TRUE
 * 20 <= 30 -> TRUE
 * 30 <= 40 -> TRUE
 * 40 <= 50 -> TRUE
 *
 * Step 3:
 * No violation found.
 *
 * Return:
 * true
 *
 * Output:
 * true
 *
 * ==========================================
 * Dry Run Example 2:
 * ==========================================
 * Input:
 * 5
 * 10 25 15 40 50
 *
 * Step 1:
 * Array:
 * [10, 25, 15, 40, 50]
 *
 * Step 2:
 * Compare:
 *
 * 10 <= 25 -> TRUE
 * 25 <= 15 -> FALSE
 *
 * Step 3:
 * Array is not sorted.
 *
 * Return:
 * false
 *
 * Output:
 * false
 */

import java.util.*;

public class arraySorted {

    /*
     * Function to check whether
     * the array is sorted or not
     */
    public static boolean check_sort(int[] arr) {

        // Traverse array until second-last element
        for (int i = 0; i < arr.length - 1; i++) {

            /*
             * If current element is greater
             * than the next element,
             * array is not sorted.
             */
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        // Array is sorted
        return true;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read size of array
        int n = sc.nextInt();

        // Create array of size n
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Check whether array is sorted
        boolean ans = check_sort(arr);

        // Print result
        System.out.print(ans);

        // Close Scanner
        sc.close();
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. A sorted array means:
 *
 *    arr[i] <= arr[i + 1]
 *
 * for every valid index.
 *
 * 2. Only one violation is enough
 *    to declare the array unsorted.
 *
 * Example:
 *
 * [10, 20, 15, 30]
 *
 * Here:
 *
 * 20 > 15
 *
 * Therefore:
 * Array is not sorted.
 *
 * 3. We traverse only until:
 *
 * arr.length - 1
 *
 * because we compare:
 *
 * arr[i]
 * with
 * arr[i + 1]
 *
 * 4. Early return improves efficiency.
 *
 * As soon as an unsorted pair is found,
 * the function immediately returns false.
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Using:
 *
 * i < arr.length
 *
 * instead of:
 *
 * i < arr.length - 1
 *
 * This causes:
 *
 * ArrayIndexOutOfBoundsException
 *
 * because:
 *
 * arr[i + 1]
 *
 * becomes invalid.
 *
 * 2. Writing:
 *
 * arr[i] < arr[i + 1]
 *
 * instead of:
 *
 * arr[i] <= arr[i + 1]
 *
 * Duplicate values should still be considered sorted.
 *
 * Example:
 *
 * [10, 10, 20]
 *
 * This is sorted.
 *
 * 3. Forgetting to return true
 *    after completing the loop.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program checks whether an array is sorted
 * in ascending order. I created a separate method
 * named check_sort() that traverses the array and
 * compares each element with its next element.
 * If any element is greater than the next one,
 * the method immediately returns false.
 * If the loop completes successfully, the array
 * is sorted and the method returns true."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY:
 *
 * O(n)
 *
 * We traverse the array once.
 *
 * SPACE COMPLEXITY:
 *
 * O(1)
 *
 * No extra data structure is used.
 *
 * ==========================================
 * INTERVIEW QUICK ANSWER:
 * ==========================================
 * Q: How do you check if an array is sorted?
 *
 * Answer:
 * Traverse the array and compare each element
 * with the next element.
 *
 * If any element is greater than the next one,
 * the array is not sorted.
 *
 * Otherwise, it is sorted.
 *
 * ------------------------------------------
 *
 * Q: Why do we use arr.length - 1 in the loop?
 *
 * Answer:
 * Because we compare arr[i] with arr[i + 1].
 * Going until arr.length would make i + 1
 * exceed the array boundary.
 *
 * ------------------------------------------
 *
 * Q: Can this approach handle duplicate values?
 *
 * Answer:
 * Yes.
 *
 * Since we only check:
 *
 * arr[i] > arr[i + 1]
 *
 * duplicate values are allowed and still
 * considered sorted.
 */