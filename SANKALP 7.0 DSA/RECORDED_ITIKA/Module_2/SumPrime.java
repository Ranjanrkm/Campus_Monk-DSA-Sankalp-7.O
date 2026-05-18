import java.util.*;
public class SumPrime {

    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static boolean sum_prime(int num){
        for(int i = 1; i < num; i++) {
            if(isPrime(i) && isPrime(num - i)) {
                System.out.println(i+" "+(num - i));
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(sum_prime(num)){
            System.out.println("yes possible");
        } else {
            System.out.println("no not possible");
        }

        sc.close();
    }
}

