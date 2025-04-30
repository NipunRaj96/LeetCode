//WAP to input a lower limit and an upper limit from user and print all the numbers in between the given limits.
import java.util.Scanner;
public class BasicF26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a lower limit (x): ");
        int x = sc.nextInt();
        System.out.println("Enter an upper limit (y): ");
        int y = sc.nextInt();

        for(int i=x+1;i<y;i++){
            System.out.println("Numbers in between are: "+i);
        }
        sc.close();
    }
}
