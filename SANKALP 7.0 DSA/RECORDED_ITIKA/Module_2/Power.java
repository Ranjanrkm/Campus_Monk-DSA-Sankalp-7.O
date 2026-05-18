import java.util.*;
public class Power {

    public static void power(int n, int x){
        int ans = 1;
        while(x > 0){
            if(x % 2 == 1){
                ans *= n;
                x = x - 1;
            } else {
                n *= n;
                x /= 2;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        power(n, x);
        sc.close();
    }
}