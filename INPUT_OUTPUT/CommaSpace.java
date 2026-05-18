import java.util.*;

public class CommaSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replaceAll(","," ");
        String[] tokens = input.split("\\s+");
        ArrayList<Integer> arr = new ArrayList<>();
        for(String i : tokens){
            arr.add(Integer.parseInt(i.trim()));
        }
        for(int x : arr) {
            System.out.print(x+" ");
        }
        sc.close();
    }
}
