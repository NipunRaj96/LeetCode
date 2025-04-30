//WAP to take input 2 numbers from the user and print their difference.
import java.util.Scanner;
public class BasicF12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number x: ");
        int x = sc.nextInt();
        System.out.println("Enter a number y: ");
        int y = sc.nextInt();

        int z;
        z=x-y;
        System.out.println("Difference is: "+z);
        sc.close();
    }
}
