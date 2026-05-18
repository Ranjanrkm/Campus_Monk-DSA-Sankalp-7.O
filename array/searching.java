import java.util.*;
public class searching {
    public static int Linear_Search(int[] arr , int target){
        int index = -1;
        for(int i = 0; i < arr.length; i++) {
            if(target == arr[i]) {
                return i;
            }
        }
        return index;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10 , 20 , 30 , 55 , 10 , 20 , 3 , 4};
        int target = sc.nextInt();
        int ans = Linear_Search(arr , target);
        System.out.println(ans);
    }
}
