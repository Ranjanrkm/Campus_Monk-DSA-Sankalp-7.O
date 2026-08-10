import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Implement Linear Search to find a target element
in an array.

Linear Search traverses the array from left to
right and compares each element with the target.

If the target element is found, return its index.

If the target element is not found, return -1.

Example:

Input:
8
10 20 30 55 10 20 3 4
55

Output:
3

=========================================================
INPUT FORMAT
=========================================================

First line:
n

Second line:
n space-separated integers

Third line:
target element

Example:

8
10 20 30 55 10 20 3 4
55

Reason For This Input Style:

This is the most common array input format used in:

- TCS NQT
- Infosys
- Accenture
- Wipro
- Cognizant
- HackerRank
- Coding Ninjas
- GeeksForGeeks

=========================================================
OUTPUT FORMAT
=========================================================

Print the index of the first occurrence of the
target element.

If not found, print:

-1

=========================================================
DRY RUN EXAMPLE
=========================================================

Input:

8
10 20 30 55 10 20 3 4
55

---------------------------------------------------------

Array:

[10, 20, 30, 55, 10, 20, 3, 4]

Target:

55

---------------------------------------------------------

i = 0

arr[0] = 10

55 == 10 ?

No

---------------------------------------------------------

i = 1

arr[1] = 20

55 == 20 ?

No

---------------------------------------------------------

i = 2

arr[2] = 30

55 == 30 ?

No

---------------------------------------------------------

i = 3

arr[3] = 55

55 == 55 ?

Yes

Return 3

---------------------------------------------------------

Output:

3

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class searching {

    /*
    =====================================================
    LINEAR SEARCH FUNCTION
    =====================================================

    This function searches for the target element
    by checking every array element one by one.

    If target is found:
    Return index.

    Otherwise:
    Return -1.
    */
    public static int Linear_Search(int[] arr, int target) {

        /*
        Initialize index with -1.

        This value will be returned if the
        target element is not found.
        */
        int index = -1;

        /*
        Traverse the array starting from
        index 0 up to index arr.length - 1.
        */
        for (int i = 0; i < arr.length; i++) {

            /*
            Check whether current element
            is equal to target.
            */
            if (target == arr[i]) {

                /*
                First occurrence found.

                Immediately return index.
                */
                return i;
            }
        }

        /*
        Target element not found.
        */
        return index;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        /*
        Read size of array.

        Example:

        Input:
        8

        After execution:
        n = 8
        */
        int n = sc.nextInt();

        /*
        Create array of size n.
        */
        int[] arr = new int[n];

        /*
        Read n array elements.

        Example:

        10 20 30 55 10 20 3 4
        */
        for (int i = 0; i < n; i++) {

            /*
            Store current input value
            inside the array.
            */
            arr[i] = sc.nextInt();
        }

        /*
        Read target element.

        Example:

        55
        */
        int target = sc.nextInt();

        /*
        Call Linear Search function.
        */
        int ans = Linear_Search(arr, target);

        /*
        Print result.
        */
        System.out.println(ans);

        sc.close();
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Linear Search works on both Sorted and
   Unsorted Arrays.

2. Early Return Optimization is used.
   As soon as the target is found,
   traversal stops immediately.

3. First Occurrence Retrieval.
   Because traversal starts from index 0,
   duplicate elements return the first index.

4. Best Case Time Complexity is O(1)
   when the element is found at index 0.

5. Binary Search is faster (O(log n))
   but requires the array to be sorted,
   whereas Linear Search has no such requirement.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I implemented Linear Search.

I traverse the array from left to right and
compare each element with the target value.

If a match is found, I immediately return
its index.

If the complete array is traversed and
the element is not found, I return -1.

This approach works for both sorted and
unsorted arrays and is easy to implement."

=========================================================
TIME COMPLEXITY
=========================================================

Best Case:
O(1)

Reason:
Target found at first index.

---------------------------------------------------------

Worst Case:
O(n)

Reason:
Entire array needs to be traversed.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only a few variables are used.

No extra array or collection is created.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Why does Linear Search work on an
unsorted array?

Answer:
Linear Search checks every element
individually and does not depend on
element ordering.

---------------------------------------------------------

Q2. Why is Binary Search faster than
Linear Search?

Answer:
Binary Search reduces the search space
by half in every step, giving O(log n)
time complexity.

---------------------------------------------------------

Q3. Does this code return the first
occurrence of a duplicate element?

Answer:
Yes. Since traversal starts from index 0
and returns immediately after a match,
the first occurrence is returned.

---------------------------------------------------------

Q4. When should Linear Search be preferred?

Answer:
When the dataset is small, unsorted,
or when sorting the array is not feasible.

=========================================================
END OF FILE
=========================================================
*/