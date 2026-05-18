import java.util.*;
public class Palindrome {

    public static boolean isPalindrome(String s) {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean ans = isPalindrome(s);
        if(ans){
            System.out.println("yes its an palindrome string");
        } else {
            System.out.println("no its not a palindrome string");
        }
        sc.close();
    }
}