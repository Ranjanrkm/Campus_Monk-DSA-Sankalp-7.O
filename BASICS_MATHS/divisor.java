import java.util.*;
public class divisor {
    public static void Alldivisor(int n){
        for(int i = 1; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.print(i +" ");
                if(i != n/i){
                    System.out.print(n/i+" ");
                }
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        Alldivisor(n);
        sc.close();
    }
}