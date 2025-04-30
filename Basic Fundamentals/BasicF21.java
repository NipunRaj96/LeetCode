//WAP to calculate the area of rectangle, circle and triangle as per user's choice.
import java.lang.Math;
import java.util.Scanner;
public class BasicF21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose desired shape to find the area:-");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        int shape = sc.nextInt();
        int area_rect,area_triangle;
        double area_circle;

        switch (shape) {

            case 1:
                 System.out.println("Enter length: ");
                 int l = sc.nextInt();
                 System.out.println("Enter breadth: ");
                 int b = sc.nextInt();
                 area_rect = l*b;
                 System.out.println("Area of rectangle: "+area_rect);
                 break;

            case 2:
                 System.out.println("Enter radius: ");
                 int r = sc.nextInt();
                 area_circle = Math.round(Math.PI*r*r);
                 System.out.println("Area of circle: "+area_circle);
                 break;

            case 3:
                 System.out.println("Enter Length of side: ");
                 int s = sc.nextInt();
                 area_triangle = s*s;
                 System.out.println("Area of triangle: "+area_triangle);    
                 break;

            default:
                 System.out.println("Error! Please choose again!!");
                 break;
        }
        sc.close();
    }
}
