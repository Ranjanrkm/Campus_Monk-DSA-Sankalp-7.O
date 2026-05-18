import java.util.*;
public class sumn {
    public static int sum(int n) {
        if(n < 1) return 0;
        return n + sum(n-1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number upto which u want to sum : ");
        int n = sc.nextInt();
        int totalsum = sum(n);
        System.out.println("Sum of 1st " + n + " number is : " +totalsum);
        sc.close();
    }
}