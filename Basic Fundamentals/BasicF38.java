//WAP to take input a number from user and print in the form of series:
// 1, 12, 123, 1234, ... nth term
import java.util.Scanner;
public class BasicF38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int num = sc.nextInt();

        int pattern = 0;
        System.out.println("Pattern:- ");
        for (int i = 1; i <= num; i++) {
            pattern = pattern * 10 + i;
            if (i==num) {
                System.out.println(pattern);
            }else{
                System.out.print(pattern+" , ");
            }
        }
        sc.close();
    }
}
