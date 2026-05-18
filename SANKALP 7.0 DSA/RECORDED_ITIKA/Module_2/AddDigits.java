import java.util.*;
public class AddDigits {
    public static int sum_digits(int num){
        int sum = 0;
        while(num != 0){
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int ans = sum_digits(num);
       System.out.println(ans);
       sc.close();
    }
}