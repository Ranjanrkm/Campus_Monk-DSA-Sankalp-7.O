import java.util.*;

/*
========================================================
PROBLEM STATEMENT
========================================================
Write a Java program to calculate the sum of all elements
present in an integer array entered by the user.

The program should:
1. Read the size of the array.
2. Read all array elements.
3. Calculate the sum of all elements.
4. Print the final sum.

Example:
Input:
5
10 20 30 40 50

Output:
150

========================================================
INPUT FORMAT
========================================================
First Line:
n -> Size of the array

Second Line:
n integer values separated by spaces

Example:
5
10 20 30 40 50

========================================================
OUTPUT FORMAT
========================================================
Print the sum of all array elements.

Example:
150

========================================================
DRY RUN EXAMPLE 1
========================================================
Input:
5
10 20 30 40 50

Initial:
ans = 0

Iteration 1:
ans = 0 + 10 = 10

Iteration 2:
ans = 10 + 20 = 30

Iteration 3:
ans = 30 + 30 = 60

Iteration 4:
ans = 60 + 40 = 100

Iteration 5:
ans = 100 + 50 = 150

Output:
150

========================================================
DRY RUN EXAMPLE 2
========================================================
Input:
4
1 2 3 4

Initial:
ans = 0

Iteration 1:
ans = 1

Iteration 2:
ans = 3

Iteration 3:
ans = 6

Iteration 4:
ans = 10

Output:
10

========================================================
DRY RUN EXAMPLE 3
========================================================
Input:
3
-5 10 20

Initial:
ans = 0

Iteration 1:
ans = -5

Iteration 2:
ans = 5

Iteration 3:
ans = 25

Output:
25

========================================================
FULLY COMMENTED JAVA CODE
========================================================
*/

public class userinput {

    /*
    ----------------------------------------------------
    METHOD: array_sum
    ----------------------------------------------------
    Purpose:
    Calculate the sum of all elements present
    inside the given array.

    Parameter:
    arr -> Integer array

    Returns:
    Total sum of array elements
    ----------------------------------------------------
    */
    public static int array_sum(int[] arr) {

        /*
        Variable 'ans' stores the running sum.

        Initially:
        ans = 0

        Example:
        Array = [10, 20, 30]

        After processing:
        ans = 60
        */
        int ans = 0;

        /*
        Traverse every element of the array
        using Enhanced For Loop.

        Example:
        Array = [10, 20, 30]

        Iteration 1:
        a = 10

        Iteration 2:
        a = 20

        Iteration 3:
        a = 30
        */
        for (int a : arr) {

            /*
            Add current element into the
            running sum variable.

            Example:
            ans = 10
            a = 20

            ans = ans + a
            ans = 30
            */
            ans += a;
        }

        /*
        Return the final calculated sum.
        */
        return ans;
    }

    public static void main(String args[]) {

        /*
        Scanner object is used to read input
        from the keyboard.

        As per TCS NQT and Online Judge standards,
        Scanner is commonly used for input handling.
        */
        Scanner sc = new Scanner(System.in);

        /*
        Read size of the array.

        Example Input:
        5

        After execution:
        n = 5
        */
        int n = sc.nextInt();

        /*
        Create an integer array of size n.

        Example:
        n = 5

        Array:
        [0, 0, 0, 0, 0]
        */
        int[] arr = new int[n];

        /*
        Traverse the array from index 0
        up to index n-1.

        Purpose:
        Store user input values into the array.
        */
        for (int i = 0; i < arr.length; i++) {

            /*
            Read current array element.

            Example Input:
            10
            */
            int a = sc.nextInt();

            /*
            Store the entered value
            into the current index.
            */
            arr[i] = a;
        }

        /*
        Call array_sum() method and
        store the returned result.
        */
        int ans = array_sum(arr);

        /*
        Print the final sum.

        No extra text is printed because
        online judges require exact output.
        */
        System.out.println(ans);

        /*
        Close Scanner to release resources.
        */
        sc.close();
    }
}

/*
========================================================
IMPORTANT NOTES FOR REVISION
========================================================

1. Enhanced For Loop:
   for(int a : arr)
   is used to directly access array elements.

2. Array Traversal:
   Every element is visited exactly once.

3. Running Sum Technique:
   ans += a;
   is the standard approach for array summation.

4. TCS NQT Rule:
   Avoid prompts like:
   "Enter size:"
   because online judges reject extra output.

5. Edge Cases:
   - Empty Array (n = 0)
   - Negative Numbers
   - Large Positive Numbers
   - Mixed Positive & Negative Values

========================================================
COMMON BEGINNER MISTAKES
========================================================

1. Forgetting to initialize sum variable with 0.

2. Writing:
   ans = a;
   instead of:
   ans += a;

3. Using:
   i <= arr.length
   which causes ArrayIndexOutOfBoundsException.

4. Printing extra messages such as:
   "Sum is:"
   which may fail online judges.

5. Forgetting to close Scanner.

========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
========================================================

"This program calculates the sum of all elements
present in an integer array.

First, I read the size of the array and store
all user inputs into the array.

Then I call a separate method named array_sum()
which traverses the array using an Enhanced
For Loop.

During traversal, every element is added to
a running sum variable.

Finally, the method returns the total sum,
which is printed in the main method.

The solution scans the array only once,
making it efficient and easy to understand."

========================================================
TIME COMPLEXITY
========================================================

O(N)

Reason:
Every array element is visited exactly once
while calculating the sum.

========================================================
SPACE COMPLEXITY
========================================================

O(1)

Reason:
Only one extra variable (ans) is used.

Note:
Input array storage is not counted as
extra auxiliary space.

========================================================
INTERVIEW QUICK ANSWER
========================================================

Q1: Why is the time complexity O(N)?

Answer:
Because every element of the array is visited
exactly one time.

--------------------------------------------------------

Q2: Why use an Enhanced For Loop here?

Answer:
Because we only need the values of the array,
not their indexes. It improves readability.

--------------------------------------------------------

Q3: Can this solution handle negative numbers?

Answer:
Yes. Negative values are also added into the
running sum correctly.

--------------------------------------------------------

Q4: What happens if n = 0?

Answer:
The loop will not execute and the final
sum returned will be 0.

--------------------------------------------------------

Q5: Can integer overflow occur?

Answer:
Yes. If the array contains very large values,
the sum may exceed Integer.MAX_VALUE.
In that case, long should be used instead of int.

========================================================
END OF FILE
========================================================
*/