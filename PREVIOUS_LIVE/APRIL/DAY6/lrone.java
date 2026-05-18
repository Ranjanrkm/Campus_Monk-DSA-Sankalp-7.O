import java.util.*;
public class lrone{
    public static void Rotate(int[] nums) {
        int first = nums[0];
        for(int i = 0; i < nums.length - 1; i++){
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        Rotate(nums);

        for(int a : nums){
            System.out.print(a+" ");
        }
        sc.close();
    }
}