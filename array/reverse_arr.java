import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Reverse the given array in-place using the Two Pointer
Technique.

The first element should become the last element,
the second element should become the second last element,
and so on.

The reversal must be performed without using any
additional array.

Example:

Input:
5
1 2 3 4 5

Output:
5 4 3 2 1

=========================================================
INPUT FORMAT
=========================================================
First line contains an integer n,
representing the size of the array.

Second line contains n space-separated integers.

Example:
5
1 2 3 4 5

=========================================================
OUTPUT FORMAT
=========================================================
Print the reversed array elements separated by a space.

Example:
5 4 3 2 1

=========================================================
DRY RUN EXAMPLE
=========================================================

Input:
arr = [1, 2, 3, 4, 5]

Initial State:

l = 0
r = 4

Array:
[1, 2, 3, 4, 5]

---------------------------------------------------------

Iteration 1:

Swap arr[0] and arr[4]

Array:
[5, 2, 3, 4, 1]

l = 1
r = 3

---------------------------------------------------------

Iteration 2:

Swap arr[1] and arr[3]

Array:
[5, 4, 3, 2, 1]

l = 2
r = 2

---------------------------------------------------------

Condition:

l < r becomes false

Loop stops.

Final Output:

[5, 4, 3, 2, 1]

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class reverse_arr {

    /*
    =====================================================
    FUNCTION TO REVERSE ARRAY
    =====================================================

    This function reverses the original array
    without using any extra array.

    Approach:
    - Use two pointers.
    - One pointer starts from the beginning.
    - Another pointer starts from the end.
    - Swap elements.
    - Move pointers towards each other.
    */
    public static void reverse(int[] arr) {

        // Store total number of elements
        // present inside the array.
        int n = arr.length;

        // Left pointer starts from
        // the first index.
        int l = 0;

        // Right pointer starts from
        // the last index.
        int r = n - 1;

        /*
        Continue swapping until both
        pointers meet or cross each other.
        */
        while (l < r) {

            /*
            Store left element temporarily.

            Example:

            arr = [1, 2, 3, 4, 5]

            temp = 1
            */
            int temp = arr[l];

            /*
            Place right element
            at left position.
            */
            arr[l] = arr[r];

            /*
            Place stored left element
            at right position.
            */
            arr[r] = temp;

            /*
            Move left pointer
            one step forward.
            */
            l++;

            /*
            Move right pointer
            one step backward.
            */
            r--;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        /*
        Read size of array.

        Example Input:
        5

        After execution:
        n = 5
        */
        int n = sc.nextInt();

        /*
        Create array of size n.
        */
        int[] arr = new int[n];

        /*
        Read n elements from input.

        Example Input:
        1 2 3 4 5

        Array becomes:
        [1, 2, 3, 4, 5]
        */
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        /*
        Call reverse function
        to reverse the array.
        */
        reverse(arr);

        /*
        Print reversed array.

        Example Output:
        5 4 3 2 1
        */
        for (int a : arr) {
            System.out.print(a + " ");
        }

        sc.close();
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Two Pointer Technique
   This is one of the most frequently asked array
   interview patterns where two pointers move
   towards each other.

2. In-Place Array Reversal
   The original array is modified directly without
   creating any extra array.

3. Swapping Mechanism
   Array reversal is achieved through repeated
   swapping of symmetric elements.

4. Array Indexing Concept
   First element swaps with last element,
   second with second-last, and so on.

5. Space Optimization
   Only one temporary variable is used,
   resulting in O(1) extra space.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I used the Two Pointer Technique to reverse the
array in-place.

One pointer starts from the beginning of the array,
while the other starts from the end.

In every iteration, I swap both elements and move
the pointers towards the center.

The process continues until both pointers meet.

This approach avoids using an extra array and
achieves optimal O(n) time complexity and O(1)
space complexity."

=========================================================
TIME COMPLEXITY
=========================================================

O(n)

Reason:

Only n/2 swaps are performed.

Ignoring constants:

O(n)

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only one temporary variable is used
for swapping.

No extra array or collection is created.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Which DSA pattern is used in this solution?

Answer:
The Two Pointer Technique is used where one
pointer starts from the beginning and another
from the end of the array.

---------------------------------------------------------

Q2. Why is this called an in-place algorithm?

Answer:
Because the original array is modified directly
without using any additional array, resulting
in O(1) extra space.

---------------------------------------------------------

Q3. Why does the loop run only until l < r?

Answer:
Once both pointers meet or cross each other,
all required swaps are completed and the array
is already reversed.

---------------------------------------------------------

Q4. Can array reversal be done using another array?

Answer:
Yes, but that would require O(n) extra space.
The current approach is preferred because it
achieves O(1) extra space.

=========================================================
END OF FILE
=========================================================
*/