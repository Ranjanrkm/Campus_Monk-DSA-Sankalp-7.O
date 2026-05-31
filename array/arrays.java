/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to demonstrate:
 *
 * 1. Array Declaration
 * 2. Array Creation
 * 3. Finding Array Length
 * 4. Array Initialization
 * 5. Traversing an Array using:
 *    - Traditional for loop
 *    - Enhanced for-each loop
 *
 * The program should:
 * - Create integer arrays of different sizes.
 * - Print the length of an array.
 * - Store values in an array.
 * - Display array elements using two different loops.
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * No input is required.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * 4
 * 10
 * 20
 * 30
 * 10 20 30
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Step 1:
 * Create array:
 *
 * int arr[];
 * arr = new int[4];
 *
 * Array Size:
 * 4
 *
 * ------------------------------------------
 *
 * Step 2:
 * Print length:
 *
 * arr.length
 *
 * Output:
 * 4
 *
 * ------------------------------------------
 *
 * Step 3:
 * Create and initialize array:
 *
 * int[] c = {10, 20, 30};
 *
 * Index:
 * c[0] = 10
 * c[1] = 20
 * c[2] = 30
 *
 * ------------------------------------------
 *
 * Step 4:
 * Traverse using for loop:
 *
 * i = 0 -> Print 10
 * i = 1 -> Print 20
 * i = 2 -> Print 30
 *
 * ------------------------------------------
 *
 * Step 5:
 * Traverse using for-each loop:
 *
 * a = 10 -> Print 10
 * a = 20 -> Print 20
 * a = 30 -> Print 30
 *
 * ==========================================
 * Final Output:
 * ==========================================
 * 4
 * 10
 * 20
 * 30
 * 10 20 30
 */

import java.util.*;

public class arrays {

    public static void main(String args[]) {

        // Array Declaration
        int arr[];

        // Array Creation (size = 4)
        arr = new int[4];

        // Another integer array
        int b[];

        // Array Creation (size = 3)
        b = new int[3];

        // Print length of array 'arr'
        System.out.println(arr.length);

        // Array Declaration + Initialization
        int[] c = {10, 20, 30};

        /*
         * Traditional For Loop
         * Used when index access is required
         */
        for (int i = 0; i < c.length; i++) {

            // Print each element
            System.out.println(c[i]);
        }

        /*
         * Enhanced For Loop (For-Each Loop)
         * Used when only element access is required
         */
        for (int a : c) {

            // Print element followed by space
            System.out.print(a + " ");
        }
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Array is a collection of similar
 *    datatype elements stored in contiguous memory.
 *
 * 2. Array Indexing starts from 0.
 *
 * Example:
 *
 * int[] c = {10, 20, 30};
 *
 * c[0] = 10
 * c[1] = 20
 * c[2] = 30
 *
 * 3. length is a property used to find
 *    the size of an array.
 *
 * Example:
 *
 * arr.length
 *
 * 4. Array size is fixed once created.
 *
 * Example:
 *
 * int arr[] = new int[5];
 *
 * Size cannot be changed later.
 *
 * 5. Default values of int array:
 *
 * int arr[] = new int[4];
 *
 * arr[0] = 0
 * arr[1] = 0
 * arr[2] = 0
 * arr[3] = 0
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Accessing invalid index.
 *
 * Example:
 *
 * int[] arr = {10, 20, 30};
 *
 * arr[3]
 *
 * Error:
 * ArrayIndexOutOfBoundsException
 *
 * 2. Using:
 *
 * i <= arr.length
 *
 * instead of:
 *
 * i < arr.length
 *
 * This causes runtime error.
 *
 * 3. Confusing length property with length().
 *
 * Arrays:
 *
 * arr.length
 *
 * Strings:
 *
 * str.length()
 *
 * 4. Forgetting array size while creation.
 *
 * Wrong:
 *
 * int arr[] = new int[];
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program demonstrates basic array operations
 * in Java. First, I declare and create arrays of
 * different sizes. Then I use the length property
 * to determine the size of an array. After that,
 * I initialize another array with values and
 * traverse it using both a traditional for loop
 * and an enhanced for-each loop. This demonstrates
 * the most common ways of working with arrays in Java."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY:
 *
 * For Loop Traversal:
 * O(n)
 *
 * For-Each Traversal:
 * O(n)
 *
 * Overall:
 * O(n)
 *
 * where n = number of elements in array.
 *
 * SPACE COMPLEXITY:
 *
 * O(n)
 *
 * Arrays store n elements.
 *
 * ==========================================
 * INTERVIEW QUICK ANSWER:
 * ==========================================
 * Q: What is an Array?
 *
 * Answer:
 * An array is a collection of similar data
 * type elements stored in contiguous memory
 * locations and accessed using indexes.
 *
 * ------------------------------------------
 *
 * Q: What is the difference between for loop
 * and for-each loop?
 *
 * Answer:
 * for loop provides index access and is useful
 * when element positions are needed.
 *
 * for-each loop directly accesses elements and
 * is simpler when indexes are not required.
 *
 * ------------------------------------------
 *
 * Q: Can the size of an array be changed?
 *
 * Answer:
 * No. Array size is fixed once the array
 * is created.
 */
