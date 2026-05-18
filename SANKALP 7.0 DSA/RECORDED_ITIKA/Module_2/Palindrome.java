import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(int num){
        int n = num;
        int rev = 0;
        while(num != 0){
            int ld = num % 10;
            rev = rev * 10 + ld;
            num /= 10;
        }
        return rev == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean res = isPalindrome(num);
        System.out.println(res);
        sc.close();
    }
}

