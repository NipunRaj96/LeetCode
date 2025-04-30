// WAP to take input a number from user and print in the form of series:
// 0, 1, 3, 7, 15, ... nth term
import java.util.Scanner;

public class BasicF41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms to print: ");
        int num = sc.nextInt();
        
        int a = 2; // Base value

        System.out.print("Series: ");
        for (int i = 0; i < num; i++) {
            int pattern = (int) Math.pow(a, i) - 1; 
            System.out.print(pattern);
            if (i < num - 1) { // Avoid trailing comma
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
