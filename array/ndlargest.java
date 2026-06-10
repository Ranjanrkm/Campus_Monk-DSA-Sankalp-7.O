import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Find the Second Largest Distinct Element
in an Array.

Given an array of integers, find the
second largest DISTINCT element.

If no second largest element exists,
return -1.

Examples:

Input:
7
1 54 3 32 78 4 78

Output:
54

---------------------------------------------------------

Input:
5
10 10 10 10 10

Output:
-1

=========================================================
INPUT FORMAT
=========================================================

First Line:
n

Second Line:
n space-separated integers

Example:

7
1 54 3 32 78 4 78

=========================================================
OUTPUT FORMAT
=========================================================

Print the second largest distinct element.

Example:

54

=========================================================
DRY RUN EXAMPLE
=========================================================

Input:

7
1 54 3 32 78 4 78

---------------------------------------------------------
INITIALIZATION
---------------------------------------------------------

largest = Integer.MIN_VALUE
secondLargest = Integer.MIN_VALUE

---------------------------------------------------------
ITERATION 1
---------------------------------------------------------

Current Element = 1

largest = 1

secondLargest = MIN_VALUE

---------------------------------------------------------
ITERATION 2
---------------------------------------------------------

Current Element = 54

54 > 1

secondLargest = 1
largest = 54

---------------------------------------------------------
ITERATION 3
---------------------------------------------------------

Current Element = 3

3 > secondLargest

secondLargest = 3

---------------------------------------------------------
ITERATION 4
---------------------------------------------------------

Current Element = 32

32 > 3

secondLargest = 32

---------------------------------------------------------
ITERATION 5
---------------------------------------------------------

Current Element = 78

78 > 54

secondLargest = 54
largest = 78

---------------------------------------------------------
ITERATION 6
---------------------------------------------------------

Current Element = 4

No Update

---------------------------------------------------------
ITERATION 7
---------------------------------------------------------

Current Element = 78

Equal to largest

Ignore

---------------------------------------------------------
FINAL RESULT
---------------------------------------------------------

largest = 78

secondLargest = 54

Output:

54

=========================================================
WHY THIS IS THE BEST APPROACH
=========================================================

YOUR CODE CONTAINS TWO APPROACHES:

1. Sorting Approach
   Time Complexity = O(n log n)

2. Two Traversal Approach
   Time Complexity = O(n)

After analyzing all previous discussions,
interview expectations, TCS NQT patterns,
and competitive programming standards,
the BEST solution is:

Single Traversal Approach

Time Complexity = O(n)
Space Complexity = O(1)

No Sorting Required.

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class ndlargest {

    /*
    =====================================================
    METHOD TO FIND SECOND LARGEST ELEMENT
    =====================================================

    This is the most optimal approach.

    Single Traversal

    Time Complexity  : O(n)
    Space Complexity : O(1)
    */
    public static int Sec_largest(int[] arr) {

        // Edge Case:
        //
        // If array has fewer than
        // two elements, second largest
        // cannot exist.
        if (arr.length < 2) {
            return -1;
        }

        // Store the largest element
        // found so far.
        int largest = Integer.MIN_VALUE;

        // Store the second largest
        // distinct element found so far.
        int secondLargest = Integer.MIN_VALUE;

        /*
        =================================================
        TRAVERSE ARRAY ONCE
        =================================================
        */
        for (int value : arr) {

            /*
            If current value is greater than
            current largest element.

            Example:

            largest = 54
            value   = 78

            Then:

            secondLargest becomes 54
            largest becomes 78
            */
            if (value > largest) {

                secondLargest = largest;
                largest = value;
            }

            /*
            Current value should become
            second largest if:

            1. It is smaller than largest.
            2. It is greater than current
               secondLargest.
            3. It is distinct from largest.
            */
            else if (value > secondLargest
                    && value != largest) {

                secondLargest = value;
            }
        }

        /*
        If secondLargest never changed,
        then no second largest exists.

        Example:

        10 10 10 10
        */
        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }

    public static void main(String args[]) {

        // Create Scanner object
        // for reading input.
        Scanner sc = new Scanner(System.in);

        // Read size of array.
        int n = sc.nextInt();

        // Create array of size n.
        int arr[] = new int[n];

        // Read array elements.
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        // Find second largest element.
        int ans = Sec_largest(arr);

        // Print answer.
        System.out.println(ans);

        // Close Scanner object.
        sc.close();
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Second Largest means:

   Largest DISTINCT element after
   the maximum element.

---------------------------------------------------------

2. Example:

   [10, 20, 30]

   Largest = 30

   Second Largest = 20

---------------------------------------------------------

3. Example:

   [30, 30, 20]

   Largest = 30

   Second Largest = 20

---------------------------------------------------------

4. Example:

   [10, 10, 10]

   No second largest exists.

   Output:

   -1

---------------------------------------------------------

5. Best Approach:

   Single Traversal

   O(n)

---------------------------------------------------------

6. Avoid Sorting.

   Sorting:

   O(n log n)

   Traversal:

   O(n)

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Returning duplicate largest value.

   Example:

   78 78

   Wrong:

   78

---------------------------------------------------------

2. Using sorting unnecessarily.

---------------------------------------------------------

3. Initializing largest with 0.

   Fails for negative arrays.

---------------------------------------------------------

4. Forgetting DISTINCT requirement.

---------------------------------------------------------

5. Not handling all-equal arrays.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I used a single traversal approach to
find the second largest distinct element.

I maintained two variables:

largest
secondLargest

Whenever a larger element was found,
I shifted the previous largest value
into secondLargest.

If the current element was smaller than
largest but larger than secondLargest,
I updated secondLargest.

This allowed me to find the answer in
one pass without sorting.

The solution runs in O(n) time and
uses O(1) extra space."

=========================================================
TIME COMPLEXITY
=========================================================

O(n)

Reason:

Array is traversed only once.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only two extra variables are used.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. What is the best approach?

Answer:

Single Traversal.

---------------------------------------------------------

Q2. Why not sort the array?

Answer:

Sorting takes O(n log n).

Single traversal takes O(n).

---------------------------------------------------------

Q3. What if all elements are equal?

Answer:

Return -1.

No second largest element exists.

---------------------------------------------------------

Q4. Does this handle duplicates?

Answer:

Yes.

Only distinct values are considered.

---------------------------------------------------------

Q5. What is the optimal complexity?

Answer:

Time  : O(n)

Space : O(1)

=========================================================
END OF FILE
=========================================================
*/