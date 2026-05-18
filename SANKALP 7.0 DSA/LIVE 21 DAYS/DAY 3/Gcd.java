public class Gcd {
   public static int gcd(int n1, int n2) {
        while(n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
   }
   public static void main(String[] args) {
    System.out.println(gcd(48, 18));
    System.out.println(gcd(50, 90));
   } 
}

