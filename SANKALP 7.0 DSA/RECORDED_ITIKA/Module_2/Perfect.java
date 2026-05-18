import java.util.*;
public class Perfect {

    public static boolean isPerfect(int n){
        int sum = 1;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) {
                sum += i;
                if(n/i != i){
                    sum += n/i;
                }
            }
        }
        System.out.println(sum);
        // if(sum == n) {
        //     return true;
        // } else {
        //     return false;
        // }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
     
        if(isPerfect(num)){
            System.out.println("Yes it perfect");
        } else {
            System.out.println("No its not perfect");
        }
        sc.close();
    }
}