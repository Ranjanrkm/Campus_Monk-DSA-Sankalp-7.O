import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Given an integer array, move all zero elements to the
end of the array while maintaining the relative order
of all non-zero elements.

This approach uses an auxiliary ArrayList to first
store all non-zero elements and then reconstruct the
array.

Example:

Input:
8
1 2 0 4 3 0 5 0

Output:
1 2 4 3 5 0 0 0

=========================================================
INPUT FORMAT
=========================================================
First Line:
n -> Size of the array

Second Line:
n integer elements

Example:
8
1 2 0 4 3 0 5 0

=========================================================
OUTPUT FORMAT
=========================================================
Print the modified array after moving all zeroes
to the end.

Example:
1 2 4 3 5 0 0 0

=========================================================
DRY RUN EXAMPLE 1
=========================================================
Input:
8
1 2 0 4 3 0 5 0

Initial Array:
[1, 2, 0, 4, 3, 0, 5, 0]

Step 1:
Store all non-zero elements in temp.

temp:
[1, 2, 4, 3, 5]

Step 2:
Copy temp back to array.

Array:
[1, 2, 4, 3, 5, 0, 5, 0]

Step 3:
Fill remaining positions with zero.

Final Array:
[1, 2, 4, 3, 5, 0, 0, 0]

Output:
1 2 4 3 5 0 0 0

=========================================================
DRY RUN EXAMPLE 2
=========================================================
Input:
6
0 0 1 2 3 0

Initial Array:
[0, 0, 1, 2, 3, 0]

Step 1:
temp:
[1, 2, 3]

Step 2:
Copy temp into array.

Array:
[1, 2, 3, 2, 3, 0]

Step 3:
Fill remaining positions with zero.

Final Array:
[1, 2, 3, 0, 0, 0]

Output:
1 2 3 0 0 0

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class zeroend {

    /*
    =====================================================
    METHOD NAME : move_zero_end
    =====================================================

    Purpose:
    Move all zero elements to the end of the array.

    Approach:
    1. Store all non-zero elements in an ArrayList.
    2. Copy the non-zero elements back to the array.
    3. Fill remaining positions with zero.

    This preserves the relative order of non-zero
    elements.
    =====================================================
    */
    public static void move_zero_end(int[] arr) {

        /*
        Create an ArrayList to store only
        non-zero elements.

        Example:

        arr = [1, 0, 2, 0, 3]

        temp = [1, 2, 3]
        */
        ArrayList<Integer> temp = new ArrayList<Integer>();

        /*
        Traverse the complete array from
        index 0 to index arr.length - 1.

        Purpose:
        Collect all non-zero elements.
        */
        for (int i = 0; i < arr.length; i++) {

            /*
            Check whether the current
            element is non-zero.

            Only non-zero elements
            are added into temp.
            */
            if (arr[i] != 0) {

                /*
                Store the non-zero element.

                Example:

                arr[i] = 5

                temp becomes:
                [1, 2, 5]
                */
                temp.add(arr[i]);
            }
        }

        /*
        Copy all elements stored in temp
        back into the original array.

        Example:

        temp = [1, 2, 3]

        Array becomes:
        [1, 2, 3, ?, ?, ?]
        */
        for (int i = 0; i < temp.size(); i++) {

            /*
            Place the current temp value
            into the corresponding array index.
            */
            arr[i] = temp.get(i);
        }

        /*
        Fill the remaining array positions
        with zero.

        Example:

        Current:
        [1, 2, 3, ?, ?, ?]

        Final:
        [1, 2, 3, 0, 0, 0]
        */
        for (int i = temp.size(); i < arr.length; i++) {

            /*
            Assign zero to the remaining
            positions.
            */
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {

        /*
        Create Scanner object to read
        user input.
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
        Create an integer array of size n.
        */
        int[] arr = new int[n];

        /*
        Traverse the array from
        index 0 to index n - 1.

        Purpose:
        Read all array elements.
        */
        for (int i = 0; i < n; i++) {

            /*
            Read the current element.

            Example:
            10 0 20 0 30
            */
            arr[i] = sc.nextInt();
        }

        /*
        Call the function that moves
        all zeroes to the end.
        */
        move_zero_end(arr);

        /*
        Print the modified array.

        Elements are separated by
        a single space.
        */
        for (int i = 0; i < arr.length; i++) {

            /*
            Print a space before every
            element except the first one.
            */
            if (i > 0) {
                System.out.print(" ");
            }

            /*
            Print current array element.
            */
            System.out.print(arr[i]);
        }

        /*
        Move cursor to the next line.
        */
        System.out.println();

        /*
        Close Scanner resource.
        */
        sc.close();
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. This solution uses an ArrayList to store all
   non-zero elements before rebuilding the array.

2. Relative order of non-zero elements is preserved,
   making the approach stable.

3. This is not an in-place solution because an
   additional ArrayList is used.

4. Edge Cases:
   - All elements are zero.
   - No element is zero.
   - Single element array.
   - Empty array (n = 0).

5. Interview Trick:
   Most interviewers first accept this approach,
   then ask for an O(1) space two-pointer solution.

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Forgetting to fill the remaining positions
   with zero after copying temp.

2. Using temp.size() incorrectly inside loops.

3. Losing the order of non-zero elements.

4. Printing extra messages such as:
   "Modified Array:"
   which can fail online judges.

5. Forgetting that ArrayList introduces
   extra space complexity.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I first traverse the array and store all non-zero
elements inside an ArrayList.

After collecting the non-zero values, I copy them
back into the original array from the beginning.

Finally, I fill all remaining positions with zero.

This approach is simple, preserves the relative
order of non-zero elements, and is easy to implement.

However, it requires extra space proportional to
the number of non-zero elements."

=========================================================
TIME COMPLEXITY
=========================================================

O(N)

Reason:

1st Traversal:
Collect non-zero elements -> O(N)

2nd Traversal:
Copy temp into array -> O(N)

3rd Traversal:
Fill remaining positions with zero -> O(N)

Overall:

O(N) + O(N) + O(N) = O(N)

=========================================================
SPACE COMPLEXITY
=========================================================

O(N)

Reason:

An additional ArrayList is used to store
non-zero elements.

In the worst case:

arr = [1, 2, 3, 4, 5]

temp stores all N elements.

Therefore:

Extra Space = O(N)

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Why is this solution not considered in-place?

Answer:
Because it uses an additional ArrayList to store
non-zero elements, requiring extra memory.

---------------------------------------------------------

Q2. Does this solution preserve the relative order
of non-zero elements?

Answer:
Yes. Elements are copied into temp and then written
back in the same order.

---------------------------------------------------------

Q3. What is the space complexity?

Answer:
O(N), because the ArrayList may store all elements
in the worst case.

---------------------------------------------------------

Q4. What optimization do interviewers usually expect?

Answer:
A two-pointer in-place approach that achieves
O(N) time and O(1) extra space.

=========================================================
END OF FILE
=========================================================
*/