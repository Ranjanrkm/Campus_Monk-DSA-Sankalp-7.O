import java.util.*;

public class Interning {
    public static void main(String[] args) {
        String s = "Hello"; // -> Heylo
        // String x = "Hello";
        // x = "Mello";
        s = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);
    }
}
