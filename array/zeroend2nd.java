import java.util.*;

/*
========================================================
PROBLEM STATEMENT
========================================================
Write a Java program to move all zeroes present in an
array to the end while maintaining the relative order
of non-zero elements.

The operation must be performed in-place without using
any extra array.

Example:

Input:
5
1 0 2 0 3

Output:
1 2 3 0 0

========================================================
INPUT FORMAT
========================================================
First Line:
n -> Size of the array

Second Line:
n integer elements

Example:
5
1 0 2 0 3

========================================================
OUTPUT FORMAT
========================================================
Print the modified array after moving all zeroes
to the end.

Example:
1 2 3 0 0

========================================================
DRY RUN EXAMPLE 1
========================================================
Input:
5
1 0 2 0 3

Initial Array:
[1, 0, 2, 0, 3]

First Zero Found:
j = 1

i = 2
arr[i] = 2
Swap arr[2] and arr[1]

Array:
[1, 2, 0, 0, 3]

j = 2

i = 4
arr[i] = 3
Swap arr[4] and arr[2]

Array:
[1, 2, 3, 0, 0]

Output:
1 2 3 0 0

========================================================
DRY RUN EXAMPLE 2
========================================================
Input:
6
0 1 0 3 12 0

Initial Array:
[0, 1, 0, 3, 12, 0]

First Zero Found:
j = 0

Swap 1 with 0

Array:
[1, 0, 0, 3, 12, 0]

Swap 3 with 0

Array:
[1, 3, 0, 0, 12, 0]

Swap 12 with 0

Array:
[1, 3, 12, 0, 0, 0]

Output:
1 3 12 0 0 0

========================================================
FULLY COMMENTED JAVA CODE
========================================================
*/

public class zeroend2nd {

    /*
    ----------------------------------------------------
    METHOD NAME : end_zero
    ----------------------------------------------------
    Purpose:
    Move all zeroes to the end of the array while
    maintaining the relative order of non-zero elements.

    Example:

    Before:
    [1, 0, 2, 0, 3]

    After:
    [1, 2, 3, 0, 0]
    ----------------------------------------------------
    */
    public static void end_zero(int[] arr) {

        /*
        Variable j stores the index of the
        first zero found in the array.

        Initially:
        j = -1

        -1 means no zero has been found yet.
        */
        int j = -1;

        /*
        Traverse the array from left to right
        to find the first occurrence of zero.
        */
        for (int i = 0; i < arr.length; i++) {

            /*
            Check whether current element
            is equal to zero.
            */
            if (arr[i] == 0) {

                /*
                Store the position of
                the first zero.
                */
                j = i;

                /*
                Stop searching because
                we only need the first zero.
                */
                break;
            }
        }

        /*
        If j remains -1,
        it means there are no zeroes
        in the array.

        No further processing is required.
        */
        if (j != -1) {

            /*
            Start traversal from the position
            immediately after the first zero.

            Goal:
            Find non-zero elements and bring
            them forward.
            */
            for (int i = j + 1; i < arr.length; i++) {

                /*
                Check whether current element
                is non-zero.
                */
                if (arr[i] != 0) {

                    /*
                    Swap the non-zero element
                    with the element at index j.

                    This pushes zero towards
                    the end of the array.
                    */
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    /*
                    Move j to the next position.

                    j always points to the
                    next zero position that
                    should be replaced.
                    */
                    j++;
                }
            }
        }
    }

    public static void main(String args[]) {

        /*
        Scanner object is used to read
        input from the console.
        */
        Scanner sc = new Scanner(System.in);

        /*
        Read the size of the array.

        Example Input:
        5

        After execution:
        n = 5
        */
        int n = sc.nextInt();

        /*
        Create an array of size n.
        */
        int[] arr = new int[n];

        /*
        Read exactly n elements into
        the array.

        TCS NQT Style:
        Size is given first, then
        read n values. 
        */
        for (int i = 0; i < n; i++) {

            /*
            Read current array element.
            */
            arr[i] = sc.nextInt();
        }

        /*
        Move all zeroes to the end.
        */
        end_zero(arr);

        /*
        Print the modified array.

        Extra spaces at the end are avoided
        using conditional formatting.
        */
        for (int i = 0; i < arr.length; i++) {

            if (i > 0) {
                System.out.print(" ");
            }

            System.out.print(arr[i]);
        }

        sc.close();
    }
}

/*
========================================================
IMPORTANT NOTES FOR REVISION
========================================================

1. This is a Two-Pointer Technique problem.

2. j always points to the first available
   zero position.

3. Relative order of non-zero elements
   remains unchanged (Stable Movement).

4. In-place solution is achieved without
   using any extra array.

5. If no zero exists, j remains -1 and
   the second traversal is skipped.

========================================================
COMMON BEGINNER MISTAKES
========================================================

1. Forgetting to initialize j with -1.

2. Not checking if j != -1 before
   starting the second loop.

3. Using an extra array unnecessarily.

4. Forgetting to increment j after
   performing a swap.

========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
========================================================

"I first locate the index of the first zero
in the array and store it in variable j.

Then I traverse the remaining part of the
array. Whenever I find a non-zero element,
I swap it with the element at index j.

After every successful swap, j is moved
forward to the next zero position.

This ensures all non-zero elements come
towards the front while all zeroes are
shifted to the end.

The solution is in-place, stable, and
requires no extra array."

========================================================
TIME COMPLEXITY
========================================================

O(N)

Reason:
The array is traversed at most twice.

First traversal:
Finding first zero.

Second traversal:
Moving non-zero elements.

O(N) + O(N) = O(N)

========================================================
SPACE COMPLEXITY
========================================================

O(1)

Reason:
Only a few extra variables are used.

No additional array or collection
is created.

========================================================
INTERVIEW QUICK ANSWER
========================================================

Q1: Why is this called a Two-Pointer approach?

Answer:
Because variable i scans the array while
j tracks the next zero position where a
non-zero element should be placed.

--------------------------------------------------------

Q2: Does this solution preserve the order of
non-zero elements?

Answer:
Yes. Non-zero elements are processed from
left to right and their relative order
remains unchanged.

--------------------------------------------------------

Q3: What happens if the array contains
no zeroes?

Answer:
j remains -1 and the second traversal
never executes. The array remains unchanged.

--------------------------------------------------------

Q4: Can this problem be solved in a
single traversal?

Answer:
Yes. Another optimized two-pointer solution
can move non-zero elements forward in one
pass and then fill remaining positions
with zeroes.
========================================================
END OF FILE
========================================================
*/