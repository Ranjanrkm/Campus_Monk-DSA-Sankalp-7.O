import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }
        
        System.out.println(minCostClimbingStairs(cost));
        sc.close();
    }
    
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        // Cost to reach index 0 and 1 is 0 as we can start there
        int first = 0; 
        int second = 0;
        
        for (int i = 2; i <= n; i++) {
            int current = Math.min(second + cost[i - 1], first + cost[i - 2]);
            first = second;
            second = current;
        }
        
        return second;
    }
}