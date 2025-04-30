//WAP to convert a character into its toggle case.
import java.util.Scanner;
public class BasicF25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(1);

        // Check if the character is uppercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);  // Convert to lowercase
        } 
        // Check if the character is lowercase
        else if (ch >= 'a' && ch <= 'z') {
            ch = (char) (ch - 32);  // Convert to uppercase
        } 
        // If it's not an alphabet, print an error message
        else {
            System.out.println("Invalid input! Please enter an alphabet.");
        }
        System.out.println("Toggle case: " + ch);
        sc.close();
    
    }
}
