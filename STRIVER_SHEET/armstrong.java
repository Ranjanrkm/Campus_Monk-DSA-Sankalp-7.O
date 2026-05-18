import java.util.*;
class armstrong {

    public static int Digits(int n) {
        int cnt = 0;
        while(n != 0){
            cnt++;
            n/=10;
        }
        return cnt;
    }
    public static boolean isArmstrong(int n) {
        int sum = 0;
        int cnt = Digits(n);
        int temp = n;
        while(n != 0){
            int ld = n % 10;
            sum = sum + (int)Math.pow(ld , cnt);
            n/=10;
        }
        return sum == temp;
    }

    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isArmstrong(n)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
    
}