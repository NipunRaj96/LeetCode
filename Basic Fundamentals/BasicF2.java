//WAP to take input 1 number from the user and print its square and cube.
import java.util.Scanner;
public class BasicF2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();

        int b;
        int c;
        b = a*a;
        c = a*a*a;
        
        System.out.println("Square of the number will be: " + b);
        System.out.println("Cube of the number will be: " + c);
        sc.close();
    }
}
