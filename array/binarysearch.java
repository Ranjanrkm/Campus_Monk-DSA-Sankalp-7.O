/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to implement Binary Search
 * on a sorted array.
 *
 * The program should:
 * - Read a target value from the user.
 * - Search the target in a sorted array.
 * - Return the index of the target if found.
 * - Return -1 if the target is not present.
 *
 * Array Used:
 * [10, 20, 30, 40, 50]
 *
 * This program demonstrates:
 * - Binary Search Algorithm
 * - Divide and Conquer Technique
 * - Searching in Sorted Arrays
 * - Functions/Methods in Java
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * A single integer representing the target value.
 *
 * Example:
 * 30
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * Print the index of the target element.
 *
 * Example:
 * Input:
 * 30
 *
 * Output:
 * 2
 *
 * ==========================================
 * Dry Run Example 1:
 * ==========================================
 * Input:
 * 40
 *
 * Array:
 * [10, 20, 30, 40, 50]
 *
 * Step 1:
 * start = 0
 * end = 4
 *
 * mid = (0 + 4) / 2 = 2
 *
 * arr[2] = 30
 *
 * 30 < 40
 *
 * Search in right half
 *
 * start = 3
 *
 * ------------------------------------------
 *
 * Step 2:
 *
 * start = 3
 * end = 4
 *
 * mid = (3 + 4) / 2 = 3
 *
 * arr[3] = 40
 *
 * Target Found
 *
 * Return:
 * 3
 *
 * Output:
 * 3
 *
 * ==========================================
 * Dry Run Example 2:
 * ==========================================
 * Input:
 * 35
 *
 * Array:
 * [10, 20, 30, 40, 50]
 *
 * Step 1:
 * mid = 2
 *
 * arr[2] = 30
 *
 * 30 < 35
 *
 * Search right side
 *
 * ------------------------------------------
 *
 * Step 2:
 * mid = 3
 *
 * arr[3] = 40
 *
 * 40 > 35
 *
 * Search left side
 *
 * ------------------------------------------
 *
 * Step 3:
 * start > end
 *
 * Element not found
 *
 * Return:
 * -1
 *
 * Output:
 * -1
 */

import java.util.*;

public class binarysearch {

    /*
     * Binary Search Function
     * Returns index if element is found.
     * Returns -1 if element is not found.
     */
    public static int Binary_Search(int[] arr, int target) {

        // Default value if target is not found
        int index = -1;

        // Starting index
        int start = 0;

        // Ending index
        int end = arr.length - 1;

        // Continue searching while valid range exists
        while (start <= end) {

            // Find middle index
            int mid = (start + end) / 2;

            // Target found
            if (arr[mid] == target) {
                return mid;
            }

            // Search left half
            else if (arr[mid] > target) {
                end = mid - 1;
            }

            // Search right half
            else {
                start = mid + 1;
            }
        }

        // Target not found
        return index;
    }

    public static void main(String args[]) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read target value
        int target = sc.nextInt();

        // Sorted array
        int arr[] = {10, 20, 30, 40, 50};

        // Call Binary Search function
        int ans = Binary_Search(arr, target);

        // Print result
        System.out.println(ans);

        // Close Scanner
        sc.close();
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Binary Search works ONLY on
 *    sorted arrays.
 *
 * 2. Binary Search repeatedly divides
 *    the search space into two halves.
 *
 * 3. If target is found:
 *    Return index.
 *
 * 4. If target is not found:
 *    Return -1.
 *
 * 5. Binary Search is much faster than
 *    Linear Search for large datasets.
 *
 * ==========================================
 * BINARY SEARCH FLOW:
 * ==========================================
 *
 * Step 1:
 * Find middle element.
 *
 * Step 2:
 * Compare middle element with target.
 *
 * Step 3:
 *
 * If equal:
 * Found.
 *
 * If target is smaller:
 * Search left half.
 *
 * If target is greater:
 * Search right half.
 *
 * Step 4:
 * Repeat until element is found
 * or search space becomes empty.
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Applying Binary Search on
 *    an unsorted array.
 *
 * Binary Search requires:
 *
 * Sorted Array
 *
 * 2. Incorrect loop condition.
 *
 * Wrong:
 *
 * while(start < end)
 *
 * Correct:
 *
 * while(start <= end)
 *
 * 3. Updating boundaries incorrectly.
 *
 * Wrong:
 *
 * end = mid;
 *
 * Correct:
 *
 * end = mid - 1;
 *
 * 4. Forgetting to return -1
 *    when target is absent.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program implements Binary Search on a
 * sorted array. Binary Search follows the
 * divide-and-conquer approach by repeatedly
 * checking the middle element. If the middle
 * element matches the target, its index is returned.
 * Otherwise, the search continues either in the
 * left half or right half depending on the comparison.
 * This significantly reduces the search space and
 * makes the algorithm much faster than Linear Search."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY:
 *
 * Best Case:
 * O(1)
 *
 * Average Case:
 * O(log n)
 *
 * Worst Case:
 * O(log n)
 *
 * Binary Search halves the search space
 * in every iteration.
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
 * Q: What is Binary Search?
 *
 * Answer:
 * Binary Search is a searching algorithm that
 * works on sorted arrays by repeatedly dividing
 * the search space into two halves.
 *
 * ------------------------------------------
 *
 * Q: What is the prerequisite for Binary Search?
 *
 * Answer:
 * The array must be sorted.
 *
 * ------------------------------------------
 *
 * Q: Why is Binary Search faster than Linear Search?
 *
 * Answer:
 * Binary Search reduces the search space by half
 * in every iteration, giving O(log n) complexity,
 * whereas Linear Search checks elements one by one
 * and takes O(n) time.
 *
 * ------------------------------------------
 *
 * Q: When does Binary Search return -1?
 *
 * Answer:
 * When the target element is not present
 * in the array.
 */