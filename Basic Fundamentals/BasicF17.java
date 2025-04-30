//WAP to input year from user and check whether it is a leap year or not.
import java.util.Scanner;
public class BasicF17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check if it is a leap year: ");
        int year = sc.nextInt();

        if(year%4==0){
            System.out.println("It is a leap year");
        }else{
            System.out.println("It's not a leap year");
        }
    sc.close();
    }
}
