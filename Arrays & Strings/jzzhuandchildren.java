public class jzzhuandchildren {
    public static void main(String[] args) {
        int n = 5, m = 2;
        int[] candies = {1, 3, 1, 4, 2};
        int lastChild = 0;
        int maxRounds = 0;

        for (int i = 0; i < n; i++) {
            int rounds = (int)(Math.ceil(candies[i]/m));  
            if (rounds >= maxRounds) {  
                maxRounds = rounds;
                lastChild = i + 1;  
            }
        }
        System.out.println(lastChild);
    }
}
