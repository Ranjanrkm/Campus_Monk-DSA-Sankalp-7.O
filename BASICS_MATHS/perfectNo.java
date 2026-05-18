import java.util.*;
public class perfectNo{

    public static boolean isPerfect(int n) {
        int sum = 1; 
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                sum += i;
                if(n/i != i){
                    sum += n/i;
                }
            }
        }
        if(sum == n) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(isPerfect(n)) {
            System.out.println(n+" : is a perfect number");
        } else {
            System.out.println(n+" : is not a perfect number");
        }


        sc.close();
    }
}
