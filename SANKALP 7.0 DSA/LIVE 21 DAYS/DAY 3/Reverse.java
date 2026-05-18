public class Reverse {
   public static int rev(int n) {
      boolean isNegative = n < 0;

      String s = Integer.toString(Math.abs(n));

      String reversed = new StringBuilder(s).reverse().toString();

      int result = Integer.parseInt(reversed);

      return isNegative ? -result : result;
   }
   public static void main(String[] args) {
    System.out.println(rev(25));
    System.out.println(rev(-64));
   } 
}
