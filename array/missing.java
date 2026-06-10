/*
==========================================================================
1. PROBLEM STATEMENT
==========================================================================
Given an array containing 'n' distinct integers in the range [1, n + 1], 
meaning exactly one integer is missing from the natural sequence sequence, 
find and return that missing integer. 

The original solution uses a highly inefficient nested-loop brute force approach 
with a time complexity of O(N^2). To satisfy strict execution time limits on competitive 
programming portals (such as TCS NQT, LeetCode, and HackerRank), this solution must 
be optimized to O(N) time using mathematical summation arithmetic, while integrating 
robust I/O safety parsing guidelines mentioned in our reference documentation.

==========================================================================
2. INPUT FORMAT
==========================================================================
The input accommodates standard assessment test configurations:
- Line 1: An integer 'n' defining the absolute size of the provided array.
  Note: This leaves a dangerous carriage-return newline sequence inside the buffer.
- Line 2: A sequence of 'n' space-separated or comma-separated integers.

Example Input:
5
1 2 4 5 6

==========================================================================
3. OUTPUT FORMAT
==========================================================================
The output prints a single line displaying the exact missing natural integer, 
ensuring zero trailing white spaces.

Example Output:
3

==========================================================================
4. MULTIPLE DRY RUN EXAMPLES
==========================================================================
--------------------------------------------------------------------------
DRY RUN EXAMPLE A (Standard Sequential Array with Gap)
--------------------------------------------------------------------------
Input:
5
1 2 4 5 6

Execution Mechanics:
1. Size read step: 'n' captures 5. Buffer cleared.
2. Elements parsed: arr = [1, 2, 4, 5, 6]. length = 5.
3. Natural boundary limit: N = arr.length + 1 -> 5 + 1 = 6.
4. Expected Sum Calculation: 
   - Formula: (N * (N + 1)) / 2 -> (6 * 7) / 2 = 42 / 2 = 21.
5. Actual Observed Array Sum Extraction:
   - 1 + 2 + 4 + 5 + 6 = 18.
6. Final Missing Calculation:
   - Expected Sum - Actual Sum -> 21 - 18 = 3.
7. Prints: 3

--------------------------------------------------------------------------
DRY RUN EXAMPLE B (Boundary Missing Condition - Missing First Element)
--------------------------------------------------------------------------
Input:
3
2 3 4

Execution Mechanics:
1. 'n' captures 3.
2. Elements parsed: arr = [2, 3, 4]. length = 3.
3. Natural boundary limit: N = 3 + 1 = 4.
4. Expected Sum Calculation: (4 * 5) / 2 = 10.
5. Actual Observed Array Sum Extraction: 2 + 3 + 4 = 9.
6. Final Missing Calculation: 10 - 9 = 1.
7. Prints: 1

==========================================================================
*/

import java.util.*;
import java.io.*;

public class missing {
    
    /**
     * Finds the missing sequence integer using optimal O(N) summation.
     * Maps across mathematical sequence space without demanding nested loops.
     * * @param arr primitive integer collection array
     * @return the isolated missing integer sequence element
     */
    public static int missing_num(int[] arr) {
        // Calculate the value of N, which represents the total count of numbers 
        // that should have been present in the sequence if none were missing.
        // Since one element is missing, N is exactly array length + 1.
        //
        // Example: If array length is 5, then N = 6.
        long n = arr.length + 1;

        // Compute the expected mathematical sum of all integers from 1 up to N.
        // Using Gauss' Summation Formula: (N * (N + 1)) / 2.
        // We use a 'long' data type here to eliminate integer overflow risks 
        // when dealing with large competitive array inputs up to 10^5.
        long expectedSum = (n * (n + 1)) / 2;

        // Initialize a tracking variable to accumulate the actual sum of 
        // all integers currently residing inside the input array.
        long actualSum = 0;

        // Traverse the array starting from index 0 up to index n-1.
        // This linear scan sums each present element.
        for (int i = 0; i < arr.length; i++) {
            
            // Add the value of the current array element to our running total.
            actualSum += arr[i];
        }

        // The difference between what the sequence sum *should* be and what 
        // the sequence sum *actually* is yields the exact missing value.
        // Cast the final result back to a standard integer return type.
        return (int) (expectedSum - actualSum);
    }

    public static void main(String[] args) {
        // Create a Scanner object to handle inputs dynamically.
        // This meets competitive guidelines by breaking reliance on fixed values.
        Scanner sc = new Scanner(System.in);

        // Check if the input stream contains an integer configuration token.
        // This structural check ensures the code remains robust against empty files.
        if (sc.hasNextInt()) {
            
            // Read the total number of array elements provided by the test case.
            int n = sc.nextInt();

            // CRITICAL PDF BUFFER FIX: Consume the leftover trailing newline character.
            // sc.nextInt() skips the carriage return, which will intercept and 
            // corrupt subsequent text parsing reads if left unconsumed.
            sc.nextLine();

            // Initialize a fixed primitive array allocated directly to size 'n'.
            int arr[] = new int[n];

            // Read the array data as a single raw stream line to gracefully accommodate 
            // varied delimiters like spaces, brackets, or trailing comma noise.
            String line = sc.nextLine().trim();

            // Replace standard structural bracket notation or comma separators 
            // with empty space chars to ensure absolute parsing safety.
            line = line.replace("[", " ").replace("]", " ").replace(",", " ");

            // Split the parsed string by utilizing an expressive regular expression 
            // that handles single or multiple consecutive whitespace gaps.
            String[] tokens = line.trim().split("\\s+");

            // Initialize an index tracker variable to populate our array elements.
            int index = 0;

            // Traverse through all string tokens extracted from the line input.
            for (int i = 0; i < tokens.length && index < n; i++) {
                
                // Check whether the extracted text token is not empty.
                if (!tokens[i].isEmpty()) {
                    
                    // Parse the valid text token directly into a primitive integer 
                    // and store it inside our execution array container.
                    arr[index] = Integer.parseInt(tokens[i]);
                    
                    // Increment the array index pointer forward by one.
                    index++;
                }
            }

            // Execute our optimized core routine to locate the missing natural integer.
            int ans = missing_num(arr);

            // Print the final result directly to standard output.
            // Avoiding conversational prompts ensures compatibility with online judges.
            System.out.print(ans);
        }

        // Close the input scanner resource stream to prevent system handle leaks.
        sc.close();
    }
}

/*
==========================================================================
IMPORTANT NOTES FOR REVISION
============================
* ARITHMETIC OVERFLOW SAFETY: When computing `(N * (N + 1)) / 2`, if `N` is 
  large (e.g., $10^5$), the product can easily exceed `Integer.MAX_VALUE`. 
  Always use the `long` data type for calculating sums to prevent overflow bugs.
* TRAPPING DELIMITER STRINGS: Some online platforms wrap array inputs inside 
  square brackets (e.g., `[1,2,4,5]`). Sanitizing strings via `.replace()` 
  before running conversions protects your program from throwing a `NumberFormatException`.
* GAUSS' REASONING VS XOR APPROACH: Summation runs in perfect $O(N)$ time with 
  $O(1)$ space. Alternatively, an XOR-based strategy can be used to prevent 
  arithmetic overflow completely without converting to `long`.
* LINE EXTRACTION SEPARATION: Always verify you have cleared input stream lines 
  using an empty `sc.nextLine()` execution whenever integer tokens precede string lines.

==========================================================================
COMMON BEGINNER MISTAKES
========================
1. Nested-Loop Time Out (TLE): Writing a brute-force search that checks every number 
   from $1$ to $N$ against all elements in the array. This creates an $O(N^2)$ running 
   time that times out on large inputs ($10^5$).
2. Integer Precision Overflow: Storing the outcome of `n * (n + 1)` within a regular 
   32-bit `int` variable, leading to numeric truncation and incorrect output results.
3. Crashing on Extra Input Delimiters: Relying strictly on `sc.nextInt()` inside a loop 
   when the input stream contains unexpected trailing characters, commas, or structural symbols.
4. Input Buffer Skipping: Omitting the buffer-flushing `sc.nextLine()` step after 
   capturing the array size `n`, which causes the program to process an empty line.

==========================================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
================================================
"To optimize the initial $O(N^2)$ brute-force solution, I updated the logic to 
leverage an optimal mathematical summation approach that runs in linear time. 

Since the array represents a sequence of continuous integers from $1$ to $N+1$ 
with exactly one missing value, we can mathematically determine what the complete 
sum should be using Gauss' identity formula, `(N * (N + 1)) / 2`. By running a single linear 
scan across the array, we accumulate the actual observed sum of its elements. The difference 
between the expected mathematical sum and the actual observed sum isolated the missing value 
in $O(N)$ time and $O(1)$ auxiliary space.

To guarantee production safety under competitive environments like TCS NQT, I utilized 
`long` variables to completely guard against integer overflow. I also added text-cleaning 
mechanisms to filter out random syntax brackets or commas from the standard input stream."

==========================================================================
TIME COMPLEXITY & SPACE COMPLEXITY
==================================
* TIME COMPLEXITY: $O(N)$ - The algorithm performs a single, sequential pass 
  across the input collection array to compute the total sum, matching linear scale limits.
* SPACE COMPLEXITY: $O(1)$ - The optimization handles all calculations directly 
  using simple numerical registers (`expectedSum`, `actualSum`), avoiding any 
  additional memory overhead.

==========================================================================
INTERVIEW QUICK ANSWER
======================
Q: How does using Gauss' formula prevent a Time Limit Exceeded (TLE) exception here?
A: The brute force approach checks every integer against the array via nested loops, 
   requiring $O(N^2)$ operations. Gauss' formula finds the target sum in $O(1)$ time, 
   reducing the total array processing loop to a single linear scan of $O(N)$.

Q: What happens if you do not use a `long` data type for calculating the expected sum when N is large?
A: If $N = 10^5$, computing $N \times (N + 1)$ yields approximately $10^{10}$, 
   which exceeds the maximum capacity of a 32-bit signed integer ($2,147,483,647$). 
   This causes an arithmetic overflow, resulting in incorrect negative values.

Q: Can this problem be solved without any risk of integer overflow while keeping O(1) space?
A: Yes, by using the bitwise XOR operator. You can XOR all numbers from $1$ to $N+1$ 
   and then XOR that result with all elements present in the array. The final remaining 
   value is the missing integer, since identical bits cancel each other out ($X \oplus X = 0$).
*/
