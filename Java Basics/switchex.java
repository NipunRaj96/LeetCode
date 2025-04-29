import java.util.Scanner;
public class switchex {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What day is today :");
        int day = sc.nextInt();

        //instead of if-else here we can use switch statement
        switch(day){
            case 1:
            System.out.println("Today is Monday");
            break;//also using break is necessary
            case 2:
            System.out.println("Today is Tuesday");
            break;
            case 3:
            System.out.println("Today is Wednesday");
            break;
            case 4:
            System.out.println("Today is Thursday");
            break;
            case 5:
            System.out.println("Today is Friday");
            break;
            case 6:
            System.out.println("Today is Saturday");
            break;
            case 7:
            System.out.println("Today is Sunday");
            break;
            default:
            System.out.println("Please put a value inbetween 1 to 7");

            sc.close();
        }
    }
}
