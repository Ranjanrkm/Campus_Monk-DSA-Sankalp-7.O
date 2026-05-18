import java.util.*;

public class Combination {
    // Global mapping array for digit to letters
    static final String[] KEYPAD = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static void main(String[] args) {
        // Initialize Scanner for reading standard input
        Scanner sc = new Scanner(System.in);
        
        // Read the input if it exists
        if(sc.hasNextLine()) {
            String digits = sc.nextLine().trim();
            
            // Get the combinations
            List<String> combinations = letterCombinations(digits);
            
            // Print output as space-separated values (common competitive programming format)
            for(String combo : combinations) {
                System.out.print(combo + " ");
            }
        }
        sc.close();
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        // Handle edge case: empty input
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        
        // Start backtracking from index 0 with an empty StringBuilder
        backtrack(result, digits, new StringBuilder(), 0);
        return result;
    }

    private static void backtrack(List<String> result, String digits, StringBuilder currentCombination, int index) {
        // Base case: if current index reaches the end of digits string
        if (index == digits.length()) {
            result.add(currentCombination.toString());
            return;
        }

        // Get the letters corresponding to the current digit
        char currentDigit = digits.charAt(index);
        String letters = KEYPAD[currentDigit - '0'];

        // Iterate through all letters mapped to the current digit
        for (char c : letters.toCharArray()) {
            // Choose a letter
            currentCombination.append(c);
            
            // Explore further digits
            backtrack(result, digits, currentCombination, index + 1);
            
            // Backtrack: Undo the choice to explore other letters
            currentCombination.deleteCharAt(currentCombination.length() - 1);
        }
    }
}