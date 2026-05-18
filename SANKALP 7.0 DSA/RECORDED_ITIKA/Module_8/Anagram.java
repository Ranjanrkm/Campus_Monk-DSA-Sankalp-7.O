import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        if (s.length() != t.length()) {
            System.out.println(false);
        } else {
            int[] freq = new int[26];

            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
                freq[t.charAt(i) - 'a']--;
            }

            boolean isAnagram = true;

            for (int i = 0; i < 26; i++) {
                if (freq[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }

            System.out.println(isAnagram);
        }

        sc.close();
    }
}