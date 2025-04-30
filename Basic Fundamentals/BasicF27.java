//WAP to input a lower limit and an upper limit from user and print all the even numbers in between the given limits.
import java.util.Scanner;
public class BasicF27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a lower limit x: ");
        int x = sc.nextInt();
        System.out.println("Enter an upper limit y: ");
        int y = sc.nextInt();

        System.out.print("Even numbers between " + x + " and " + y + " are: ");

        for (int i = x + 1; i < y; i++) {  // Exclude x and y
            if (i % 2 == 0) { 
                System.out.print(i + " ");
            }
        }
        
        sc.close();
    }
}
