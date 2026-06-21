public class Ascending {
    public boolean areNumbersAscending(String s) {
        
        // 1. GETTING THE NOTEBOOK READY
        int prevNumber = -1;
        
        // 2. CHOPPING UP THE SENTENCE
        String[] tokens = s.split(" ");
        
        // 3. LOOKING AT EACH WORD (THE LOOP)
        for (String token : tokens) {
            
            // 4. "ARE YOU A NUMBER?"
            if (Character.isDigit(token.charAt(0))) {
                
                // 5. TRANSLATING A WORD INTO MATH
                int currentNumber = Integer.parseInt(token);
                
                // 6. CHECKING THE RULE
                if (currentNumber <= prevNumber) {
                    return false; 
                }
                
                // 7. UPDATING THE NOTEBOOK
                prevNumber = currentNumber;
            }
        }
        
        // 8. WE SURVIVED!
        return true;
    }

    // --- THIS IS THE MAIN METHOD TO RUN THE TESTS ---
    public static void main(String[] args) {
        
        // FIX: Create an 'Ascending' object since that is the name of our class now!
        Ascending solution = new Ascending();

        // Test Case 1
        String s1 = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        System.out.println("Sentence 1: " + s1);
        System.out.println("Result 1: " + solution.areNumbersAscending(s1)); 
        System.out.println("-------------------------------------------------");

        // Test Case 2
        String s2 = "hello world 5 x 5";
        System.out.println("Sentence 2: " + s2);
        System.out.println("Result 2: " + solution.areNumbersAscending(s2)); 
        System.out.println("-------------------------------------------------");

        // Test Case 3
        String s3 = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";
        System.out.println("Sentence 3: " + s3);
        System.out.println("Result 3: " + solution.areNumbersAscending(s3)); 
    }
}