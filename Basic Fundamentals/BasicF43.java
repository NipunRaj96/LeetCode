//WAP to calculate the average of even and odd numbers given by user until user press -1.
import java.util.Scanner;
public class BasicF43 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int evenSum = 0, evenCount = 0;
    int oddSum = 0, oddCount = 0;

    while (true) {
        System.out.print("Enter a number (-1 to stop): ");
        int num = sc.nextInt();

        if (num == -1) { 
            break;
        }

        if (num % 2 == 0) { 
            evenSum += num;
            evenCount++;
        } else { 
            oddSum += num;
            oddCount++;
        }
    }

  
    double evenAvg = (evenCount == 0) ? 0 : (double) evenSum / evenCount;
    double oddAvg = (oddCount == 0) ? 0 : (double) oddSum / oddCount;

  
    System.out.println("\nResults:");
    if (evenCount > 0) {
        System.out.println("Average of even numbers: " + evenAvg);
    } else {
        System.out.println("No even numbers were entered.");
    }

    if (oddCount > 0) {
        System.out.println("Average of odd numbers: " + oddAvg);
    } else {
        System.out.println("No odd numbers were entered.");
    }

    sc.close(); 
  }
}

