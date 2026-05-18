import java.util.*;

public class StreamOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()) {
            list.add(sc.nextInt());
        }

        for(int i : list) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
