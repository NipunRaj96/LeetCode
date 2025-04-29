import java.util.Scanner;
public class ifelseifelse {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("What day is today :");
      int day = sc.nextInt();
      if (day == 1) {
        System.out.println("Go to office");
      } else if(day == 2) {
        System.out.println("Go home");
      } else if(day == 3){
        System.out.println("Go to the park");
      } else {
        System.out.println("Go dance");
      }
      sc.close();
    }
}