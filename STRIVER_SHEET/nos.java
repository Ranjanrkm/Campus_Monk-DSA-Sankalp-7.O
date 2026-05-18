import java.util.*;
public class nos {
    public static void Numbers(int i , int n) {
        if(i < 1) return;
        Numbers(i - 1 , n);
        System.out.print(i+" ");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("upto what number u want to print : ");
        int n = sc.nextInt();
        Numbers(n , n);

        sc.close();
    }
}
