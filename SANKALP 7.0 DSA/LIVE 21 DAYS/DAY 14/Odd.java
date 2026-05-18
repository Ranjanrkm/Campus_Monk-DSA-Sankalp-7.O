import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // TCS NQT strings can be long, but sc.next() handles single words well
        if (!sc.hasNext()) {
            sc.close();
            return;
        }
        
        String num = sc.next();
        System.out.println(getLargestOdd(num));
        
        sc.close();
    }

    public static String getLargestOdd(String num) {
        // Iterate from right to left to find the first odd digit
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';
            
            // Check if the digit is odd
            if (digit % 2 != 0) {
                // Return substring from index 0 to i
                return num.substring(0, i + 1);
            }
        }
        // No odd digit found
        return "";
    }
}