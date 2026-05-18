import java.util.*;
public class Ndigit{
    public static int cnt1(int n) {
        if(n == 0) return 1;
        int digit = 0;
        while(n != 0) {
            n/=10;
            digit++;

        }
        return digit;
    }
    public static int cnt2(int n) {
        if(n == 0) return 1;
        int digit = (int)Math.log10(Math.abs(n)) + 1;
        return digit;
    }
  
    public static int odddigi(int n) {
        if(n == 0) return 1;
        int digit = 0;
        while(n != 0) {
            int ld = n % 10;
            n/=10;
            if(ld % 2 != 0){
            digit++;
            }

        }
        return digit;
    }
    public static int reverse(int n) {
       
        int rev = 0;
        while(n != 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n/=10;


        }
        return rev;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans1 = cnt1(n);
        System.out.println(ans1);
        int ans2 = cnt2(n);
        System.out.println(ans2);
        int ans3 = odddigi(n);
        System.out.println(ans3);
        int ans4 = reverse(n);
        System.out.println(ans4);

        sc.close();
    }
}