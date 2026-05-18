import java.io.*;
import java.util.StringTokenizer;
public class Jump {
    public static boolean canJump(int[] nums) {
        int maxReach = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);

            if(maxReach >= nums.length - 1) {
                return true;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = br.readLine();
        if(firstLine != null && !firstLine.trim().isEmpty()) {
            int n = Integer.parseInt(firstLine.trim());
            int[] nums = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }
            System.out.println(canJump(nums));
        }
    }
}
