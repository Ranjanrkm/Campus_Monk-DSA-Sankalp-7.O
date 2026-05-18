import java.util.*;
public class palindrome {
    public static boolean isPalindrome(int n){
        int num = n;
        int reverse = 0;
        while(n != 0){
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n /= 10;
        }
        if(reverse == num){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(isPalindrome(n)){
            System.out.println("Yes");
        } else {
            System.out.println("no");
        }
        sc.close();
    }
}
