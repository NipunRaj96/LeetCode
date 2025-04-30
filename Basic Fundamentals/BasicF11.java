//WAP to take input two numbers from the user and print the largest of them.
import java.util.Scanner;
public class BasicF11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number x: ");
        int x = sc.nextInt();
        System.out.println("Enter a number y: ");
        int y = sc.nextInt();

        if(x>y){
            System.out.println("The largest number is: "+x);
        }else{
            System.out.println("The largest number is: "+y);
        }
        sc.close();
    }
}
