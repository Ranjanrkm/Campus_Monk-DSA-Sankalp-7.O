import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Rotate the given array to the left by d positions
using the Reversal Algorithm.

The Reversal Algorithm is one of the most optimized
and most frequently asked interview approaches for
array rotation because it achieves O(n) Time Complexity
with O(1) Extra Space.

Example:

Input:
n = 7
d = 2

Array:
1 2 3 4 5 6 7

Output:
3 4 5 6 7 1 2

=========================================================
INPUT FORMAT
=========================================================
First line contains two integers:

n d

where:
n = size of array
d = number of left rotations

Second line contains n space-separated integers.

Example:

7 2
1 2 3 4 5 6 7

=========================================================
OUTPUT FORMAT
=========================================================
Print the array after performing left rotation
by d positions.

Example:

3 4 5 6 7 1 2

=========================================================
DRY RUN EXAMPLE
=========================================================

Input:

n = 7
d = 2

arr = [1, 2, 3, 4, 5, 6, 7]

---------------------------------------------------------

Step 1:

Reverse first d elements

Reverse(0,1)

Before:
[1, 2, 3, 4, 5, 6, 7]

After:
[2, 1, 3, 4, 5, 6, 7]

---------------------------------------------------------

Step 2:

Reverse remaining elements

Reverse(2,6)

Before:
[2, 1, 3, 4, 5, 6, 7]

After:
[2, 1, 7, 6, 5, 4, 3]

---------------------------------------------------------

Step 3:

Reverse complete array

Reverse(0,6)

Before:
[2, 1, 7, 6, 5, 4, 3]

After:
[3, 4, 5, 6, 7, 1, 2]

---------------------------------------------------------

Final Output:

3 4 5 6 7 1 2

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class rotate_d2 {

    /*
    =====================================================
    FUNCTION TO REVERSE A PART OF ARRAY
    =====================================================

    This function reverses elements between
    index l and index r.

    Example:

    Array:
    [1, 2, 3, 4, 5]

    reverse(1,3)

    Result:
    [1, 4, 3, 2, 5]
    */
    public static void reverse(int[] arr, int l, int r) {

        /*
        Continue swapping until both pointers
        meet or cross each other.
        */
        while (l < r) {

            /*
            Store left element temporarily.
            */
            int temp = arr[l];

            /*
            Place right element at left position.
            */
            arr[l] = arr[r];

            /*
            Place stored element at right position.
            */
            arr[r] = temp;

            /*
            Move left pointer forward.
            */
            l++;

            /*
            Move right pointer backward.
            */
            r--;
        }
    }

    /*
    =====================================================
    FUNCTION TO ROTATE ARRAY BY D POSITIONS
    =====================================================

    Reversal Algorithm Steps:

    1. Reverse first d elements
    2. Reverse remaining elements
    3. Reverse complete array

    Result:
    Left rotation by d positions
    */
    public static void rotate_by_d(int[] arr, int n, int d) {

        /*
        Handle cases where d is greater than n.

        Example:

        n = 7
        d = 9

        Effective rotation:

        d = 9 % 7 = 2
        */
        d = d % n;

        /*
        Step 1:
        Reverse first d elements.
        */
        reverse(arr, 0, d - 1);

        /*
        Step 2:
        Reverse remaining elements.
        */
        reverse(arr, d, n - 1);

        /*
        Step 3:
        Reverse complete array.
        */
        reverse(arr, 0, n - 1);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        /*
        Read array size and rotation count.

        Example Input:

        7 2

        After execution:

        n = 7
        d = 2
        */
        int n = sc.nextInt();
        int d = sc.nextInt();

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
        Perform left rotation.
        */
        rotate_by_d(arr, n, d);

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

1. Reversal Algorithm
   This is the most important and most asked
   optimized approach for array rotation in
   coding interviews.

2. Two Pointer Technique
   Array reversal internally uses two pointers
   moving towards each other.

3. In-Place Rotation
   Rotation is performed without using any
   extra array, resulting in O(1) extra space.

4. Modulo Arithmetic
   d = d % n prevents unnecessary rotations
   when d is larger than the array size.

5. Array Rotation Optimization
   Auxiliary Array Approach:
   O(n) Time, O(d) Space

   Reversal Algorithm:
   O(n) Time, O(1) Space

   Interviewers generally prefer the
   Reversal Algorithm.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I used the Reversal Algorithm to perform left
rotation of the array.

First, I reverse the first d elements.

Then I reverse the remaining n-d elements.

Finally, I reverse the complete array.

These three reversals effectively shift the
first d elements to the end while maintaining
the correct order of all elements.

This approach achieves O(n) time complexity
and O(1) extra space, making it one of the
most optimized interview solutions."

=========================================================
TIME COMPLEXITY
=========================================================

O(n)

Reason:

First Reverse  -> O(d)

Second Reverse -> O(n - d)

Third Reverse  -> O(n)

Overall:

O(n)

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

No extra array is used.

Only a temporary variable is required
for swapping.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Why is the Reversal Algorithm preferred over the
Auxiliary Array Approach?

Answer:
Because it performs array rotation using O(1)
extra space while maintaining O(n) time complexity.

---------------------------------------------------------

Q2. Which DSA pattern is used inside the reverse()
function?

Answer:
The Two Pointer Technique is used where one pointer
starts from the left and another from the right.

---------------------------------------------------------

Q3. Why do we use d = d % n?

Answer:
Rotating an array n times produces the original
array again. Therefore only the remainder rotations
need to be performed.

---------------------------------------------------------

Q4. What is the most optimized solution for array
rotation asked in interviews?

Answer:
The Reversal Algorithm because it achieves
O(n) Time Complexity and O(1) Extra Space.

=========================================================
END OF FILE
=========================================================
*/