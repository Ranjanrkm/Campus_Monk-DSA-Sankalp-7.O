import java.util.*;
public class Missing {
    public static int miss1(int[] arr) {
        int n = arr.length;
        int totalNum = n + 1;
        int expectedSum = (totalNum * (totalNum + 1)) / 2;

        int actualSum = 0;
        for(int num : arr){
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
    public static int miss2(int[] arr) {
        int n = arr.length;
        int xorResult = 0;

        for(int i = 1; i <= n + 1; i++){
            xorResult = xorResult ^ i;
        }

        for(int num : arr) {
            xorResult = xorResult ^ num;
        }

        return xorResult;
        
    }
    public static int miss3(int[] arr) {
        int n = arr.length;
        boolean[] isPresent = new boolean[n + 2];

        for(int num : arr) {
            isPresent[num] = true;
        }
        
        for(int i = 1; i <= n + 1; i++){
            if(!isPresent[i]) {
                return i;
            }
        }

        return -1;
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
        int ans1 = miss1(arr);
        System.out.println(ans1);

        int ans2 = miss2(arr);
        System.out.println(ans2);

        int ans3 = miss3(arr);
        System.out.println(ans3);

        sc.close();
    }
}