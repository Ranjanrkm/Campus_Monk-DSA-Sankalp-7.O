import java.util.*;
public class rec_name {

    public static void name(int i , int n) {
        if(i > n) return;
        System.out.print("PRM"+" ");
        name(i + 1 , n);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many times tou want to print name : ");
        int n = sc.nextInt();
        name(1 , n);

        sc.close();
    }
}