//WAP to take input 4 digit numbers from the user and print its all digits.
import java.util.Scanner;
public class BasicF8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4 digit number: ");
        int number = sc.nextInt();
        int a;
        int b;
        int c;
        int d;


        if(number>=1000 && number<=9999){
           a = number/1000;
           b = (number/100)%10;
           c = (number/10)%10;
           d = number%10;
           System.out.println("1 digit: "+a);
           System.out.println("2 digit: "+b);
           System.out.println("3 digit: "+c);
           System.out.println("4 digit: "+d);
        }else{
            System.out.println(("Error! Enter a 4 digit number"));
        }
        sc.close();
    }
}
