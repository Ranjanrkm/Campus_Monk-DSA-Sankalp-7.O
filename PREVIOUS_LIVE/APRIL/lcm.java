import java.util.*;
public class lcm{
    public static int GCD(int n1 , int n2) {
        while(n1 > 0 && n2 > 0){
            if(n1 > n2) {
                n1 %= n2;
            } else {
                n2 %= n1;
            }
        }
        return (n1 == 0) ? n2 : n1;
    }
    public static int LCM1(int n1 , int n2){
        int gcd = GCD(n1 , n2);
        int LCM = (n1 * n2) / gcd;
        return LCM;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int ans1 = LCM1(n1 , n2);
        System.out.println(ans1);
        sc.close();
    }
}