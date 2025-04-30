//WAP to take input 3 numbers from the user and print the numbers in the descending order.
import java.util.Scanner;
public class BasicF18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number x: ");
        int x = sc.nextInt();
        System.out.println("Enter a number y: ");
        int y = sc.nextInt();
        System.out.println("Enter a number z: ");
        int z = sc.nextInt();
        int largest,second_largest,third_largest;
        if(x>y && x>z){
            largest=x;
            second_largest= Math.max(y,z);
            third_largest= Math.min(y,z);
        }else if(y>x && y>z){
            largest=y;
            second_largest= Math.max(x,z);
            third_largest= Math.min(x,z);
        }else{
            largest = z;
            second_largest=Math.max(x,y);
            third_largest=Math.min(x,y);
        }
        System.out.println("Descending order: "+largest+" , "+second_largest+" , "+third_largest);
        sc.close();
    }
}
