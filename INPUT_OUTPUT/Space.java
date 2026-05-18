import java.util.*;

public class Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] tokens = input.split("\\s+");
        int[] arr = new int[tokens.length];
        for(int i = 0; i < tokens.length; i++) {
            int num = Integer.parseInt(tokens[i].trim());
            arr[i] = num;
        }

        for(int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print(Arrays.toString(arr));
        sc.close();
    }
}