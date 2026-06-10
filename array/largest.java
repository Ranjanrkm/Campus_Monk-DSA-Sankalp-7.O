import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Find the Largest Element in an Array.

Given an array of integers, find and print
the largest element present in the array.

This solution uses the BEST approach for
interviews, TCS NQT, Online Judges, and
Competitive Programming.

=========================================================
INPUT FORMAT
=========================================================

First Line:
n

Second Line:
n space-separated integers

Example:

5
3 34 32 67 39

=========================================================
OUTPUT FORMAT
=========================================================

Print the largest element.

Example:

67

=========================================================
DRY RUN EXAMPLE
=========================================================

Input:

5
3 34 32 67 39

---------------------------------------------------------
INITIALIZATION
---------------------------------------------------------

largest = Integer.MIN_VALUE

---------------------------------------------------------
ITERATION 1
---------------------------------------------------------

Current Element = 3

largest = max(MIN_VALUE, 3)

largest = 3

---------------------------------------------------------
ITERATION 2
---------------------------------------------------------

Current Element = 34

largest = max(3, 34)

largest = 34

---------------------------------------------------------
ITERATION 3
---------------------------------------------------------

Current Element = 32

largest = max(34, 32)

largest = 34

---------------------------------------------------------
ITERATION 4
---------------------------------------------------------

Current Element = 67

largest = max(34, 67)

largest = 67

---------------------------------------------------------
ITERATION 5
---------------------------------------------------------

Current Element = 39

largest = max(67, 39)

largest = 67

---------------------------------------------------------
FINAL OUTPUT
---------------------------------------------------------

67

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class largest {

    /*
    =====================================================
    METHOD TO FIND LARGEST ELEMENT
    =====================================================

    This is the most optimal solution.

    Time Complexity  : O(n)
    Space Complexity : O(1)

    No sorting required.
    */
    public static int findLargest(int[] arr) {

        // Initialize largest with the
        // smallest possible integer value.
        //
        // This ensures that even if the
        // array contains negative numbers,
        // the logic still works correctly.
        int largest = Integer.MIN_VALUE;

        // Traverse the array from
        // index 0 to index n-1.
        for (int value : arr) {

            // Compare current element
            // with current largest value.
            //
            // If current element is larger,
            // update largest.
            largest = Math.max(largest, value);
        }

        // Return final largest element.
        return largest;
    }

    public static void main(String args[]) {

        // Create Scanner object
        // for reading input.
        Scanner sc = new Scanner(System.in);

        // Read size of array.
        int n = sc.nextInt();

        // Create array of size n.
        int arr[] = new int[n];

        // Read n array elements.
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find largest element.
        int ans = findLargest(arr);

        // Print result.
        System.out.println(ans);

        // Close Scanner object.
        sc.close();
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Best Interview Approach:

   Linear Traversal + Math.max()

---------------------------------------------------------

2. Sorting is NOT recommended.

   Sorting Complexity:

   O(n log n)

   Finding largest:

   O(n)

---------------------------------------------------------

3. Always initialize using:

   Integer.MIN_VALUE

   so negative numbers are handled safely.

---------------------------------------------------------

4. Works for:

   Positive Numbers
   Negative Numbers
   Mixed Numbers

---------------------------------------------------------

5. Most Frequently Asked Array Question.

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Initializing:

   int largest = 0;

   Fails for negative arrays.

---------------------------------------------------------

2. Using sorting unnecessarily.

---------------------------------------------------------

3. Forgetting to update largest.

---------------------------------------------------------

4. Using wrong loop boundary:

   i <= n

   instead of

   i < n

---------------------------------------------------------

5. Returning first element without
   checking remaining elements.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I used a single traversal approach to
find the largest element in the array.

I initialized a variable 'largest'
with Integer.MIN_VALUE.

Then I traversed every element and
compared it with the current largest
value using Math.max().

Whenever a larger value was found,
I updated the largest variable.

After completing the traversal,
the largest variable contained the
maximum element of the array.

This solution is optimal because it
requires only one pass through the array
with O(n) time complexity and O(1)
extra space."

=========================================================
TIME COMPLEXITY
=========================================================

O(n)

Reason:

Each array element is visited exactly once.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only one extra variable is used.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. What is the best way to find the largest element?

Answer:

Single traversal using Math.max().

---------------------------------------------------------

Q2. Why not sort the array?

Answer:

Sorting takes O(n log n),
while traversal takes O(n).

---------------------------------------------------------

Q3. Why use Integer.MIN_VALUE?

Answer:

To correctly handle negative numbers.

---------------------------------------------------------

Q4. Can this work for all negative values?

Answer:

Yes.

Example:

[-10, -5, -20]

Output:

-5

---------------------------------------------------------

Q5. What is the optimal complexity?

Answer:

Time  : O(n)

Space : O(1)

=========================================================
END OF FILE
=========================================================
*/
