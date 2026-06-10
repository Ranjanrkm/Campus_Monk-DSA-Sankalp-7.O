import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Given an array of integers and a value k,
find all elements that are strictly smaller
than k and store them in a new ArrayList.

Print all such elements in the same order
as they appear in the original array.

=========================================================
INPUT FORMAT
=========================================================

First Line:
n

Second Line:
n space-separated integers

Third Line:
k

Example:

5
10 2 15 4 8
9

=========================================================
OUTPUT FORMAT
=========================================================

Print all elements smaller than k.

Example:

2 4 8

=========================================================
DRY RUN EXAMPLE 1
=========================================================

Input:

5
10 2 15 4 8
9

---------------------------------------------------------
INITIAL ARRAY
---------------------------------------------------------

[10, 2, 15, 4, 8]

k = 9

---------------------------------------------------------
TRAVERSAL
---------------------------------------------------------

10 < 9 ?

No

-------------------------

2 < 9 ?

Yes

Store:

[2]

-------------------------

15 < 9 ?

No

-------------------------

4 < 9 ?

Yes

Store:

[2, 4]

-------------------------

8 < 9 ?

Yes

Store:

[2, 4, 8]

---------------------------------------------------------
FINAL OUTPUT
---------------------------------------------------------

2 4 8

=========================================================
DRY RUN EXAMPLE 2
=========================================================

Input:

6
5 1 7 3 9 2
5

Elements smaller than 5:

1 3 2

Output:

1 3 2

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class lessthan {

    /*
    =====================================================
    METHOD TO FIND ELEMENTS LESS THAN k
    =====================================================

    This method traverses the array and
    stores every element smaller than k
    into an ArrayList.
    */
    public static ArrayList<Integer> fun(int[] arr, int k) {

        // Create a dynamic ArrayList
        // to store all elements
        // smaller than k.
        ArrayList<Integer> result = new ArrayList<>();

        // Traverse the array starting
        // from index 0 up to index n-1.
        for (int i = 0; i < arr.length; i++) {

            // Check whether the current
            // element is smaller than k.
            if (arr[i] < k) {

                // Add the element to
                // the result list.
                result.add(arr[i]);
            }
        }

        // Return the final list.
        return result;
    }

    public static void main(String[] args) {

        // Create Scanner object
        // for reading input.
        Scanner sc = new Scanner(System.in);

        // Read size of array.
        int n = sc.nextInt();

        // Create array of size n.
        int[] arr = new int[n];

        // Read n array elements.
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        // Read value of k.
        int k = sc.nextInt();

        // Call function to get all
        // elements smaller than k.
        ArrayList<Integer> ans = fun(arr, k);

        // Print all elements present
        // inside the ArrayList.
        for (int i = 0; i < ans.size(); i++) {

            System.out.print(ans.get(i));

            if (i != ans.size() - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. This is a Filtering Problem.

   We filter elements based on a condition.

---------------------------------------------------------

2. Condition Used:

   arr[i] < k

---------------------------------------------------------

3. ArrayList is used because
   we do not know beforehand
   how many elements will satisfy
   the condition.

---------------------------------------------------------

4. Order is preserved.

   Elements appear in the same order
   as the original array.

---------------------------------------------------------

5. Frequently Asked In:

   • TCS NQT
   • Infosys
   • Wipro
   • Capgemini
   • Array Interviews

---------------------------------------------------------

6. Hidden Test Cases:

   Empty Result

   Example:

   Array:

   10 20 30

   k = 5

   Output:

   (Nothing Printed)

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Using <= instead of <

---------------------------------------------------------

2. Creating a fixed-size array
   unnecessarily.

---------------------------------------------------------

3. Forgetting to add matching
   elements into ArrayList.

---------------------------------------------------------

4. Printing extra spaces.

---------------------------------------------------------

5. Returning the original array
   instead of filtered values.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I used a linear traversal approach.

I created an ArrayList to store all
elements that satisfy the condition
arr[i] < k.

Then I traversed the array once and
checked each element.

Whenever an element was smaller than k,
I added it to the ArrayList.

Finally, I printed all stored elements.

This solution preserves the original
order and runs in linear time."

=========================================================
TIME COMPLEXITY
=========================================================

O(n)

Reason:

The array is traversed exactly once.

=========================================================
SPACE COMPLEXITY
=========================================================

O(n)

Reason:

In the worst case, all elements
may be smaller than k and get stored
inside the ArrayList.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Why use ArrayList?

Answer:

Because the number of matching elements
is not known beforehand.

---------------------------------------------------------

Q2. What condition is used?

Answer:

arr[i] < k

---------------------------------------------------------

Q3. Is the original order preserved?

Answer:

Yes.

---------------------------------------------------------

Q4. What is the Time Complexity?

Answer:

O(n)

---------------------------------------------------------

Q5. What is the Space Complexity?

Answer:

O(n) in the worst case.

=========================================================
END OF FILE
=========================================================
*/