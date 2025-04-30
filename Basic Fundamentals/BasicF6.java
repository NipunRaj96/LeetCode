//WAP to take input 3 digit numbers from the user and print sum of 1 and 3 digit.
import java.util.Scanner;
public class BasicF6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3 digit number: ");
        int number = sc.nextInt();
        int a;
        int b;
        int c;

        if(number>=100 && number<=999){
           a = number/100;
           b = number%10;
           c = a+b;
           System.out.println("Sum of 1 and 3 digit will be: "+c);
        }else{
            System.out.println("Error! Enter a 3 digit number");
        }
        sc.close();
    }
}
