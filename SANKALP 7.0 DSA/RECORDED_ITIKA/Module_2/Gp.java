import java.util.*;
public class Gp {

    public static void print_gp(int a, int r, int n){
        for(int i = 1; i <= n; i++){
            
            
            int temp = a *(int)Math.pow(r,i - 1);
            System.out.print(temp+" ");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        sc.nextLine();
        int r = sc.nextInt();
        sc.nextLine();
        int num = sc.nextInt();
     
        print_gp(a, r, num);
        sc.close();
    }
}