import java.util.*;
public class yr{
    public static boolean leapyr(int n) {
        if(n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(leapyr(n)){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
        
        sc.close();
    }
}