
import java.util.*;
public class fact{
    public static long facto(int n) {
        long result = 1;
        for(int i = 2; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public static long factr(int n) {
        if(n == 0 || n == 1) return 1;
        return n * factr(n - 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n < 0){
            System.out.println("For negative number factorial is not defined.");
        } else {
            long ans1 = facto(n);
            long ans2 = factr(n);
        System.out.println(ans1);
        System.out.println(ans2);
            }


        sc.close();
    }
}