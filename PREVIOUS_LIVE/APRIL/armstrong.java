import java.util.*;
public class armstrong{
    // public static int count(int n) {
    //     int cnt = 0;
    //     while(n != 0) {
    //         n /= 10;
    //         cnt++;
    //     }
    //     return cnt;
    // }

    public static int count(int n) {
        return (int)Math.log10(n) + 1;
    }

    public static boolean arms(int n) {
        int copy = n;
        int digit = count(n);
        int sum = 0;
        while(n != 0) {
            int ld = n % 10;
            sum = sum + (int)Math.pow(ld , digit);
            n /= 10;
        }

        return sum == copy;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arms(n);
        if(arms(n)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}
