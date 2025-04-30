//WAP to take input days from the user and convert it into years, months, and remaining days.
import java.util.Scanner;
public class BasicF5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of days: ");
        int days = sc.nextInt();

        int years;
        int remaining_days_after_years;
        int months;
        int remaining_days;

        years = days/365;
        remaining_days_after_years = days%365;
        months = remaining_days_after_years/30;
        remaining_days = remaining_days_after_years%30;
        System.out.println("No. of years: "+years+ " Months: "+months+ " Days: "+remaining_days);
        sc.close();
    }
}
