
import java.util.*;
public class FactPrime {
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void prime_factors(int n){
        for(int i = 1; i * i <= n; i++){
            if(n % i == 0 && isPrime(i)) {
                System.out.print(i+" ");
                if(n/i != i && isPrime(n/i)){
                    System.out.print(n/i+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime_factors(n);
        sc.close();
    }
}
