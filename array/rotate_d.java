import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Rotate the given array to the left by d positions.

The first d elements should be moved to the end
of the array while maintaining their relative order.

This is one of the most frequently asked array
rotation problems in coding interviews, TCS NQT,
Infosys, Wipro, Accenture, Cognizant, and DSA rounds.

Example:

Input:
7
1 2 3 4 5 6 7

d = 3

Output:
4 5 6 7 1 2 3

=========================================================
INPUT FORMAT
=========================================================
First line contains an integer n,
representing the size of the array.

Second line contains n space-separated integers.

Example:

7
1 2 3 4 5 6 7

=========================================================
OUTPUT FORMAT
=========================================================
Print the left rotated array.

Example:

4 5 6 7 1 2 3

=========================================================
DRY RUN EXAMPLE
=========================================================

Input:

arr = [1, 2, 3, 4, 5, 6, 7]
d = 3

---------------------------------------------------------

Step 1:
Store first d elements.

temp = [1, 2, 3]

---------------------------------------------------------

Step 2:
Shift remaining elements left.

Before Shift:

[1, 2, 3, 4, 5, 6, 7]

After Shift:

[4, 5, 6, 7, 5, 6, 7]

---------------------------------------------------------

Step 3:
Place temp elements at the end.

Array becomes:

[4, 5, 6, 7, 1, 2, 3]

---------------------------------------------------------

Final Output:

4 5 6 7 1 2 3

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class rotate_d {

    /*
    =====================================================
    FUNCTION TO ROTATE ARRAY BY D POSITIONS
    =====================================================

    Approach Used:

    Step 1:
    Store first d elements into a temporary array.

    Step 2:
    Shift remaining elements towards left.

    Step 3:
    Copy temporary elements to the last positions.

    This approach preserves the order of elements.
    */
    public static void rotate_by_d(int[] arr, int d) {

        // Store the total number of elements
        // present in the array.
        int n = arr.length;

        /*
        Handle cases where d is greater
        than array size.

        Example:

        n = 7
        d = 10

        Effective rotation:

        d = 10 % 7 = 3
        */
        d = d % n;

        /*
        STEP 1

        Create a temporary array
        to store first d elements.
        */
        int temp[] = new int[d];

        /*
        Copy first d elements.

        Example:

        arr = [1,2,3,4,5,6,7]

        temp = [1,2,3]
        */
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        /*
        STEP 2

        Shift remaining elements
        towards left by d positions.
        */
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        /*
        STEP 3

        Place stored elements
        at the end of the array.
        */
        int j = 0;

        for (int i = n - d; i < n; i++) {
            arr[i] = temp[j];
            j++;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        /*
        Read size of array.

        Example Input:

        7

        After execution:

        n = 7
        */
        int n = sc.nextInt();

        /*
        Create array of size n.
        */
        int[] arr = new int[n];

        /*
        Read array elements.

        Example Input:

        1 2 3 4 5 6 7
        */
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        /*
        Rotate array by 3 positions.

        Original Code Logic Preserved.
        */
        rotate_by_d(arr, 3);

        /*
        Print rotated array.
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

1. Array Rotation
   Array Rotation is one of the most frequently asked
   array manipulation topics in coding interviews.

2. Modulo Optimization
   d = d % n prevents unnecessary rotations when
   d is greater than array size.

3. Auxiliary Array Technique
   A temporary array is used to preserve the first
   d elements before shifting.

4. Left Rotation vs Right Rotation
   Left Rotation:
   [1,2,3,4,5] -> [3,4,5,1,2]

   Right Rotation:
   [1,2,3,4,5] -> [4,5,1,2,3]

5. Reversal Algorithm
   An optimized interview solution can rotate
   an array in O(1) extra space using the
   Reversal Algorithm.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I am performing Left Rotation of an array by d positions.

First, I store the first d elements in a temporary array.

Then I shift the remaining elements towards the left.

Finally, I place the stored elements at the end of the
array.

I also use d % n to handle cases where the rotation count
is greater than the array size.

This approach is easy to understand and preserves the
relative order of all elements."

=========================================================
TIME COMPLEXITY
=========================================================

O(n)

Reason:

1. Copy first d elements -> O(d)

2. Shift remaining elements -> O(n - d)

3. Copy temp elements back -> O(d)

Total:

O(d) + O(n - d) + O(d)

= O(n)

=========================================================
SPACE COMPLEXITY
=========================================================

O(d)

Reason:

A temporary array of size d is used
to store the first d elements.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Why do we use d = d % n?

Answer:
It reduces unnecessary rotations when d is greater
than the size of the array. Rotating n times brings
the array back to its original state.

---------------------------------------------------------

Q2. Can array rotation be done without extra space?

Answer:
Yes. The Reversal Algorithm performs array rotation
in O(n) time and O(1) extra space.

---------------------------------------------------------

Q3. Which DSA concepts are used in this problem?

Answer:
Array Manipulation, Index Shifting, Auxiliary Array
Technique, and Modulo Arithmetic are the primary
concepts used.

---------------------------------------------------------

Q4. What is the optimal solution asked in interviews?

Answer:
The Reversal Algorithm is generally considered the
optimal interview solution because it achieves
O(n) Time Complexity and O(1) Extra Space.

=========================================================
END OF FILE
=========================================================
*/