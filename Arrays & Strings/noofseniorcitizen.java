public class noofseniorcitizen {
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int count = 0;

        for (String detail : details) {
            int age = Integer.parseInt(detail.substring(11, 13)); // Extract age
            if (age >= 60) {
                count++;
            }
        }
        
        System.out.println(count); 
    }
}
