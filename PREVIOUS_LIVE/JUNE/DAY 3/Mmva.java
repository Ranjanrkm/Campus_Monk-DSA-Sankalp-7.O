import java.util.*;
public class Mmva {

    public static int majority(int[] arr) {
        int n = arr.length;
        int ele = 0;
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(cnt == 0) {
                ele = arr[i];
                cnt = 1;
            } else if(ele == arr[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }
        cnt = 0;
        for(int i = 0; i < n; i++) {
            if(ele == arr[i]) {
                cnt++;
            }
        }
        if(cnt > (n/2)) {
            return ele;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
           arr[i] = sc.nextInt(); 
        }
        int ans = majority(arr);
        System.out.println(ans);
        sc.close();
    }
}