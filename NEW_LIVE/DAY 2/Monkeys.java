import java.util.Scanner;
public class Monkeys{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // total monkeys
        int k = sc.nextInt(); //bananas per monkey
        int j = sc.nextInt(); //peanuts per monkey
        int m = sc.nextInt(); //total bananas
        int p = sc.nextInt(); // total peanuts

        //Monkeys that eat full bananas
        int bananaMonkeys = m / k;
        int remainingBananas = m % k;
        
        //Monkeys that eat full peanuts
        int peanutMonkeys = p / j;
        int remainingPeanuts = p % j;

        int totalEatingMonkeys = bananaMonkeys + peanutMonkeys;
    
        //if some bananas or peanuts remain (less than k or j), one more monkey will eat those leftovers

        if(remainingBananas > 0 || remainingPeanuts > 0) {
            totalEatingMonkeys++;
        }

        //Monkeys remaining on the tree
        int remaining = n - totalEatingMonkeys;
        if(remaining < 0) {
            remaining = 0;
        }

        System.out.println(remaining);


        sc.close();
    }
}