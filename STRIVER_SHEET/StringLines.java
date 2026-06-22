import java.util.Arrays;

// --- THIS IS THE SOLUTION CLASS ---
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        
        int lines = 1;
        int currentLineWidth = 0;
        
        for (char c : s.toCharArray()) {
            
            int charWidth = widths[c - 'a'];
            
            if (currentLineWidth + charWidth > 100) {
                lines++; 
                currentLineWidth = charWidth; 
            } else {
                currentLineWidth += charWidth;
            }
        }
        
        return new int[] {lines, currentLineWidth};
    }
}

// --- NEW CLASS NAME ---
// Because this class is named StringLines, your file MUST be named StringLines.java
public class StringLines {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        int[] widths1 = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        int[] result1 = solution.numberOfLines(widths1, s1);
        System.out.println("Result 1: " + Arrays.toString(result1)); 
        // Expected: [3, 60]

        // Test Case 2
        int[] widths2 = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s2 = "bbbcccdddaaa";
        int[] result2 = solution.numberOfLines(widths2, s2);
        System.out.println("Result 2: " + Arrays.toString(result2)); 
        // Expected: [2, 4]
    }
}