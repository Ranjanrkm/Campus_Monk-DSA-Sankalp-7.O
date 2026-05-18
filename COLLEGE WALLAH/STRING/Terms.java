import java.util.*;
public class Terms {
    public static void main(String[] args) {
        String str = "Ranjan Mahato";
        System.out.println(str.contains("ahato"));
        System.out.println(str.startsWith("Ran"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        String s1 = "abc";
        String s2 = "def";
        System.out.println(s1.concat(s2));
    }
}