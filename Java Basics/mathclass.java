// public class mathclass {
//     static int minimum(int a , int b){ // when using return remember to change void
//         if (a<b){
//             System.out.println("Min number is : "+a);
//             return a;
//         } else{
//             System.out.println("Min number is b: "+b);
//             return b;
//         }
//     }
//     public static void main(String[] args) {
//     minimum(10, 21);
//     }
// }

//built in maths function

import java.util.Scanner;
public class mathclass {
    static void math() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        System.out.println("The minimum of a and b is: " + Math.min(a, b)); // math func has a variety of inbuilt func to find max min etc
        sc.close();
    }

    public static void main(String[] args) {
        math(); // Calling the static math method
    }
}
