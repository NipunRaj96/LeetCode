// WAP to take input income from the user and calculate the amount of tax to be paid as per rules.
// 1. Less or equal to 10,000 -> no tax
// 2. Greater than 10,000 and less or equal to 25,000 -> 10% of income above 10,000
// 3. Greater than 25,000 and less or equal to 50,000 -> 2500 + 20% income above 25,000
// 4. Greater than 50,000 -> 5000 + 30% of income above 50,000

import java.util.Scanner;

public class BasicF19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income: ");
        int income = sc.nextInt();
        int tax = 0; // Initialize tax

        if (income > 10000 && income <= 25000) {
            tax = (income - 10000) * 10 / 100;  // Fix: Only apply tax to income above 10,000
        } else if (income > 25000 && income <= 50000) {
            tax = 2500 + (income - 25000) * 20 / 100;  // Fix: Only apply 20% tax on income above 25,000
        } else if (income > 50000) {
            tax = 5000 + (income - 50000) * 30 / 100;  // Fix: Only apply 30% tax on income above 50,000
        } else {
            System.out.println("No tax");
        }

        if (income > 10000) {
            System.out.println("Tax to be paid: " + tax);
        }

        sc.close();
    }
}
