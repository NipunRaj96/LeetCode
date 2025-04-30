//WAP to take input a number from user and print in the form of series:
// 1, 11, 111, 1111, ... nth term
 import java.util.Scanner;
        public class BasicF37 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter number of terms: ");
                int num = sc.nextInt();
        
                int pattern = 0;
                for (int i = 1; i <= num; i++) {
                    pattern = pattern * 10 + 1; // Building the pattern
                    System.out.print(pattern);  
                    if (i < num) { 
                        System.out.print(", "); // Print comma only if it's not the last term
                    }
                }
                sc.close();
            }
        } 
