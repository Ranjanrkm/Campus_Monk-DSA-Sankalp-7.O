import java.util.*;

public class BracketSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        if((input.startsWith("[") && input.endsWith("]")) || input.startsWith("{") && input.endsWith("}") ) {
            input = input.substring(1, input.length() - 1);
        }
        String[] tokens = input.split("\\s+");
        int[] arr = new int[tokens.length];
        for(int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i].trim());
        }

        for(int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.print(Arrays.toString(arr));
        sc.close();
    }
}
