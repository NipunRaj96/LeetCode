//WAP to take input 3 numbers from the user and print the largest number among them. 1. using nested if 2. using AND operator
import java.util.Scanner;
public class BasicF13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number x: ");
        int x = sc.nextInt();
        System.out.println("Enter a number y: ");
        int y = sc.nextInt();
        System.out.println("Enter a number z: ");
        int z = sc.nextInt();

        if(x>y){
            System.out.println("x is larger than y");
            if(x>z){
                System.out.println("x is the largest number");
            }else{
                System.out.println("z is the largest number");
            }
        }else{
            System.out.println("y is larger than x");
            if(y>z){
                System.out.println("y is the largest");
            }else{
                System.out.println("z is the largest");
            }
        }   
        sc.close();
    }
}
