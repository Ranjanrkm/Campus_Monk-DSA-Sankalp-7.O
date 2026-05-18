import java.util.*;
public class gcd{
    public static int GCD1(int n1 , int n2) {
        int gf = 1;
        for(int i = Math.min(n1 , n2); i >= 1; i--) {
            if(n1 % i == 0 && n2 % i == 0) {
                gf = i;
                break;
            }
        }
        return gf;
    }

    public static int GCD2(int n1 , int n2) {
        while(n1 > 0 && n2 > 0) {
            if(n1 > n2) {
                n1 %= n2;
            } else {
                n2  %= n1;
            }
        }
        return (n1 == 0) ? n2 : n1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int ans1 = GCD1(n1 , n2);
        System.out.println(ans1);
        int ans2 = GCD2(n1 , n2);
        System.out.println(ans2);
        sc.close();
    }
}