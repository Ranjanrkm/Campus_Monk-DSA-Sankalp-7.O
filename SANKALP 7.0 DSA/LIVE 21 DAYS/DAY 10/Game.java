import java.io.*;
import java.util.StringTokenizer;
public class Game {
    public static int Jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for(int i= 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if(i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
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
            System.out.println(Jump(nums));
        }
    }
}
