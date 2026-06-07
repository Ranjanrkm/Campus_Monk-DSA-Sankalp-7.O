/*
==========================================
1. Problem Statement
==========================================
Given a single line of input representing an array whose size is unknown, 
parse and clean the input string to extract all valid integers. The input 
could optionally arrive enclosed in brackets (e.g., `[1 2 3 4 5]`). 
The program must safely clean any formatting tokens, transform the data 
into a strongly typed integer list, and output the elements separated 
by exactly one space with no trailing whitespace, adhering strictly to 
the competitive programming guidelines used by online automated judges 
such as TCS NQT.

==========================================
2. Input Format
==========================================
- A single line of text containing space-separated integers, which may 
  optionally be enclosed inside brackets `[` and `]` (e.g., `[1 2 3 4 5]` or `1 2 3 4 5`).

==========================================
3. Output Format
==========================================
- A single line of space-separated integers matching the parsed list.
- Critical Rule: The output must contain NO trailing whitespace at the very end of the line.

==========================================
4. Multiple Dry Run Examples
==========================================
Example 1: Bracket Enclosed Input
Input:
[10 20 30]

Working:
1. input = "[10 20 30]"
2. Condition (input.startsWith("[") && input.endsWith("]")) is evaluated.
   - It matches true.
   - input = input.substring(1, 9 - 1) -> input becomes "10 20 30"
3. String arr[] = "10 20 30".split(" ");
   - arr = ["10", "20", "30"]
4. Token Loop starts:
   - token = "10" -> num = 10 -> ar.add(10)
   - token = "20" -> num = 20 -> ar.add(20)
   - token = "30" -> num = 30 -> ar.add(30)
5. Output String Generation:
   - Loop creates a space-delimited text layout.
   - .trim() wipes out the trailing space.
Output:
10 20 30

Example 2: Pure Space-Separated Input (No Brackets)
Input:
5 4 3

Working:
1. input = "5 4 3"
2. Bracket check condition evaluates to false. String remains "5 4 3".
3. String arr[] = "5 4 3".split(" ");
   - arr = ["5", "4", "3"]
4. Token Loop converts string elements to numbers safely.
   - ar = [5, 4, 3]
5. Elements are printed sequentially without a trailing whitespace.
Output:
5 4 3
*/

import java.util.Scanner;
import java.util.ArrayList;

public class inputArr_fth {

    public static void main(String[] args) {
        
        // Create Scanner object to read data from standard input stream.
        //
        // This listens to System.in (console buffer).
        // It strictly adheres to your PDF master guide rules 
        // by avoiding chatty console prompts.
        Scanner sc = new Scanner(System.in);

        // Safety verification to safeguard against empty streams.
        //
        // This validation check avoids exceptions when online
        // engines run silent automated edge-case test profiles.
        if (!sc.hasNextLine()) {
            sc.close();
            return;
        }

        // Read the complete text string present on the current line.
        //
        // Example Input:
        // [1 2 3 4 5]
        //
        // After execution:
        // input = "[1 2 3 4 5]"
        String input = sc.nextLine().trim();

        // Check whether the input string is structurally
        // wrapped inside square array brackets.
        //
        // If true, it strips out the boundaries using substring indexing.
        if (input.startsWith("[") && input.endsWith("]")) {
            
            // Extract the string segments sitting explicitly between indices 1 and length-1.
            //
            // Example:
            // "[1 2 3 4 5]" transforms to "1 2 3 4 5"
            input = input.substring(1, input.length() - 1).trim();
        }

        // Handle structural curly brackets or stray commas as well.
        //
        // This cleaning optimization extends your logic to match Case 2 
        // of the PDF guide, neutralizing characters like '{', '}', or ','.
        input = input.replace("{", "").replace("}", "").replace(",", " ");

        // Split the sanitized single line string into individual string tokens.
        //
        // Using regex pattern "\\s+" is a premium defense mechanism.
        // It treats consecutive blank spaces as a single delimiter branch.
        String[] arr = input.trim().split("\\s+");

        // Instantiate a dynamic integer list collection array.
        //
        // We use an ArrayList because the exact number of integers 
        // passing through the standard input stream is unquantified.
        ArrayList<Integer> ar = new ArrayList<>();

        // Iterate through every single isolated string block token
        // contained inside the split element sequence array.
        for (String token : arr) {
            
            // Check if the current token contains structural characters.
            //
            // This condition guards against exceptions when parsing strings
            // that contain accidental trailing or double blank elements.
            if (!token.isEmpty()) {
                
                // Parse the string slice representation into a primitive 32-bit integer.
                //
                // Example Transformation:
                // String token "12" -> int num = 12
                int num = Integer.parseInt(token);
                
                // Append the processed integer elements securely inside our collector.
                ar.add(num);
            }
        }

        // Use StringBuilder to optimize output stream assembly.
        //
        // This is highly recommended to manage performance and ensure zero 
        // trailing spaces at the terminal boundary of the print layout.
        StringBuilder sb = new StringBuilder();

        // Traverse the processed integer array collection starting
        // from index 0 up to the final size boundary limit.
        for (int i : ar) {
            
            // Concatenate each numerical primitive integer alongside a trailing blank space spacer.
            sb.append(i).append(" ");
        }

        // Print the finalized string back onto the standard console channel.
        //
        // Applying the .trim() function strips out the absolute final blank element spacer space.
        // This matches the exact strict layout required by automated evaluators.
        System.out.println(sb.toString().trim());

        // Terminate input streams completely.
        //
        // Good engineering discipline that ensures system resource streams 
        // close cleanly without risk of background context memory leaks.
        sc.close();
    }
}

/*
==========================================
6. IMPORTANT NOTES FOR REVISION
==========================================
* Hidden Interview Tricks: When an array input size is unknown, splitting by a single 
  space character (`.split(" ")`) is fragile. If the testing engine accidentally inputs 
  double spaces (e.g., `1  2   3`), the basic split creates empty string elements `""`. 
  Passing `""` into `Integer.parseInt()` triggers a `NumberFormatException` and crashes. 
  The fix is using the regex pattern `\\s+` which safely consolidates multiple spaces.
* PDF Formatting Rule: Notice the integration of `.replace(",", " ")`. As shown in Case 2 
  of your provided PDF notebook guides, inputs often arrive in varied layouts like `[1,2,3]` 
  or `{1, 2, 3}`. Pre-cleaning characters guarantees robustness across all automated platforms.
* The Trailing Space Trap: Many programmers output arrays inside loops using `System.out.print(i + " ")`. 
  This appends a trailing space to the final element (`"1 2 3 "`). Strict compilers will check 
  the exact character counts, flags, and trailing returns, penalizing presentation errors. 
  Using `StringBuilder` paired with `.trim()` before printing eliminates this risk.

==========================================
7. COMMON BEGINNER MISTAKES
==========================================
1. Relying on `sc.nextInt()` inside a continuous `while(sc.hasNextInt())` loop: If the entire 
   input sits on a single line, this can create scanning timeouts or infinity loops on platforms 
   that do not pass a clean EOF (End Of File) termination signal.
2. Direct splitting without trimming trailing whitespaces: Writing `input.split(" ")` when 
   the input string contains leading or trailing spaces creates garbage tokens that break parsing algorithms.
3. Forgetting the single quote parsing constraint on tokens: Missing token length validation 
   checks when double spaces occur, causing structural crashes via `NumberFormatException`.
4. Overlooking curly bracket configurations: Only validating `[` and `]` while failing when the 
   automated compiler decides to supply standard array formats wrapped inside `{` and `}` symbols.

==========================================
8. HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
==========================================
"To solve this problem where the dimension constraint of the incoming sequence is unquantified, 
I implemented a robust stream cleaning and parsing solution using the Scanner class. 
I avoid using sequential loops with `nextInt()` directly, as this pattern can cause processing 
timeouts or hang indefinitely if an automated judge omits an explicit End-Of-File marker. 

Instead, I isolate the complete console line at once using `sc.nextLine()`. I clean the text boundaries 
by checking for standard vector structures like square or curly brackets and strip them out. 
To convert this string into numerical components, I split the sanitized payload using a regex pattern 
of `\\s+`. This is an intentional engineering choice that ensures consecutive whitespaces are merged 
and do not generate corrupted empty tokens. 

I then iterate over the tokens, parse them into a dynamic `ArrayList`, and output the reconstructed 
sequence. To avoid presentation errors caused by trailing whitespace, I stream the response into a 
`StringBuilder` and print its fully trimmed variant. This ensures complete safety across all hidden 
test environments."

==========================================
9. TIME COMPLEXITY & SPACE COMPLEXITY
==========================================
* Time Complexity: O(N)
  Why: Sanitizing the input string, performing regular expression string splits, and 
  looping over the tokens to populate the integer collection all take linear time relative 
  to the total number of characters and elements $N$ passed in the line.

* Space Complexity: O(N)
  Why: We allocate dynamic heap memory for the token array `String[] arr` and the structural 
  collection `ArrayList<Integer> ar` to track and collect all data entries sequentially.

==========================================
10. INTERVIEW QUICK ANSWER
==========================================
Q: Why do we choose `sc.nextLine()` instead of looping over `sc.nextInt()` when array size is hidden?
Answer:
Because loop evaluations with `nextInt()` can get stuck or throw parsing exceptions if the standard input stream contains unexpected formatting characters, trailing blanks, or lacks a definite EOF marker. `nextLine()` consumes the line completely, isolating input logic safely.

Q: What does the regular expression pattern `\\s+` achieve inside the split function?
Answer:
It acts as a delimiter pattern matching one or more consecutive whitespace characters. This guarantees that accidental double or triple spacing within the text string does not produce empty string tokens that break parsing logic.

Q: How do you handle varied array notation schemas like `[1, 2, 3]` vs `{1, 2, 3}`?
Answer:
By checking structural string metrics via `startsWith()` and `endsWith()`, then executing programmatic strip routines using `substring()` and global chain modifications with character replacements (`.replace()`) to clean out braces and commas before token execution.

Q: Why do we route the output sequence assembly through a `StringBuilder`?
Answer:
Because performing repeated string concatenations inside a loop creates multiple short-lived string objects in memory. `StringBuilder` optimizes performance to O(1) per append operation, and allows us to easily strip out trailing presentation elements using `.trim()`.
*/