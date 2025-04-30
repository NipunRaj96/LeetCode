//WAP to calculate and print area of circle and circumference of circle.
import java.lang.Math;
public class BasicF3 {
    public static void main(String[] args) {
        // lets take radius 14
        int r = 14;
        int area;
        int circumference;

        area = (int)Math.round(Math.PI*r*r);
        circumference = (int)Math.round(2*Math.PI*r); //math.round round off the value to the nearest int value
//You have an error because Math.PI is a double, and you’re trying to assign the result to an int variable (area and circumference). 
//This causes a type mismatch.

        System.out.println("Area of circle with radius 14 will be: "+area);
        System.out.println("Circumference of circle with radius 14 will be: "+circumference);
    }
}
