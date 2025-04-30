//WAP to take input rate & quantity and calculate the amount. Finally print net amount to be paid after allowing 15% discount if amount exceeds 2000 rs.
import java.util.Scanner;
public class BasicF14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();
        System.out.println("Enter rate: ");
        int rate = sc.nextInt();
        
        int net_amount = quantity*rate;

        if(net_amount>=2000){
        int discount;
        discount = net_amount/100*15;
        int final_amount;
        final_amount = net_amount - discount;
        System.out.println("Net amount will be: "+final_amount);
        }else{
            System.out.println("Net amount will be: "+net_amount);
        }
        
        sc.close();
    }
    
}
