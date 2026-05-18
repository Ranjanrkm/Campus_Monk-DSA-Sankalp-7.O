import java.util.*;
public class Ap {

    public static void print_ap(int a, int d, int n){
        for(int i = 1; i <= n; i++){
            
            System.out.print(a+" ");
            a = a + d;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int d = sc.nextInt();
        int num = sc.nextInt();
        print_ap(a, d, num);
        sc.close();
    }
}
