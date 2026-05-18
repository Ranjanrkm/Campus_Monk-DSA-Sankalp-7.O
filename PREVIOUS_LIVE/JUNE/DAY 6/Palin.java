import java.util.*;
public class Palin {
    public static boolean palindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String args[]) {
        String str = "racecar";
        if(palindrome(str)) {
            System.out.println(str+ " is a palindrome.");
        } else {
            System.out.println(str+ " is not a palindrome");
        }
    }
}