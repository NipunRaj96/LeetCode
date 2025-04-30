//WAP to input a character from user and check whether it is uppercase and lowercase.
import java.util.Scanner;
public class BasicF23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("It is a lowercase alphabet.");
        }else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("It is an uppercase alphabet.");
        }else{
            System.out.println("Error!! Please enter an alphabet.");
        }
        sc.close();
    }
}
