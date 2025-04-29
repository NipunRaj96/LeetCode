import java.util.Scanner;
public class forloop {
//     public static void main(String[] args) {
//         for(int i=0;i<=100;i++){
//         System.out.println("Hi,Its Me");
//         }
//     }
// }

//table using forloop
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number :");
        int n = sc.nextInt();
        for(int i=1 ; i<=10 ; i++){
            System.out.println(i*n);

            sc.close();
        }
    }
}    