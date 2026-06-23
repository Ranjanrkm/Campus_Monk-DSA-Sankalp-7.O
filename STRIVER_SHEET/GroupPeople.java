
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// The Solution class containing our HashMap logic
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];

            if (!map.containsKey(size)) {
                map.put(size, new ArrayList<>());
            }

            map.get(size).add(i);

            if (map.get(size).size() == size) {
                result.add(new ArrayList<>(map.get(size)));
                map.get(size).clear();
            }
        }

        return result;
    }
}

// The public driver class. The file MUST be named GroupPeople.java
public class GroupPeople {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] test1 = {3, 3, 3, 3, 3, 1, 3};
        System.out.println("Test 1:");
        System.out.println("Input: groupSizes = [3, 3, 3, 3, 3, 1, 3]");
        System.out.println("Output: " + solution.groupThePeople(test1));
        System.out.println("Expected (order may vary): [[5], [0, 1, 2], [3, 4, 6]]\n");

        // Example 2
        int[] test2 = {2, 1, 3, 3, 3, 2};
        System.out.println("Test 2:");
        System.out.println("Input: groupSizes = [2, 1, 3, 3, 3, 2]");
        System.out.println("Output: " + solution.groupThePeople(test2));
        System.out.println("Expected (order may vary): [[1], [0, 5], [2, 3, 4]]");
    }
}