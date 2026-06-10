import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to read an array when the
size of the array is NOT given explicitly.

Input is provided as a single line containing
comma-separated integers.

Example:

1,2,3,4,5

The program should:

1. Read the complete line.
2. Split the input using comma (,).
3. Convert each token into an integer.
4. Store values inside an ArrayList.
5. Print all elements.

=========================================================
INPUT FORMAT
=========================================================
A single line containing comma-separated integers.

Example:

1,2,3,4,5

=========================================================
OUTPUT FORMAT
=========================================================
Print all array elements separated by a space.

Example:

1 2 3 4 5

=========================================================
DRY RUN EXAMPLE 1
=========================================================

Input:

1,2,3,4,5

Step 1:

input = "1,2,3,4,5"

Step 2:

input.split(",")

Produces:

["1","2","3","4","5"]

Step 3:

Convert each string into integer.

1 → 1
2 → 2
3 → 3
4 → 4
5 → 5

Step 4:

Store inside ArrayList

[1, 2, 3, 4, 5]

Step 5:

Print elements

Output:

1 2 3 4 5

=========================================================
DRY RUN EXAMPLE 2
=========================================================

Input:

10,20,30

After Splitting:

["10","20","30"]

After Conversion:

[10,20,30]

Output:

10 20 30

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class inputArr_snd {

    public static void main(String args[]) {

        // Create Scanner object.
        //
        // Scanner is used to read input
        // from the keyboard.
        Scanner sc = new Scanner(System.in);

        /*
        =================================================
        READ COMPLETE INPUT LINE
        =================================================

        Example Input:

        1,2,3,4,5

        Entire line will be stored
        inside the variable 'input'.
        */
        String input = sc.nextLine().trim();

        /*
        =================================================
        SPLIT INPUT USING COMMA
        =================================================

        Example:

        "1,2,3,4,5"

        becomes

        ["1","2","3","4","5"]
        */
        String arr[] = input.split(",");

        /*
        =================================================
        CREATE DYNAMIC ARRAY
        =================================================

        ArrayList is used because
        array size is not known initially.
        */
        ArrayList<Integer> ar = new ArrayList<>();

        /*
        =================================================
        CONVERT STRING TOKENS TO INTEGER
        =================================================

        Example:

        "1" → 1
        "2" → 2
        "3" → 3
        */
        for (String token : arr) {

            // Remove unwanted spaces.
            //
            // Example:
            //
            // " 5 " → "5"
            token = token.trim();

            // Convert string to integer.
            int num = Integer.parseInt(token);

            // Store integer inside ArrayList.
            ar.add(num);
        }

        /*
        =================================================
        PRINT ARRAY ELEMENTS
        =================================================

        Traverse the ArrayList and
        print each element separated
        by a single space.
        */
        for (int i = 0; i < ar.size(); i++) {

            System.out.print(ar.get(i));

            // Avoid printing extra space
            // after the last element.
            if (i != ar.size() - 1) {
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

1. Use nextLine() when input comes
   as a complete string.

---------------------------------------------------------

2. split(",") divides the string
   wherever a comma appears.

---------------------------------------------------------

3. Integer.parseInt()

   converts String → int

---------------------------------------------------------

4. trim() removes unwanted spaces.

   Example:

   " 10 " → "10"

---------------------------------------------------------

5. If size is not given,
   ArrayList is generally preferred.

---------------------------------------------------------

6. TCS NQT Rule:

   If input comes as:

   1,2,3,4,5

   use:

   nextLine() + split(",")

---------------------------------------------------------

7. Hidden Test Case Tip:

   Always use trim() before
   Integer.parseInt().

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Using nextInt() for:

   1,2,3,4,5

   This causes InputMismatchException.

---------------------------------------------------------

2. Forgetting trim().

---------------------------------------------------------

3. Using split(" ")

   instead of split(",")

---------------------------------------------------------

4. Printing extra spaces at the end.

---------------------------------------------------------

5. Forgetting Integer.parseInt().

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program handles array input when
the array size is not provided explicitly.

I first read the entire input line using
Scanner's nextLine() method.

Then I split the input string using commas,
which gives individual elements as strings.

Next, I convert each string into an integer
using Integer.parseInt() and store them
inside an ArrayList.

Finally, I traverse the ArrayList and print
all elements in the required format.

This approach is commonly used in TCS NQT
and coding platform questions where array
size is not given."

=========================================================
TIME COMPLEXITY
=========================================================

O(n)

Where:

n = Number of elements

Reason:

Each element is processed exactly once.

=========================================================
SPACE COMPLEXITY
=========================================================

O(n)

Reason:

ArrayList stores all n elements.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Why use nextLine() instead of nextInt()?

Answer:

Because the entire array comes as a single
comma-separated string.

---------------------------------------------------------

Q2. What does split(",") do?

Answer:

It divides the string wherever a comma occurs.

---------------------------------------------------------

Q3. Why use ArrayList?

Answer:

Because array size is not known initially.

---------------------------------------------------------

Q4. What does Integer.parseInt() do?

Answer:

It converts String into int.

---------------------------------------------------------

Q5. What is the time complexity?

Answer:

O(n)

Because every element is processed once.

=========================================================
END OF FILE
=========================================================
*/