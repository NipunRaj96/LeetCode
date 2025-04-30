//WAP to take input a number from the user and check whether it is palindrome.
import java.util.Scanner;
public class BasicF34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is palindrome or not: ");
        int num = sc.nextInt();

        int original_num=num;
        int reverse = 0;

        while(num!=0){
            int digit = num % 10; 
            reverse = reverse * 10 + digit; 
            num /= 10;

        }
        System.out.println("Reverse number is: "+reverse);
        sc.close();
        if (reverse==original_num) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
