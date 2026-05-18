import java.util.*;
public class maxmin{

    public static void MaxMin(int n){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(n != 0){
            int lastDigit = n % 10;
            max = Math.max(lastDigit , max);
            min = Math.min(lastDigit , min);
            n /= 10;
        }
        System.out.println("Max is : "+max +" and Min is : "+min);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        MaxMin(n);

        sc.close();
    }
}