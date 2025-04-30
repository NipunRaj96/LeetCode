//WAP to input a number from user and print its factorial.
import java.util.Scanner;
public class BasicF29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int fact = 1; 
        for (int i = 1; i <= n; i++) {
            fact *= i; // fact = fact * i
        }

        System.out.println("Factorial of " + n + " is: " + fact);
        sc.close();
    }
}