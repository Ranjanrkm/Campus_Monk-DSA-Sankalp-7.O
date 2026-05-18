import java.util.Scanner;

public class Roman {
    
    // Helper function to map Roman characters to their integer values
    public static int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static int romanToInt(String s) {
        int sum = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            // Get the integer value of the current character
            int currentVal = getValue(s.charAt(i));
            
            // If we are not at the last character AND current value is less than the next value
            if (i < n - 1 && currentVal < getValue(s.charAt(i + 1))) {
                // It's a subtraction case (like IV or IX), so we SUBTRACT the current value
                sum -= currentVal;
            } else {
                // Otherwise, it's a normal addition case
                sum += currentVal;
            }
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String romanStr = sc.next();
        
        System.out.println(romanToInt(romanStr));
        sc.close();
    }
}