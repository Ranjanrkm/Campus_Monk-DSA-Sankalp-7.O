import java.util.*;
public class power{

    public static void expo(int n , int x) {
        int ans = 1;
        while(x > 0) {
            if(x % 2 == 1){
                ans *= n;
                x -= 1;
            } else {
                n *= n;
                x /= 2;
            }
        }
        System.out.println(ans);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int n = sc.nextInt();
        System.out.print("Enter power : ");
        int x = sc.nextInt();
        expo(n , x);

        sc.close();
    }
}