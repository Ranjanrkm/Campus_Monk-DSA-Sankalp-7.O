import java.util.*;
public class Armstrong {



    public static boolean isArmstrong(int num){

        // 1. -> find digits

        int n = num;
        int cnt = 0;
        while(n != 0){
            cnt++;
            n /= 10;
        }

        //each digit cnt pow and add sum

        int newNum = num;
        int sum = 0;
        while(num != 0){
            int ld = num % 10;
            sum += Math.pow(ld, cnt);
            num /= 10;
        }

        // if(sum == newNum){
        //     return true;
        // } 
        // return false;

        return sum == newNum;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isArmstrong(num)) {
            System.out.println("yes its an amstrong number");
        } else {
            System.out.println("no its not an amstrong no.");
        }

        sc.close();
    }
}

