import java.util.*;
public class Divisors {
    public static void divisor(int n) {
        for(int i = 1; i * i <= n; i++){
            if(n % i == 0){
                if(i != n/i){
                    System.out.print(i+" ");
                    System.out.print(n/i+" ");
                } else{
                    System.out.print(i);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        divisor(n);
        sc.close();
    }
}

