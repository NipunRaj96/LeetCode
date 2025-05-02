
public class kidwithmaxcandies {
    public static void main(String[] args) {
        int candies[] = {2,3,5,1,3};
        int extraCandies = 3;
        int max_candie=0;

        for (int candie : candies) {
            if(candie>max_candie){
            max_candie = candie;
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max_candie){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
    }
   
}
