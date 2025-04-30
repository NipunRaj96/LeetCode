//WAP to take input a number (range 1 to 7) from the user and print the corresponding week. 1. using if else 2. using switch 
import java.util.Scanner;
public class BasicF16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (1-7) to get the corresponding day of the week: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
            System.out.println("Today is Monday");
            break;
            case 2:
            System.out.println("Today is Tuesday");    
            break;
            case 3:
            System.out.println("Today is Wednesday");
            break;
            case 4:
            System.out.println("Today is Thursday");
            break;
            case 5:
            System.out.println("Today is Friday");
            break;
            case 6:
            System.out.println("Today is Saturday");
            break;
            case 7:
            System.out.println("Today is Sunday");
            break;
            default:
            System.out.println("Error! Please put a value in between 1 and 7");
            break;
        }
        sc.close();
    }
}
