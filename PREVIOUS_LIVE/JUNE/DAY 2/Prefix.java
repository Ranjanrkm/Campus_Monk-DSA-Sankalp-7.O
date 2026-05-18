import java.util.*;
public class Prefix {
    public static String longestCommonPrefix(List<String> str) {
    if(str.isEmpty()) return "";
    Collections.sort(str);
    String first = str.get(0);
    String last = str.get(str.size() - 1);
    int minLength = Math.min(first.length() , last.length());
    StringBuilder ans = new StringBuilder();
    for(int i = 0; i < minLength; i++) {
        if(first.charAt(i) != last.charAt(i)) {
            return ans.toString();
        }
        ans.append(first.charAt(i));
    }
    return ans.toString();

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr.add(sc.next());
        }
        String ans = longestCommonPrefix(arr);
        System.out.println(ans);
        sc.close();
    }
}