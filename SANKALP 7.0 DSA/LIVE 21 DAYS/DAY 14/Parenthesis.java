import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Check if there is input available
        if (!sc.hasNext()) {
            sc.close();
            return;
        }
        
        String s = sc.next();
        
        // Call the validation method
        if (isValid(s)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        sc.close();
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                // If we hit a closing bracket and stack is empty, it's invalid
                if (stack.isEmpty()) return false;
                
                char top = stack.pop();
                // Check for mismatched pairs
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }
        // If stack is empty, all pairs matched correctly
        return stack.isEmpty();
    }
}