import java.util.*;
public class cpdn{
    public static int countP(int n){
        
        int cntp = 0;
        for(int i = 2; i <= n; i++){
            int cnt = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) cnt ++;
            }
            if(cnt == 2) cntp++;
        }
        return cntp;

    }
    public static void divisor(int n) {
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                System.out.print(i+" ");
            } 
            if(i != n/i) {
                System.out.print(n/i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans1 = countP(n);
        System.out.println(ans1);
        divisor(n);
       
        sc.close();
    }
}