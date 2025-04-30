//WAP to take input a number from user and print in the form of series:
//  1, 3, 6, 10, 15, ... nth term
import java.util.Scanner;
public class BasicF36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int num = sc.nextInt();

        int pattern = 0;
        System.out.println("Pattern is: ");
        for (int i = 1; i <= num; i++) {
            pattern += i;
            if(i==num){
                System.out.println(pattern);
            }else{
                System.out.print(pattern+" , ");
            }
        }
        sc.close();
    }
}
