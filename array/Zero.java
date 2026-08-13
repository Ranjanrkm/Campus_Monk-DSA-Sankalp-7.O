import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Move all zeros in the given integer array to the end
while maintaining the relative order of all non-zero
elements.

This solution modifies the array in-place using a
two-pointer technique.

Example:

Input:
8
1 2 0 4 3 0 5 0

Output:
1 2 4 3 5 0 0 0

=========================================================
INPUT FORMAT
=========================================================
The first line contains an integer n representing
the size of the array.

The next n integers represent the array elements.

Example:
8
1 2 0 4 3 0 5 0

This follows the size-first array input style described
in the uploaded TCS NQT Java input/output material:
read the size first and then read exactly n elements.
=========================================================

=========================================================
OUTPUT FORMAT
=========================================================
Print the modified array after moving all zeros
to the end.

Print elements separated by a single space.

Example:
1 2 4 3 5 0 0 0

No extra prompt or explanatory text is printed because
online judges require exact output formatting.
=========================================================

=========================================================
DRY RUN EXAMPLE 1
=========================================================
Input:
8
1 2 0 4 3 0 5 0

Initial:
arr = [1, 2, 0, 4, 3, 0, 5, 0]
insert = 0

i = 0
arr[0] = 1
Non-zero found.

Swap arr[0] and arr[0].

Array:
[1, 2, 0, 4, 3, 0, 5, 0]

insert = 1

i = 1
arr[1] = 2
Non-zero found.

Swap arr[1] and arr[1].

Array:
[1, 2, 0, 4, 3, 0, 5, 0]

insert = 2

i = 2
arr[2] = 0
Skip.

i = 3
arr[3] = 4
Non-zero found.

Swap arr[3] and arr[2].

Array:
[1, 2, 4, 0, 3, 0, 5, 0]

insert = 3

i = 4
arr[4] = 3
Non-zero found.

Swap arr[4] and arr[3].

Array:
[1, 2, 4, 3, 0, 0, 5, 0]

insert = 4

i = 5
arr[5] = 0
Skip.

i = 6
arr[6] = 5
Non-zero found.

Swap arr[6] and arr[4].

Array:
[1, 2, 4, 3, 5, 0, 0, 0]

insert = 5

i = 7
arr[7] = 0
Skip.

Final Output:
1 2 4 3 5 0 0 0

=========================================================
DRY RUN EXAMPLE 2
=========================================================
Input:
6
0 1 0 3 12 0

Initial:
arr = [0, 1, 0, 3, 12, 0]
insert = 0

i = 0
arr[0] = 0
Skip.

i = 1
arr[1] = 1
Non-zero found.

Swap arr[1] and arr[0].

Array:
[1, 0, 0, 3, 12, 0]

insert = 1

i = 2
arr[2] = 0
Skip.

i = 3
arr[3] = 3
Non-zero found.

Swap arr[3] and arr[1].

Array:
[1, 3, 0, 0, 12, 0]

insert = 2

i = 4
arr[4] = 12
Non-zero found.

Swap arr[4] and arr[2].

Array:
[1, 3, 12, 0, 0, 0]

insert = 3

i = 5
arr[5] = 0
Skip.

Final Output:
1 3 12 0 0 0

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class Zero {

    /*
    =====================================================
    METHOD: pushZerosToEnd
    =====================================================

    Purpose:
    Move every zero to the end of the array.

    Main idea:
    - 'i' scans every element from left to right.
    - 'insert' stores the next position where a
      non-zero element should be placed.
    - Whenever a non-zero element is found, it is
      moved to the 'insert' position.
    - After placing the non-zero element, 'insert'
      moves one position forward.

    This preserves the relative order of non-zero
    elements and modifies the original array directly.
    */
    public static void pushZerosToEnd(int[] arr) {

        /*
        Store the length of the array.

        Example:
        arr = [1, 0, 2]

        arr.length = 3
        */
        int n = arr.length;

        /*
        'insert' points to the position where the
        next non-zero element should be placed.

        Initially:
        insert = 0

        This means the first non-zero element should
        be placed at index 0.
        */
        int insert = 0;

        /*
        Traverse the complete array from index 0
        up to index n - 1.

        The PDF's size-first input pattern reads exactly n
        elements, and the array processing then traverses
        those elements normally.
        */
        for (int i = 0; i < n; i++) {

            /*
            Check whether the current element is non-zero.

            If arr[i] is zero:
            - Do nothing.
            - Continue scanning.

            If arr[i] is non-zero:
            - Move it to the next available front position.
            */
            if (arr[i] != 0) {

                /*
                Swap the current non-zero element
                with the element at the 'insert' position.

                Example:
                arr = [1, 0, 2]
                i = 2
                insert = 1

                Swap arr[2] and arr[1]:

                [1, 2, 0]

                This moves the non-zero value forward
                and pushes zero toward the end.
                */
                int temp = arr[i];
                arr[i] = arr[insert];
                arr[insert] = temp;

                /*
                Move 'insert' forward.

                The current non-zero element has now
                been placed correctly, so the next
                non-zero element should be placed
                at the next index.
                */
                insert++;
            }
        }
    }

    public static void main(String[] args) {

        /*
        Create Scanner object to read input from
        standard input.

        As required for the size-first TCS NQT style,
        the program reads the array size first and
        then reads exactly n array elements.
        */
        Scanner sc = new Scanner(System.in);

        /*
        Read the size of the array.

        Example Input:
        8

        After execution:
        n = 8
        */
        int n = sc.nextInt();

        /*
        Create an integer array of size n.

        Example:
        n = 8

        Array indexes:
        0 1 2 3 4 5 6 7
        */
        int[] arr = new int[n];

        /*
        Traverse from index 0 to index n - 1
        and read exactly n integer values.
        */
        for (int i = 0; i < n; i++) {

            /*
            Read the current array element.

            Example:
            Input:
            1 2 0 4 3 0 5 0

            Each value is stored in the
            corresponding array index.
            */
            arr[i] = sc.nextInt();
        }

        /*
        Call the method to move all zeros
        to the end of the array.

        The method modifies the same array
        instead of creating another array.
        */
        pushZerosToEnd(arr);

        /*
        Print the final modified array.

        Print a space only between elements so that
        there is no unnecessary trailing space.

        This follows the uploaded PDF guidance to
        carefully control spaces and avoid formatting
        errors in online judges.
        */
        for (int i = 0; i < arr.length; i++) {

            /*
            Print a separator only when this is not
            the first element.

            Example:
            1 2 4 3 5 0 0 0

            There is no extra space before the first
            element or after the last element.
            */
            if (i > 0) {
                System.out.print(" ");
            }

            /*
            Print the current array element.
            */
            System.out.print(arr[i]);
        }

        /*
        Move to the next line after printing
        the complete output.
        */
        System.out.println();

        /*
        Close Scanner to release the input resource.
        */
        sc.close();
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. TWO-POINTER TECHNIQUE
   - 'i' is the scanning pointer.
   - 'insert' tracks the next position for a
     non-zero element.
   - This is the key idea behind the solution.

2. STABLE REARRANGEMENT
   Non-zero elements remain in their original relative
   order because they are processed from left to right.

3. IN-PLACE ALGORITHM
   The original array is modified directly.
   No second array or collection is created.

4. EDGE CASES
   - No zeroes:
     [1, 2, 3] -> [1, 2, 3]
   - All zeroes:
     [0, 0, 0] -> [0, 0, 0]
   - Zero at the beginning:
     [0, 1, 2] -> [1, 2, 0]
   - Zero at the end:
     [1, 2, 0] -> [1, 2, 0]

5. TCS NQT OUTPUT RULE
   Do not print prompts such as:
   "Enter array size:"
   or
   "Modified Array:"

   Only print the required answer.
   The uploaded material emphasizes exact control of
   spaces and newlines because formatting can cause
   otherwise-correct solutions to fail hidden tests.
=========================================================

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Using an extra array to store non-zero elements.
   This increases auxiliary space unnecessarily.

2. Forgetting to increment 'insert' after placing
   a non-zero element.

3. Using:
       i <= n
   instead of:
       i < n

   The incorrect condition can cause an
   ArrayIndexOutOfBoundsException.

4. Printing extra text such as:
       "Output:"
       "Modified Array:"
   which can cause wrong answers in online judges.

5. Changing the relative order of non-zero elements.
   The required result must preserve their original order.

6. Adding unnecessary trailing spaces in output.
   Output formatting should be controlled carefully.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I used a two-pointer approach to move all zeros
to the end of the array.

The first pointer, i, traverses the complete array.
The second pointer, insert, keeps track of the next
position where a non-zero element should be placed.

Whenever I find a non-zero element, I swap it with
the element at the insert position and then increment
insert.

Because I process the array from left to right, the
relative order of all non-zero elements remains the
same.

The array is modified in-place, so I do not need an
extra array.

The overall time complexity is O(n) and the auxiliary
space complexity is O(1)."

=========================================================
TIME COMPLEXITY
=========================================================

O(n)

Reason:

The loop traverses the array exactly once.

For every element:
- We check whether it is zero.
- If it is non-zero, we perform constant-time
  swap operations.

Therefore, each element requires O(1) work and
there are n elements.

So:

O(n) × O(1) = O(n)

=========================================================
SPACE COMPLEXITY
=========================================================

O(1) Auxiliary Space

Reason:

Only a constant number of variables are used:

- n
- insert
- i
- temp

No additional array, ArrayList, HashMap, or other
data structure is created.

The input array itself occupies O(n) space, but that
is input storage and is not counted as auxiliary space.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Which DSA technique is used here?

Answer:
I used the two-pointer technique. The 'i' pointer
scans the array, while the 'insert' pointer tracks
where the next non-zero element should be placed.

---------------------------------------------------------

Q2. Why is the time complexity O(n)?

Answer:
Because the array is traversed only once, and each
element requires constant-time processing.

---------------------------------------------------------

Q3. Why is the space complexity O(1)?

Answer:
Because the solution modifies the original array
in-place and uses only a constant number of variables.
No extra array or collection is created.

---------------------------------------------------------

Q4. Does this solution preserve the relative order
of non-zero elements?

Answer:
Yes. Non-zero elements are processed from left to right
and placed sequentially at the next available position,
so their relative order remains unchanged.

=========================================================
END OF FILE
=========================================================
*/