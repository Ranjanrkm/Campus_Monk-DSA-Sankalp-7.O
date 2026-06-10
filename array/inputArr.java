import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to read and print an array
when the size of the array is given.

The program should:

1. Read the size of the array.
2. Create an array of that size.
3. Read all elements.
4. Store them inside the array.
5. Print all elements.

This is the most common array input format used in:

• TCS NQT
• Infosys
• Wipro
• Accenture
• Capgemini
• HackerRank
• LeetCode
• Coding Ninjas

=========================================================
INPUT FORMAT
=========================================================

First Line:

n

where n = number of elements

Second Line:

n space-separated integers

Example:

5
10 20 30 40 50

=========================================================
OUTPUT FORMAT
=========================================================

Print all array elements separated
by a single space.

Example:

10 20 30 40 50

=========================================================
DRY RUN EXAMPLE 1
=========================================================

Input:

5
10 20 30 40 50

---------------------------------------------------------
STEP 1
---------------------------------------------------------

Read n

n = 5

---------------------------------------------------------
STEP 2
---------------------------------------------------------

Create array

arr = new int[5]

Indexes:

0 1 2 3 4

---------------------------------------------------------
STEP 3
---------------------------------------------------------

Read elements

Iteration 1:

arr[0] = 10

Iteration 2:

arr[1] = 20

Iteration 3:

arr[2] = 30

Iteration 4:

arr[3] = 40

Iteration 5:

arr[4] = 50

---------------------------------------------------------
STEP 4
---------------------------------------------------------

Array becomes:

[10, 20, 30, 40, 50]

---------------------------------------------------------
STEP 5
---------------------------------------------------------

Print all elements

Output:

10 20 30 40 50

=========================================================
DRY RUN EXAMPLE 2
=========================================================

Input:

3
5 8 12

Array:

[5, 8, 12]

Output:

5 8 12

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class inputArr {

    public static void main(String args[]) {

        // Create Scanner object.
        //
        // Scanner is used to read
        // input from the keyboard.
        Scanner sc = new Scanner(System.in);

        /*
        =================================================
        READ ARRAY SIZE
        =================================================

        Example Input:

        5

        After execution:

        n = 5
        */
        int n = sc.nextInt();

        /*
        =================================================
        CREATE ARRAY
        =================================================

        Create an integer array capable
        of storing exactly n elements.

        Example:

        n = 5

        Array Size = 5
        */
        int arr[] = new int[n];

        /*
        =================================================
        READ ARRAY ELEMENTS
        =================================================

        Traverse the array starting
        from index 0 up to index n-1.

        During each iteration,
        read one integer and store
        it into the corresponding index.

        Example:

        Input:

        10 20 30 40 50

        Array becomes:

        [10, 20, 30, 40, 50]
        */
        for (int i = 0; i < n; i++) {

            // Read one integer value
            // from input.

            arr[i] = sc.nextInt();
        }

        /*
        =================================================
        PRINT ARRAY ELEMENTS
        =================================================

        Traverse the array and print
        every element.

        Enhanced For Loop:

        Directly accesses each element
        without using indexes.
        */
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);

            // Prevent extra space after
            // the last element.
            if (i != arr.length - 1) {
                System.out.print(" ");
            }
        }

        // Close Scanner object.
        sc.close();
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Most Common Array Input Pattern:

   int n = sc.nextInt();

   int arr[] = new int[n];

---------------------------------------------------------

2. Array Indexing starts from 0.

   Example:

   Size = 5

   Valid Indexes:

   0 1 2 3 4

---------------------------------------------------------

3. Array Size is Fixed.

   Once created,
   size cannot be changed.

---------------------------------------------------------

4. Use:

   arr.length

   to get array size.

---------------------------------------------------------

5. TCS NQT Standard Input:

   First input = size

   Remaining inputs = elements

---------------------------------------------------------

6. Hidden Test Case Tip:

   Avoid extra spaces and prompts.

   Correct:

   System.out.print(arr[i]);

   Wrong:

   Enter Elements:

---------------------------------------------------------

7. Enhanced For Loop:

   for(int value : arr)

   is useful when only values
   are required.

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Creating array before reading n.

---------------------------------------------------------

2. Using:

   i <= n

   instead of

   i < n

---------------------------------------------------------

3. Accessing invalid index.

   Example:

   arr[n]

---------------------------------------------------------

4. Forgetting to initialize array size.

---------------------------------------------------------

5. Printing extra spaces or prompts,
   causing Online Judge failures.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program demonstrates the standard
array input pattern in Java.

First, I read the size of the array.

Using that size, I create an integer array.

Then I traverse the array from index 0
to n-1 and read each element using Scanner.

After storing all values, I traverse the
array again and print every element.

The solution follows the most common
competitive programming and TCS NQT
input-output style."

=========================================================
TIME COMPLEXITY
=========================================================

O(n)

Reason:

One traversal for input
and one traversal for output.

O(n) + O(n)

= O(n)

=========================================================
SPACE COMPLEXITY
=========================================================

O(n)

Reason:

The array stores n elements.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. How do you create an array of size n?

Answer:

int arr[] = new int[n];

---------------------------------------------------------

Q2. What is the first index of an array?

Answer:

0

---------------------------------------------------------

Q3. What is the last index of an array?

Answer:

arr.length - 1

---------------------------------------------------------

Q4. How do you find array size?

Answer:

arr.length

---------------------------------------------------------

Q5. What is the Time Complexity?

Answer:

O(n)

Because every element is processed once.

=========================================================
END OF FILE
=========================================================
*/