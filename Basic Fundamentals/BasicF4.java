//WAP to take input rupees from the user and convert it into paise.

import java.util.Scanner;
public class BasicF4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much rupees do u have: ");
        int r = sc.nextInt();

        int p;
        p = r * 100;
        System.out.println(r + " rupees converted into paise would be: " + p);
        sc.close();
    }
}