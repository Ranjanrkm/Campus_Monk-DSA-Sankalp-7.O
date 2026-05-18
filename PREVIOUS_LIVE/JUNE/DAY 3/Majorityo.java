import java.util.*;
public class Majorityo {
    public static int majorityE(int[] nums) {
        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num,0) + 1);

        }

        for(Map.Entry<Integer , Integer> entry : map.entrySet()) {
            if(entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int ans = majorityE(arr);

        System.out.println("The majority element is : "+ ans);
        sc.close();
    }
}