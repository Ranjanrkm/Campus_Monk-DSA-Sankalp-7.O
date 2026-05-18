import java.util.Scanner;

public class Ecryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String plainText = sc.nextLine();

        System.out.println("Enter key value:");
        int key = sc.nextInt();

        if (key <= 0) {
            System.out.println("INVALID_INPUT");
            sc.close();
            return;
        }

        // Reduce key for efficiency (mod 26 for letters, mod 10 for digits)
        key = key % 26;

        System.out.println("Choose operation: ");
        System.out.println("1. Encrypt");
        System.out.println("2. Decrypt");
        int choice = sc.nextInt();
        sc.close();

        String result = "";

        if (choice == 1) {
            result = processText(plainText, key, true);
            System.out.println("Encrypted Text: " + result);
        } else if (choice == 2) {
            result = processText(plainText, key, false);
            System.out.println("Decrypted Text: " + result);
        } else {
            System.out.println("INVALID_CHOICE");
        }
    }

    // Method to handle both encryption and decryption
    public static String processText(String text, int key, boolean encrypt) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= '0' && ch <= '9') {
                int shift = encrypt ? key % 10 : (10 - (key % 10));
                char newChar = (char)(((ch - '0' + shift) % 10) + '0');
                output.append(newChar);
            }
            else if (ch >= 'A' && ch <= 'Z') {
                int shift = encrypt ? key : (26 - key);
                char newChar = (char)(((ch - 'A' + shift) % 26) + 'A');
                output.append(newChar);
            }
            else if (ch >= 'a' && ch <= 'z') {
                int shift = encrypt ? key : (26 - key);
                char newChar = (char)(((ch - 'a' + shift) % 26) + 'a');
                output.append(newChar);
            }
            else {
                output.append(ch);
            }
        }
        return output.toString();
    }
}
