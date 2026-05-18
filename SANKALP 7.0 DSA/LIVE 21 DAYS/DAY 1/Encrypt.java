import java.util.*;
public class Encrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int key = sc.nextInt();
        if (key <= 0) {
            System.out.println("INVALID INPUT");
            sc.close();
            return;
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                char newchar = (char) (((ch - 'A' + key) % 26) + 'A');
                ans.append(newchar);
            } else if (ch >= 'a' && ch <= 'z') {
                char newchar = (char) (((ch - 'a' + key) % 26) + 'a');
                ans.append(newchar);
            } else if (ch >= '0' && ch <= '9') {
                char newchar = (char) (((ch - '0' + key) % 10) + '0');
                ans.append(newchar);
            } else {
                ans.append(ch);
            }
        }

        System.out.println(ans.toString());
        sc.close();
    }
}
