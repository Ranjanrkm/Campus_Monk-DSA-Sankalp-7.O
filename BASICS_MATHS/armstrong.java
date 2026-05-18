import java.util.*;
public class armstrong{

    public static boolean isArmstrong(int n){
        // int cnt = 0;
        int temp = n;
        // while(temp != 0){
        //     cnt++;
        //     temp/=10;
        // }
        int cnt = String.valueOf(temp).length();
        int sum = 0;
        temp = n;
        while(temp != 0){
            int ld = temp % 10;
            sum = sum + (int)Math.pow(ld , cnt);
            temp/= 10;
        }
        if(sum == n) {
            return true;
        } else {
        return false;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isArmstrong(n)) {
            System.out.println("Yes it's an armstrong number");
        } else {
            System.out.println("No it's not a armstrong number");
        }
        sc.close();
    }
}
