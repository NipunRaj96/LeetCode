//WAP to check whether a character given by user is a vowel or consonant.
import java.util.Scanner;
public class BasicF24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' ||
        ch=='O' || ch=='U'){
            System.out.println("The character is a vowel");
        }else{
            System.out.println("The character is a consonant");
        }
        sc.close();
    }
}
