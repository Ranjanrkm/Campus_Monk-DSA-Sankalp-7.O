import java.util.*;
public class prime {
    public static int isPrime(int n){
        int cnt = 0;
        for(int i = 1; i<=n; i++){
            if(n % i == 0){
                cnt++;
            }
        }
        return cnt;
        // if(cnt == 2){
        //     System.out.print("its a prime number");
        // } else {
        //     System.out.print("not a prime number");
        // }
    }

    public static void primeFactor(int n){
        for(int i = 1; i <=Math.sqrt(n); i++){
            if(n % i == 0 && isPrime(i) == 2){
                System.out.print(i+" ");
                if(i != n/i && isPrime(n/i) == 2){
                    System.out.print(n/i+" ");
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        primeFactor(n);
        sc.close();
    }
}
