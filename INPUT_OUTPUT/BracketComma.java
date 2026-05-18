import java.util.*;

public class BracketComma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        if((input.startsWith("{") && input.endsWith("}")) || input.startsWith("[") && input.endsWith("]")) {
            input = input.substring(1, input.length() - 1);
        }
        String[] tokens = input.split(",");
        ArrayList<Integer> arr = new ArrayList<>();
        for(String i : tokens) {
            arr.add(Integer.parseInt(i.trim()));
        }

        System.out.println(arr);

        for(int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        sc.close();
    }
}
