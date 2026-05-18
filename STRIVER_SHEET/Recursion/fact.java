import java.util.*;
public class fact {
    public static int factn(int n) {
        if(n == 0) return 1;
        return n * factn(n - 1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which u want to calculate the factorial : ");
        int n = sc.nextInt();
        int result = factn(n);
        System.out.println("Factorial of "+n+" is : "+result);
        sc.close();
    }
}