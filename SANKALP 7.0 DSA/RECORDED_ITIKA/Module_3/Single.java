import java.util.*;
public class Single {
    public static int find1(int[] arr) {
        int n = arr.length;
        if(n == 1) {
            return arr[0];
        }
        for(int i = 0; i < n; i++) {
            if(i == 0) {
                if(arr[i] != arr[i + 1]) {
                    return arr[i];
                }
            }
            else if(i == n - 1) {
                if(arr[i] != arr[i - 1]){
                    return arr[i];
                }
            } else {
                if((arr[i] != arr[i - 1]) && (arr[i] != arr[i + 1])){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static int find2(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans = ans ^ arr[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            // sc.nextLine();
        }
        int ans1 = find1(arr);
        System.out.println(ans1);

        int ans2 = find2(arr);
        System.out.println(ans2);

        sc.close();
    }
}