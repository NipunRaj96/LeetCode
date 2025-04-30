//WAP to take input 2 numbers from the user and print the sum of the numbers.
import java.util.Scanner;
public class BasicF1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a :");
        int a = sc.nextInt();
        
        System.out.println("enter number b :");
        int b = sc.nextInt();

        int c;
        c = a + b;
        System.out.println("Sum of a and b is: " + c);

        sc.close();
    }
}