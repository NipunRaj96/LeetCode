////WAP to take input a number from user and print in the form of series:
// 0, 7, 26, 63, ... nth term
import java.util.Scanner;
public class BasicF39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms in pattern: ");
        int num = sc.nextInt();

        int pattern = 0;
        System.out.println("The pattern will be: ");
        for (int i = 1; i <= num; i++) {
            pattern = i*i*i - 1;
            if(i==num){
                System.out.println(pattern);

            }else{
                System.out.print(pattern+" , ");
            }
        }
        sc.close();
    }
}
