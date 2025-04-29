public class nestedif {
    public static void main(String[] args) {
        int a = 15;
        int b = 5;
        int c = 9;
        if (a>b) {
            System.out.println("a is the larger than b");
            if (a>c) {
                System.out.println("a is the largest no.");
            } else {
                System.out.println("c is the largest");
            }
        } else {
        System.out.println("b is the larger than a");
            if (b>c) {
            System.out.println("b is the largest");
            } else{
            System.out.println("c is the largest");
            }
        } 
            
    }
}
