import java.util.Scanner;

public class Vowel {
    public static boolean halvesAreAlike(String s) {
        int n = s.length();
        int count = 0;
        String vowels = "aeiouAEIOU";
        
        // Loop through the first half
        for (int i = 0; i < n / 2; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }
        
        // Loop through the second half
        for (int i = n / 2; i < n; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count--;
            }
        }
        
        return count == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String s = sc.next();
            System.out.println(halvesAreAlike(s));
        }
        sc.close();
    }
}