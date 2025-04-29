import java.util.Scanner;

public class methods1 {  //creation of method

    static void average(int a , int b){
    int avg = a+b/2;
    System.out.println("Avg would be: "+avg);
    //return avg; //this will allow us to use avg outside the average func but we have to remove void and place the variable instead, in avg case int had to be written
    }

    static void greet(){ //what we did here was making a greet function and using it later in main 
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter you name: ");
      String name = sc.nextLine();
      System.out.println("Hello "+name);
      sc.close();
    } //for more reference check methods note
     
    public static void main(String[] args) {  //calling of method
        greet();
        average(4, 06); 
    
    }
}

