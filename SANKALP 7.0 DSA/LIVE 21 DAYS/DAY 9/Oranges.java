import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Oranges {
    
    public static int orangesRotting(int[][] grid) {
        // Edge case check
        if (grid == null || grid.length == 0) return 0;
        
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int count_fresh = 0;
        
        // Step 1: Scan the grid. Put all initially rotten oranges in the queue, count fresh ones.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    count_fresh++;
                }
            }
        }
        
        // Step 2: If there are zero fresh oranges to begin with, the answer is 0 minutes.
        if (count_fresh == 0) return 0;
        
        int minutes = 0;
        // Directional array to easily move: right, left, down, up
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        
        // Step 3: Start the Breadth-First Search (BFS)
        while (!queue.isEmpty()) {
            int size = queue.size(); // Number of rotten oranges currently acting in this minute
            
            for (int i = 0; i < size; i++) {
                int[] point = queue.poll();
                
                // Check all 4 directions around the current rotten orange
                for (int[] dir : dirs) {
                    int x = point[0] + dir[0];
                    int y = point[1] + dir[1];
                    
                    // If out of bounds OR if the cell is NOT a fresh orange, skip it.
                    if (x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] != 1) {
                        continue;
                    }
                    
                    // It is a fresh orange! Make it rotten.
                    grid[x][y] = 2;
                    queue.offer(new int[]{x, y}); // Add to queue so it can rot others next minute
                    count_fresh--; // Decrease our fresh count
                }
            }
            
            // If we added new rotten oranges to the queue, a minute has passed.
            if (!queue.isEmpty()) {
                minutes++;
            }
        }
        
        // Step 4: If we finished the BFS but fresh oranges are left over, return -1.
        return count_fresh == 0 ? minutes : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        
        System.out.println(orangesRotting(grid));
        sc.close();
    }
}