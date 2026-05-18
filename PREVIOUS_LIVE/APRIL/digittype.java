import java.util.*;
public class digittype{
    public static boolean palindrome(int n) {
        // if(n < 0) return false;
        int rev = 0;
        int orginal = n;
        while(n > 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n /= 10;
        }
        // if(orginal == rev) {
        //     return true;
        // }

        // return false;
        return orginal == rev;
    }

    public static int maxD(int n){
         n = Math.abs(n);
        int max = 0;
        while(n != 0) {
            int ld = n % 10;
            if(max < ld){
                max = ld;
            }
            n /= 10;
        }
        return max;
    }

    public static boolean prime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans1 = palindrome(n);
        System.out.println(ans1);

        int ans2 = maxD(n);
        System.out.println(ans2);
        boolean ans3 = prime(n);
        System.out.println(ans3);
        sc.close();

    }
}