//WAP to take input a number from user and print in the form of series:
// 0, 1, 1, 2, 3, 5, 8, ... nth term

//this pattern is fibonacci , in fibonacci the first two terms are constant and the rest
// are the sum of previous two 

import java.util.Scanner;
public class BasicF40 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of terms to print: ");
    int num = sc.nextInt();

    int a=0,b=1,c;
    System.out.print("Fibonaaci series would be: "+a+" , "+b);
    for (int i = 2; i < num; i++) {
        c = a+b;
        System.out.print(" , "+c);
        a = b;
        b = c;
    }
    sc.close();
 }   
}
