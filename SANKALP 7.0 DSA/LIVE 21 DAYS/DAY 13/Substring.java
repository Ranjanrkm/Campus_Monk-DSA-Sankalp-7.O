import java.util.Scanner;

public class Substring {
    public static int numberOfSubstrings(String s) {
        int lastA = -1, lastB = -1, lastC = -1;
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a') lastA = i;
            else if (ch == 'b') lastB = i;
            else if (ch == 'c') lastC = i;
            
            // The number of valid substrings ending at i is 
            // determined by the smallest index among last seen a, b, and c.
            int minIndex = Math.min(lastA, Math.min(lastB, lastC));
            count += (minIndex + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String s = sc.next();
            System.out.println(numberOfSubstrings(s));
        }
        sc.close();
    }
}