import java.io.BufferedReader;                 // For fast input
import java.io.InputStreamReader;              // To read from keyboard
import java.io.IOException;                    // To handle input exceptions

public class Isomorphic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Create fast input reader

        String s = br.readLine();              // Read first string
        String t = br.readLine();              // Read second string

        if (s.length() != t.length()) {        // If lengths are different, they cannot be isomorphic
            System.out.println(false);
            return;
        }

        int[] mapST = new int[256];            // Map from s char to t char
        int[] mapTS = new int[256];            // Map from t char to s char

        for (int i = 0; i < 256; i++) {         // Initialize all values to -1
            mapST[i] = -1;
            mapTS[i] = -1;
        }

        boolean ok = true;                     // Assume strings are isomorphic first

        for (int i = 0; i < s.length(); i++) { // Go through each character
            char c1 = s.charAt(i);             // Character from s
            char c2 = t.charAt(i);             // Character from t

            if (mapST[c1] == -1 && mapTS[c2] == -1) { // If both characters are not mapped yet
                mapST[c1] = c2;                // Map c1 -> c2
                mapTS[c2] = c1;                // Map c2 -> c1
            } else {                           // If mapping already exists
                if (mapST[c1] != c2 || mapTS[c2] != c1) { // Check consistency
                    ok = false;                // Not isomorphic
                    break;
                }
            }
        }

        System.out.println(ok);                // Print final answer
    }
}