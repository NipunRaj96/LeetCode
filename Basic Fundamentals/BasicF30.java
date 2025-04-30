//WAP to input a number from user and print its table.
import java.util.Scanner;
public class BasicF30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its table: ");
        int num = sc.nextInt();
        
        int table;
        System.out.println("Table for "+num+" is: ");
        for (int i = 1; i <= 10 ; i++) {
            table = num*i;
            System.out.println(num+" x "+i+" = "+table);
        }
        sc.close();
    }
}
