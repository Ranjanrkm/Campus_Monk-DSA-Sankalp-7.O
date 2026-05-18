import java.util.*;
public class Color {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] B = new String[n];
        for(int i = 0; i < n; i++) {
            B[i] = sc.nextLine().trim();
        }
        Map<String,Integer> colorCount = new LinkedHashMap<>();

        for(String color : B) {
            colorCount.put(color,colorCount.getOrDefault(color , 0) + 1);
        }
        boolean foundOdd = false;
        for(Map.Entry<String,Integer> entry : colorCount.entrySet()) {
            if(entry.getValue() % 2 != 0) {
                System.out.println(entry.getKey());
                foundOdd = true;
                break;
            }
        }
        if(!foundOdd) {
            System.out.println("All are even");
        }

        sc.close();
    }
}