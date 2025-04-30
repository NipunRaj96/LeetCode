//WAP to print the reverse of a number given by user.
import java.util.Scanner;
public class BasicF33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        int reverse = 0;
        
        while (num != 0) {
            int digit = num % 10; // Extract last digit
            reverse = reverse * 10 + digit; // Build reverse number
            num /= 10; // Remove last digit
        }
        
        System.out.println("Reversed number: " + reverse);
        sc.close();
    }
}
