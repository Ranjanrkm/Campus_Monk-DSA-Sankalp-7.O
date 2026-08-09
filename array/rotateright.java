import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Rotate the given array to the Right by K positions
using the Reversal Algorithm.

Right Rotation means:

- Last K elements move to the beginning.
- Remaining elements shift towards the right.

Example:

Input:
n = 7
k = 3

Array:
1 2 3 4 5 6 7

Output:
5 6 7 1 2 3 4

This is one of the most frequently asked Array
Rotation problems in Coding Interviews, TCS NQT,
Infosys, Wipro, Accenture, Cognizant, and DSA rounds.

=========================================================
INPUT FORMAT
=========================================================

First line contains two integers:

n k

where:
n = size of array
k = number of right rotations

Second line contains n space-separated integers.

Example:

7 3
1 2 3 4 5 6 7

=========================================================
OUTPUT FORMAT
=========================================================

Print the array after performing
right rotation by k positions.

Example:

5 6 7 1 2 3 4

=========================================================
DRY RUN EXAMPLE
=========================================================

Input:

n = 7
k = 3

arr = [1, 2, 3, 4, 5, 6, 7]

---------------------------------------------------------

Step 1:

Reverse first (n-k) elements

Reverse(0, 3)

Before:

[1, 2, 3, 4, 5, 6, 7]

After:

[4, 3, 2, 1, 5, 6, 7]

---------------------------------------------------------

Step 2:

Reverse last k elements

Reverse(4, 6)

Before:

[4, 3, 2, 1, 5, 6, 7]

After:

[4, 3, 2, 1, 7, 6, 5]

---------------------------------------------------------

Step 3:

Reverse complete array

Reverse(0, 6)

Before:

[4, 3, 2, 1, 7, 6, 5]

After:

[5, 6, 7, 1, 2, 3, 4]

---------------------------------------------------------

Final Output:

5 6 7 1 2 3 4

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class rotateright {

    /*
    =====================================================
    FUNCTION TO REVERSE PART OF AN ARRAY
    =====================================================

    This function reverses all elements
    between index l and index r.

    It uses the Two Pointer Technique.
    */
    public static void reverse(int[] arr, int l, int r) {

        /*
        Continue swapping until both
        pointers meet or cross.
        */
        while (l < r) {

            /*
            Store left element temporarily.
            */
            int temp = arr[l];

            /*
            Move right element to left position.
            */
            arr[l] = arr[r];

            /*
            Move stored element to right position.
            */
            arr[r] = temp;

            /*
            Move pointers towards center.
            */
            l++;
            r--;
        }
    }

    /*
    =====================================================
    FUNCTION TO PERFORM RIGHT ROTATION
    =====================================================

    Reversal Algorithm:

    Step 1:
    Reverse first (n-k) elements

    Step 2:
    Reverse last k elements

    Step 3:
    Reverse complete array

    Result:
    Array gets rotated right by k positions.
    */
    public static void rightRotate(int[] arr, int n, int k) {

        /*
        Handle cases where k is
        greater than array size.

        Example:

        n = 7
        k = 10

        Effective rotation:

        k = 10 % 7 = 3
        */
        k = k % n;

        /*
        Reverse first n-k elements.
        */
        reverse(arr, 0, n - k - 1);

        /*
        Reverse last k elements.
        */
        reverse(arr, n - k, n - 1);

        /*
        Reverse complete array.
        */
        reverse(arr, 0, n - 1);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        /*
        Read array size and
        number of rotations.

        Example Input:

        7 3

        After execution:

        n = 7
        k = 3
        */
        int n = sc.nextInt();
        int k = sc.nextInt();

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
        Perform right rotation.
        */
        rightRotate(arr, n, k);

        /*
        Print rotated array.
        */
        for (int value : arr) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Reversal Algorithm
   This is the most frequently asked optimized
   approach for Array Rotation in interviews.

2. Two Pointer Technique
   Array reversal is performed using two pointers
   moving towards each other.

3. Modulo Arithmetic
   k = k % n prevents unnecessary rotations when
   rotation count exceeds array size.

4. In-Place Array Manipulation
   The array is modified directly without using
   any extra array, giving O(1) extra space.

5. Left Rotation vs Right Rotation
   Left Rotation:
   Elements move towards lower indexes.

   Right Rotation:
   Elements move towards higher indexes.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I used the Reversal Algorithm to perform Right
Rotation of the array.

First, I reverse the first n-k elements.

Then I reverse the last k elements.

Finally, I reverse the complete array.

These three reversals reposition the last k
elements at the beginning while maintaining
the correct order of all elements.

This approach is optimal because it runs in
O(n) time and O(1) extra space."

=========================================================
TIME COMPLEXITY
=========================================================

O(n)

Reason:

Three reverse operations are performed.

Total elements processed remain proportional
to n.

Hence overall complexity is O(n).

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only one temporary variable is used
during swapping.

No extra array is created.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Why is the Reversal Algorithm preferred for
array rotation?

Answer:
Because it performs rotation in O(n) time and
O(1) extra space, making it the most optimized
interview solution.

---------------------------------------------------------

Q2. Which design pattern is used inside reverse()?

Answer:
The Two Pointer Technique is used where one
pointer starts from the left and another from
the right.

---------------------------------------------------------

Q3. Why do we write k = k % n?

Answer:
Rotating an array n times returns the original
array. Therefore only the remainder rotations
need to be performed.

---------------------------------------------------------

Q4. What is the difference between the Auxiliary
Array Approach and Reversal Algorithm?

Answer:
Auxiliary Array Approach:
O(n) Time, O(k) Space

Reversal Algorithm:
O(n) Time, O(1) Space

Hence the Reversal Algorithm is preferred.

=========================================================
END OF FILE
=========================================================
*/