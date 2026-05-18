import java.util.*;
public class primesum {
    public static boolean isPrime(int num){
        if(num<=1) return false;
        for(int i = 2; i<= Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean prime_Sum(int n){
        for(int i = 1; i<n; i++){
            if(isPrime(i) && isPrime(n - i)) {
                System.out.println(i+" "+(n-i));
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(prime_Sum(n)){
            System.out.println("Yes possibel");
        } else {
            System.out.println("Not possible");
        }

        sc.close();
    }
}
