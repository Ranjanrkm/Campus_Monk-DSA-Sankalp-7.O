import java.util.*;
public class MaxMin {
    public static void max_min(int num){
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        while(num != 0){
            int rem = num % 10;
            maxi = Math.max(maxi, rem);
            mini = Math.min(mini, rem);
            num /= 10;
        }
       System.out.println(maxi+" "+mini); 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        max_min(num);
        sc.close();
    }
}