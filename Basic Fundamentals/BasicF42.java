// WAP to take input a number from user and print in the form of series:
// x - x ^ 2 + x ^ 3 - x ^ 4 + x ^ 5 ... nth term (do sum here also)
import java.util.Scanner;

public class BasicF42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the base number (x): ");
        int x = sc.nextInt();
        
        System.out.print("Enter the number of terms: ");
        int num = sc.nextInt();

        int sum = 0;
        
        System.out.print("Series: ");
        for (int i = 1; i <= num; i++) {
            int term = (int) Math.pow(x, i); // x^i

            if (i % 2 == 0) { // Even term => Subtract
                term = -term;
            }
            
            sum += term; // Add the term to sum

            System.out.print(term);
            if (i < num) { // Avoid trailing comma
                System.out.print(" , ");
            }
        }

        System.out.println("\nSum of series: " + sum);

        sc.close();
    }
}
