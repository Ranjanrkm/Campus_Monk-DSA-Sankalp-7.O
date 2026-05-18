import java.util.*;
public class Prime {
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        int cnt = 0;
        for(int i = 1; i * i <= n; i++){
            if(n % i == 0){
                cnt++;
            }
        }

        if(cnt >= 2){
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = isPrime(num);
        System.out.println(ans);
        sc.close();
    }
}

