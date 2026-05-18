import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ranjan");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(3,5); // 3 to 4 delete
        System.out.println(sb);
    }
}