import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to read an array when the
size of the array is NOT given explicitly.

Input is provided as a single line containing
space-separated integers.

Example:

1 2 3 4 5

The program should:

1. Read the complete input line.
2. Split the input using spaces.
3. Convert each token into an integer.
4. Store values inside an ArrayList.
5. Print all elements.

This is a very common TCS NQT, Infosys,
Wipro, and Online Judge input pattern.

=========================================================
INPUT FORMAT
=========================================================
A single line containing space-separated
integers.

Example:

1 2 3 4 5

=========================================================
OUTPUT FORMAT
=========================================================
Print all array elements separated by
a single space.

Example:

1 2 3 4 5

=========================================================
DRY RUN EXAMPLE 1
=========================================================

Input:

1 2 3 4 5

---------------------------------------------------------
STEP 1
---------------------------------------------------------

Read complete line.

input = "1 2 3 4 5"

---------------------------------------------------------
STEP 2
---------------------------------------------------------

Split using spaces.

input.split("\\s+")

Result:

["1", "2", "3", "4", "5"]

---------------------------------------------------------
STEP 3
---------------------------------------------------------

Convert String → Integer

"1" → 1
"2" → 2
"3" → 3
"4" → 4
"5" → 5

---------------------------------------------------------
STEP 4
---------------------------------------------------------

Store inside ArrayList.

[1, 2, 3, 4, 5]

---------------------------------------------------------
STEP 5
---------------------------------------------------------

Print elements.

Output:

1 2 3 4 5

=========================================================
DRY RUN EXAMPLE 2
=========================================================

Input:

10 20 30 40

After Splitting:

["10", "20", "30", "40"]

After Conversion:

[10, 20, 30, 40]

Output:

10 20 30 40

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class inputArr_trd {

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

        1 2 3 4 5

        Store entire line inside a String.
        */
        String input = sc.nextLine().trim();

        /*
        =================================================
        SPLIT INPUT USING SPACES
        =================================================

        "\\s+" means:

        One or more whitespace characters.

        This handles:

        1 2 3 4 5

        as well as

        1    2     3

        safely.

        Result:

        ["1","2","3","4","5"]
        */
        String[] arr = input.split("\\s+");

        /*
        =================================================
        CREATE DYNAMIC ARRAY
        =================================================

        Since size is not given explicitly,
        ArrayList is a good choice.
        */
        ArrayList<Integer> ar = new ArrayList<>();

        /*
        =================================================
        CONVERT STRING TOKENS TO INTEGER
        =================================================

        Example:

        "10" → 10
        "20" → 20
        */
        for (String token : arr) {

            // Remove extra spaces if any.
            token = token.trim();

            // Convert String to Integer.
            int num = Integer.parseInt(token);

            // Store inside ArrayList.
            ar.add(num);
        }

        /*
        =================================================
        PRINT ARRAY ELEMENTS
        =================================================

        Traverse from index 0
        to index size - 1.

        Avoid printing extra spaces
        after the last element.
        */
        for (int i = 0; i < ar.size(); i++) {

            System.out.print(ar.get(i));

            if (i != ar.size() - 1) {
                System.out.print(" ");
            }
        }

        // Close Scanner.
        sc.close();
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Use nextLine() when the entire
   array comes in one line.

---------------------------------------------------------

2. Use:

   split("\\s+")

   instead of

   split(" ")

   because it handles multiple spaces.

---------------------------------------------------------

3. trim() removes unwanted spaces.

---------------------------------------------------------

4. Integer.parseInt()

   converts String → int.

---------------------------------------------------------

5. If size is NOT given,
   ArrayList is preferred.

---------------------------------------------------------

6. TCS NQT Rule:

   One-line input

   →

   nextLine() + split()

---------------------------------------------------------

7. Hidden Test Case Tip:

   Input may contain multiple spaces.

   Example:

   1     2      3

   split("\\s+")

   handles it safely.

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Using:

   split(" ")

   instead of

   split("\\s+")

---------------------------------------------------------

2. Using nextInt() when input
   comes as a complete line.

---------------------------------------------------------

3. Forgetting Integer.parseInt().

---------------------------------------------------------

4. Printing extra spaces at the end.

---------------------------------------------------------

5. Not handling multiple spaces.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program handles array input when
the size of the array is not provided.

I first read the entire line using
Scanner's nextLine() method.

Then I split the line into individual
tokens using split('\\s+'), which handles
one or multiple spaces.

After that, I convert each token from
String to Integer using Integer.parseInt()
and store it in an ArrayList.

Finally, I traverse the ArrayList and
print all elements in the required format.

This approach is commonly used in
TCS NQT and coding interviews when
array size is unknown."

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

Q1. Why use nextLine()?

Answer:

Because the entire array comes in
a single line.

---------------------------------------------------------

Q2. Why use split("\\s+")?

Answer:

It handles one or multiple spaces safely.

---------------------------------------------------------

Q3. What does Integer.parseInt() do?

Answer:

It converts String into int.

---------------------------------------------------------

Q4. Why use ArrayList?

Answer:

Because array size is not known initially.

---------------------------------------------------------

Q5. What is the Time Complexity?

Answer:

O(n)

Because every element is processed once.

=========================================================
END OF FILE
=========================================================
*/
