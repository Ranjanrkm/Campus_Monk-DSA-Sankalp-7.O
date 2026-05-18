import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
    
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Edge case: if the array is empty, return an empty list
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        // HashMap to group sorted strings (key) to their original strings (value list)
        Map<String, List<String>> map = new HashMap<>();
        
        // Loop through each string in the array
        for (String s : strs) {
            // Convert the string to a character array and sort it
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            
            // Convert the sorted character array back to a string to use as a key
            String keyStr = String.valueOf(charArray);
            
            // If the map doesn't have this key yet, add it with a fresh, empty list
            if (!map.containsKey(keyStr)) {
                map.put(keyStr, new ArrayList<>());
            }
            
            // Add the original unsorted string to the list for this key
            map.get(keyStr).add(s);
        }
        
        // Return all the grouped lists of anagrams
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        
        System.out.println(groupAnagrams(arr));
        sc.close();
    }
}