//WAP to take input 3 numbers and print the 2nd largest number among them.
import java.util.Scanner;
public class BasicF15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number x: ");
        int x = sc.nextInt();
        System.out.println("Enter a number y: ");
        int y = sc.nextInt();
        System.out.println("Enter a number z: ");
        int z = sc.nextInt();

        int largest;
        int second_largest;
        if(x>y && x>z){
            largest = x;
            second_largest = Math.max(y,z);
        }else if(y>x && y>z){
            largest = y;
            second_largest = Math.max(z,x);
        }else{
            largest = z;
            second_largest = Math.max(x,y);
        }
        System.out.println("Largest number would be: "+largest);
        System.out.println("Second largest number will be: "+second_largest);
        sc.close();
    }
}
