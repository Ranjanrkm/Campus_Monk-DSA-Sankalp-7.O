import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Perform Left Rotation of an Array by One Position.

In Left Rotation by One Position:

- The first element moves to the last position.
- Every other element shifts one position left.

Example:

Input:
1 2 3 4 5

Output:
2 3 4 5 1

This is one of the fundamental Array Manipulation
problems and is frequently used as a building block
for Array Rotation by D positions.

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

Print the array after performing
left rotation by one position.

Example:

2 3 4 5 1

=========================================================
DRY RUN EXAMPLE
=========================================================

Input:

n = 5

arr = [1, 2, 3, 4, 5]

---------------------------------------------------------

Step 1:

Store first element.

temp = 1

---------------------------------------------------------

Step 2:

Shift all remaining elements
one position towards left.

Before:

[1, 2, 3, 4, 5]

After:

[2, 3, 4, 5, 5]

---------------------------------------------------------

Step 3:

Place stored element
at the last index.

arr[4] = 1

Final Array:

[2, 3, 4, 5, 1]

---------------------------------------------------------

Output:

2 3 4 5 1

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class rotate {

    /*
    =====================================================
    FUNCTION TO PERFORM LEFT ROTATION BY ONE POSITION
    =====================================================

    Logic:

    Step 1:
    Store first element.

    Step 2:
    Shift all elements one position left.

    Step 3:
    Place stored element at last index.

    Example:

    Before:
    [1, 2, 3, 4, 5]

    After:
    [2, 3, 4, 5, 1]
    */
    public static void left_rotate_one(int[] arr) {

        /*
        Store total number of elements
        present in the array.
        */
        int n = arr.length;

        /*
        Edge Case:

        If array contains 0 or 1 element,
        rotation is not required.
        */
        if (n <= 1) {
            return;
        }

        /*
        Store first element temporarily.

        Example:

        arr = [1, 2, 3, 4, 5]

        temp = 1
        */
        int temp = arr[0];

        /*
        Shift every element
        one position towards left.

        Example:

        Before:

        [1, 2, 3, 4, 5]

        After:

        [2, 3, 4, 5, 5]
        */
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        /*
        Place stored first element
        at the last position.

        Final Array:

        [2, 3, 4, 5, 1]
        */
        arr[n - 1] = temp;
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
        Read array elements.

        Example Input:

        1 2 3 4 5
        */
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        /*
        Perform left rotation
        by one position.
        */
        left_rotate_one(arr);

        /*
        Print rotated array.

        Example Output:

        2 3 4 5 1
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

1. Array Left Rotation
   Left Rotation moves elements towards lower
   indexes and shifts the first element to the end.

2. Array Shifting Technique
   This problem is based on element shifting,
   a common operation in Array Manipulation.

3. In-Place Modification
   The original array is modified directly
   without creating another array.

4. Building Block Concept
   Left Rotation by D positions can be achieved
   by repeatedly applying Left Rotation by One,
   although it is not the most efficient method.

5. Index-Based Array Operations
   Understanding index shifting is essential
   for solving Rotation, Insertion, and Deletion
   problems in arrays.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I first store the first element of the array
inside a temporary variable.

Then I shift all remaining elements one position
towards the left.

After shifting is completed, I place the stored
first element at the last index.

This performs a Left Rotation by One Position.

The solution modifies the original array directly
and uses only one extra variable."

=========================================================
TIME COMPLEXITY
=========================================================

O(n)

Reason:

The array is traversed once to shift
all elements.

Number of operations is proportional
to the size of the array.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only one temporary variable is used.

No additional array or collection
is created.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Why is a temporary variable required in this solution?

Answer:
The first element would be overwritten during
the shifting process. Therefore it must be stored
temporarily before shifting starts.

---------------------------------------------------------

Q2. Is this solution in-place?

Answer:
Yes. The original array is modified directly and
only one extra variable is used, resulting in
O(1) extra space.

---------------------------------------------------------

Q3. Can Left Rotation by D positions be achieved
using this approach?

Answer:
Yes. Calling Left Rotation by One exactly D times
will rotate the array by D positions, but the
overall complexity becomes O(n × d).

---------------------------------------------------------

Q4. What is the optimized approach for rotating
an array by D positions?

Answer:
The Reversal Algorithm is the optimized solution.
It performs rotation in O(n) time and O(1)
extra space.

=========================================================
END OF FILE
=========================================================
*/