
import java.util.Arrays;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Move all zeros in the array to the end while
maintaining the relative order of non-zero elements.

This is a classic array manipulation problem that is
very common in interviews, DSA rounds, and online judges.

Example:

Input:
[1, 2, 0, 4, 3, 0, 5, 0]

Output:
[1, 2, 4, 3, 5, 0, 0, 0]

=========================================================
INPUT FORMAT
=========================================================
The program uses predefined test arrays inside main()
for demonstration purposes.

If used in an online judge, the method receives:

int[] arr

as input.

=========================================================
OUTPUT FORMAT
=========================================================
The array should be modified in-place so that all zero
elements appear at the end, while the order of non-zero
elements remains unchanged.

=========================================================
DRY RUN EXAMPLE 1
=========================================================
Input:
arr = [1, 2, 0, 4, 3, 0, 5, 0]

Initial:
insert = 0

i = 0
arr[0] = 1
Non-zero found
Swap arr[0] with arr[0]
insert = 1

i = 1
arr[1] = 2
Non-zero found
Swap arr[1] with arr[1]
insert = 2

i = 2
arr[2] = 0
Skip

i = 3
arr[3] = 4
Non-zero found
Swap arr[3] with arr[2]
Array becomes:
[1, 2, 4, 0, 3, 0, 5, 0]
insert = 3

i = 4
arr[4] = 3
Non-zero found
Swap arr[4] with arr[3]
Array becomes:
[1, 2, 4, 3, 0, 0, 5, 0]
insert = 4

i = 5
arr[5] = 0
Skip

i = 6
arr[6] = 5
Non-zero found
Swap arr[6] with arr[4]
Array becomes:
[1, 2, 4, 3, 5, 0, 0, 0]
insert = 5

i = 7
arr[7] = 0
Skip

Final Output:
[1, 2, 4, 3, 5, 0, 0, 0]

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

class Zero {

    /*
    =====================================================
    FUNCTION TO MOVE ZEROS TO END
    =====================================================

    This function modifies the input array in-place.

    Approach:
    - Maintain an insert pointer.
    - Traverse the array from left to right.
    - Whenever a non-zero element is found, place it at
      the next available front position.
    - This keeps non-zero elements in order and pushes
      all zeros to the end.
    */
    void pushZerosToEnd(int[] arr) {

        // Store the length of the array.
        // This helps us traverse every element exactly once.
        int n = arr.length;

        // insert points to the position where the next
        // non-zero element should be placed.
        int insert = 0;

        // Traverse the array from index 0 to n - 1.
        for (int i = 0; i < n; i++) {

            // Check whether the current element is non-zero.
            // If yes, it should be moved to the front section.
            if (arr[i] != 0) {

                // Swap the current non-zero element with the
                // element at the insert position.
                //
                // When i == insert, the swap is harmless
                // and keeps the logic simple.
                int temp = arr[i];
                arr[i] = arr[insert];
                arr[insert] = temp;

                // Move insert forward so the next non-zero
                // element is placed after this one.
                insert++;
            }
        }
    }

    public static void main(String[] args) {

        // Create an object of Zero to call the
        // non-static method pushZerosToEnd().
        Zero solution = new Zero();

        // Test Case 1
        int[] arr1 = {1, 2, 0, 4, 3, 0, 5, 0};
        System.out.println("Original Array 1: " + Arrays.toString(arr1));
        solution.pushZerosToEnd(arr1);
        System.out.println("Modified Array 1: " + Arrays.toString(arr1));
        System.out.println("-------------------------------------------------");

        // Test Case 2
        int[] arr2 = {10, 20, 30};
        System.out.println("Original Array 2: " + Arrays.toString(arr2));
        solution.pushZerosToEnd(arr2);
        System.out.println("Modified Array 2: " + Arrays.toString(arr2));
        System.out.println("-------------------------------------------------");

        // Test Case 3
        int[] arr3 = {0, 0};
        System.out.println("Original Array 3: " + Arrays.toString(arr3));
        solution.pushZerosToEnd(arr3);
        System.out.println("Modified Array 3: " + Arrays.toString(arr3));
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Two-Pointer Technique
   This problem uses two pointers:
   - i scans the array
   - insert tracks the next position for a non-zero value

2. In-Place Array Modification
   The array is modified directly without using any extra
   array or collection, so extra space is O(1).

3. Stable Rearrangement
   Non-zero elements keep their original relative order
   because they are processed from left to right.

4. Partitioning Concept
   This is similar to stable partitioning:
   - front side for non-zero elements
   - back side for zero elements

5. Optimal Complexity
   The solution runs in linear time O(n), which is the
   expected interview-friendly approach for this problem.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I used a two-pointer approach to move all zeros to the
end of the array.

One pointer traverses the array, and the other pointer
tracks the next position where a non-zero value should
be placed.

Whenever I find a non-zero element, I swap it into the
front section and advance the insert pointer.

This preserves the order of non-zero elements and moves
all zeros to the end in a single pass."

=========================================================
TIME COMPLEXITY
=========================================================

O(n)

Reason:
The array is traversed once, and each element is processed
in constant time.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:
Only a few extra variables are used. No extra array or
collection is created.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Which DSA pattern is used in this solution?

Answer:
The two-pointer technique is used. One pointer scans the
array, and the other tracks the insertion position for the
next non-zero element.

---------------------------------------------------------

Q2. Why is this considered an in-place algorithm?

Answer:
Because the original array is modified directly without
using any auxiliary array or collection. Only constant
extra space is used.

---------------------------------------------------------

Q3. Does this solution preserve the order of non-zero
elements?

Answer:
Yes. Since elements are processed from left to right and
placed into the next available front position, the relative
order of non-zero elements remains unchanged.

=========================================================
END OF FILE
=========================================================
*/