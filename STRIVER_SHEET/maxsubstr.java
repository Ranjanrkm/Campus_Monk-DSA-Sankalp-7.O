import java.util.HashSet;

// The Solution class containing the sliding window logic
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        HashSet<Character> window = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (window.contains(s.charAt(right))) {
                window.remove(s.charAt(left));
                left++;
            }
            window.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

// The public class name MUST match the file name: maxsubstr.java
public class maxsubstr {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases from the LeetCode problem description
        String test1 = "abcabcbb";
        String test2 = "bbbbb";
        String test3 = "pwwkew";

        // Run the tests and print the results
        System.out.println("Testing Longest Substring Without Repeating Characters:\n");
        
        System.out.println("Input: s = \"" + test1 + "\"");
        System.out.println("Output: " + solution.lengthOfLongestSubstring(test1));
        System.out.println("Expected: 3\n");

        System.out.println("Input: s = \"" + test2 + "\"");
        System.out.println("Output: " + solution.lengthOfLongestSubstring(test2));
        System.out.println("Expected: 1\n");

        System.out.println("Input: s = \"" + test3 + "\"");
        System.out.println("Output: " + solution.lengthOfLongestSubstring(test3));
        System.out.println("Expected: 3\n");
    }
}