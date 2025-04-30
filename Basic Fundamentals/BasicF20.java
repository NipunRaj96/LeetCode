//WAP to perform arithmetic operations as per user's choice
import java.util.Scanner;
public class BasicF20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        //operator part

        System.out.println("1. Addition");
        System.out.println("2. Divison");
        System.out.println("3. Multiplication");
        System.out.println("4. Subtraction");
        System.out.println("Choose one operator(1-4) to use:-");
        int operator = sc.nextInt();

        int a,b,c,d;
        a = num1 + num2;
        b = num1/num2;
        c = num1*num2;
        d = num1-num2;

        switch (operator) {
            case 1:
            System.out.println("Answer will be: "+a);
            break;
            case 2:
            System.out.println("Answer will be: "+b);
            break;
            case 3:
            System.out.println("Answer will be: "+c);
            break;
            case 4:
            System.out.println("Answer will be: "+d);
            break;
            default:
            System.out.println("Error! Choose between 1-4");
        }
        sc.close();
    }
}
