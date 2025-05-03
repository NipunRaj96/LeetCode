public class pow {
    public static void main(String[] args) {
        double x = 2.0000;
        long n = -2;
        long i =0;
        double pow = 1;
        //System.out.println((double)(Math.pow(x, n)));
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        while(i!=n){
        pow = pow * x;
        i++;
        }

        System.out.println(pow);
    }
}