//WAP to take input a number from the user and check whether it is armstrong.
import java.util.Scanner;
public class BasicF35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether its armstrong or not: ");
        int num = sc.nextInt();

        //example - 153 - 1^3 + 5^3 + 3^3
        //          9474 - 9^4 + 4^4 + 7^4 + 4^4
        int originalNum = num;
        int sum = 0;
        int digits = Integer.toString(num).length(); // Count number of digits

        while (num != 0) {
            int digit = num % 10; // Extract last digit
            sum += Math.pow(digit, digits); // Add digit^digits to sum
            num /= 10; // Remove last digit
        }

        sc.close();

        // Check if sum matches the original number
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}

