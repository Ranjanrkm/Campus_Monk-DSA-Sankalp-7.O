/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to create an ArrayList,
 * add integer elements into it, and print the
 * complete ArrayList.
 *
 * The program demonstrates:
 * - Creating an ArrayList
 * - Adding elements using add()
 * - Printing ArrayList contents
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * No input is required.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * Print the ArrayList containing:
 *
 * [10, 20, 30]
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
 * Add 20
 *
 * arr = [10, 20]
 *
 * ------------------------------------------
 *
 * Step 4:
 * Add 30
 *
 * arr = [10, 20, 30]
 *
 * ------------------------------------------
 *
 * Step 5:
 * Print ArrayList.
 *
 * Output:
 * [10, 20, 30]
 */

import java.util.*;

public class arraylist {

    public static void main(String args[]) {

        // Create an ArrayList that stores Integer objects
        ArrayList<Integer> arr = new ArrayList<Integer>();

        // Add elements into the ArrayList
        arr.add(10);
        arr.add(20);
        arr.add(30);

        // Print the complete ArrayList
        System.out.println(arr);
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. ArrayList is part of the Java Collections Framework.
 *
 * 2. ArrayList is a dynamic array.
 *    Its size can grow and shrink automatically.
 *
 * 3. Syntax:
 *
 *    ArrayList<DataType> list = new ArrayList<DataType>();
 *
 * 4. add() method is used to insert elements.
 *
 * Example:
 *
 * list.add(100);
 *
 * 5. ArrayList maintains insertion order.
 *
 * Example:
 *
 * Added:
 * 10, 20, 30
 *
 * Output:
 * [10, 20, 30]
 *
 * Same order is preserved.
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Forgetting to import java.util.ArrayList
 *    or java.util.*.
 *
 * 2. Using int instead of Integer.
 *
 * Wrong:
 *
 * ArrayList<int> arr = new ArrayList<int>();
 *
 * Correct:
 *
 * ArrayList<Integer> arr = new ArrayList<Integer>();
 *
 * 3. Thinking ArrayList size is fixed.
 *
 * ArrayList size changes dynamically.
 *
 * 4. Forgetting parentheses while creating object.
 *
 * Wrong:
 *
 * ArrayList<Integer> arr = new ArrayList<Integer>;
 *
 * Correct:
 *
 * ArrayList<Integer> arr = new ArrayList<Integer>();
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program demonstrates the basic usage of
 * ArrayList in Java. I first create an ArrayList
 * of Integer type and then add three elements
 * using the add() method. Since ArrayList is a
 * dynamic data structure, it automatically manages
 * memory and size. Finally, I print the complete
 * ArrayList, which displays all inserted elements
 * in insertion order."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY:
 *
 * add() -> O(1) (Amortized)
 *
 * Three insertions:
 * O(1) + O(1) + O(1)
 *
 * Overall:
 * O(1)
 *
 * SPACE COMPLEXITY:
 *
 * O(n)
 *
 * Here:
 * n = 3 elements
 *
 * ArrayList stores three Integer objects.
 *
 * ==========================================
 * INTERVIEW QUICK ANSWER:
 * ==========================================
 * Q: What is an ArrayList?
 *
 * Answer:
 * ArrayList is a resizable array implementation
 * provided by the Java Collections Framework.
 * Unlike normal arrays, its size can grow and
 * shrink dynamically at runtime.
 *
 * ------------------------------------------
 *
 * Q: What is the difference between Array and ArrayList?
 *
 * Answer:
 * Array has a fixed size once created,
 * whereas ArrayList can dynamically increase
 * or decrease its size during execution.
 *
 * -----------------------------------------
 *
 * Q: Why do we use Integer instead of int?
 *
 * Answer:
 * ArrayList stores objects, not primitive data
 * types. Therefore, Integer (wrapper class) is
 * used instead of int.
 */

