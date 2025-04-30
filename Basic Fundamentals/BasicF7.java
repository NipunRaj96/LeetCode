//WAP to take input 3 digit numbers from the user and print the square of the middle digit.
import java.util.Scanner;
public class BasicF7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3 digit number: ");
        int number = sc.nextInt();
        int a;
        int b;
        int c;

        if(number>=100 && number<=999){
            a = number/10;
            b = a%10;
            c = b*b;
            System.out.println("Square of middle digit will be: "+c);
        }else{
            System.out.println("Error! Enter a 3 digit number");
        }
        sc.close();
    }
}
