/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to demonstrate the basic
 * operations of an ArrayList.
 *
 * The program should:
 * - Create an ArrayList of Integer type.
 * - Add elements into the ArrayList.
 * - Print all elements using:
 *   1. Traditional for loop
 *   2. Enhanced for-each loop
 *
 * This program demonstrates:
 * - ArrayList Creation
 * - add() Method
 * - size() Method
 * - get() Method
 * - ArrayList Traversal
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * No input is required.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * 10 10
 * 10 10
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Step 1:
 * Create an empty ArrayList.
 *
 * arr = []
 *
 * ------------------------------------------
 *
 * Step 2:
 * Add 10
 *
 * arr = [10]
 *
 * ------------------------------------------
 *
 * Step 3:
 * Add 10
 *
 * arr = [10, 10]
 *
 * ------------------------------------------
 *
 * Step 4:
 * Print using for loop.
 *
 * Output:
 * 10 10
 *
 * ------------------------------------------
 *
 * Step 5:
 * Print using for-each loop.
 *
 * Output:
 * 10 10
 *
 * ==========================================
 * Final Output:
 * ==========================================
 * 10 10
 * 10 10
 */

import java.util.*;

public class darray {

    public static void main(String args[]) {

        // Create an ArrayList of Integer type
        ArrayList<Integer> arr = new ArrayList<Integer>();

        // Add elements into the ArrayList
        arr.add(10);
        arr.add(10);

        /*
         * Traversal using Traditional For Loop
         * Access elements using index
         */
        for (int i = 0; i < arr.size(); i++) {

            System.out.print(arr.get(i) + " ");
        }

        // Move to next line
        System.out.println();

        /*
         * Traversal using Enhanced For-Each Loop
         * Directly accesses elements
         */
        for (int a : arr) {

            System.out.print(a + " ");
        }
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. ArrayList is a dynamic array.
 *
 * 2. ArrayList belongs to the
 *    java.util package.
 *
 * 3. Important Methods:
 *
 *    add(element)
 *    -> Inserts element.
 *
 *    get(index)
 *    -> Accesses element.
 *
 *    size()
 *    -> Returns total elements.
 *
 * 4. Duplicate values are allowed
 *    in an ArrayList.
 *
 * Example:
 *
 * [10, 10]
 *
 * is completely valid.
 *
 * 5. ArrayList maintains insertion order.
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Using:
 *
 * arr.length
 *
 * Wrong for ArrayList.
 *
 * Correct:
 *
 * arr.size()
 *
 * 2. Using:
 *
 * arr[i]
 *
 * Wrong for ArrayList.
 *
 * Correct:
 *
 * arr.get(i)
 *
 * 3. Forgetting to import:
 *
 * import java.util.*;
 *
 * 4. Using int instead of Integer.
 *
 * Wrong:
 *
 * ArrayList<int>
 *
 * Correct:
 *
 * ArrayList<Integer>
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program demonstrates basic ArrayList
 * operations in Java. I created an ArrayList
 * of Integer type and inserted two values
 * using the add() method. Then I traversed
 * the list using both a traditional for loop
 * and an enhanced for-each loop. The for loop
 * uses get() and size() methods, whereas the
 * for-each loop directly accesses elements."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY:
 *
 * Insertion:
 * O(1) (Amortized)
 *
 * Traversal:
 * O(n)
 *
 * Overall:
 * O(n)
 *
 * where n = number of elements.
 *
 * SPACE COMPLEXITY:
 *
 * O(n)
 *
 * ArrayList stores n elements.
 *
 * ==========================================
 * INTERVIEW QUICK ANSWER:
 * ==========================================
 * Q: What is the difference between
 * Array and ArrayList?
 *
 * Answer:
 * Array has a fixed size once created,
 * whereas ArrayList can dynamically grow
 * and shrink during runtime.
 *
 * ------------------------------------------
 *
 * Q: Why do we use arr.size() instead of
 * arr.length?
 *
 * Answer:
 * Arrays use the length property,
 * whereas ArrayList uses the size()
 * method to return the number of elements.
 *
 * ------------------------------------------
 *
 * Q: Can ArrayList store duplicate values?
 *
 * Answer:
 * Yes.
 *
 * ArrayList allows duplicate elements
 * and preserves insertion order.
 */