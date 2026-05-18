import java.util.*;
public class perfect{
    public static boolean pNo(int n) {
        if(n <= 1) return false;
        int sum = 0;
        int copy = n;
        for(int i = 1; i <= (int)Math.sqrt(n); i++) {
            if(n % i == 0) {
                sum += i;
            }
            if(n / i != n && i != n / i) {
                sum += n / i;
            }
        }

        return sum == copy;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(pNo(n)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}