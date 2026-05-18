import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String goal = sc.next();

        if (s.length() != goal.length()) {
            System.out.println("false");
        } else {
            String doubled = s + s;
            System.out.println(doubled.contains(goal));
        }

        sc.close();
    }
}