import java.util.*;
public class gp {
    public static void gp_series(int a , int r , int m) {
        for(int i = 1; i<=m; i++){
            int temp = a * (int)Math.pow(r , (i-1));
            System.out.print(temp+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        int r = sc.nextInt();
        sc.nextLine();
        int m = sc.nextInt();
        gp_series(a , r, m);

        sc.close();
    }
}