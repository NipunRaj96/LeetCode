//WAP to input a character from user and check whether it is an alphabets,
// digits, or special symbols.
import java.util.Scanner;
public class BasicF22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println("It is an alphabet.");
        }else if(ch >= '0' && ch <= '9'){
            System.out.println("It is a digit.");
        }else{
            System.out.println("It is a special symbol.");
        }
        sc.close();
    }
}
