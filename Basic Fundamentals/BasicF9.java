//WAP to check whether a number is even or odd.
import java.util.Scanner;
public class BasicF9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if(number%2==0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is odd");
        }
        sc.close();
    }
}
