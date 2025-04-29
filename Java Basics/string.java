public class string {
    public static void main(String[] args) {

        String name = "   NipUn    ";
        System.out.println("Name is: "+name.toUpperCase());//this is java built in function for string
        System.out.println("Name is: "+name.toLowerCase());
        System.out.println("Name is: "+name.trim().toLowerCase());//trim removes the unnecessary spaces
        System.out.println("Name is: "+name.length()); //its also including the spaces
        System.out.println("Name is: "+name.startsWith("   N"));

        int age = 120;
        String stringAge = String.valueOf(age);//coversion of int value to string value
        System.out.println(age+2);
        System.out.println(stringAge+2);//u cant use operators in a string value as shown in the output

        String sentence = "I love Java , Java is a great language";
        System.out.println(sentence.replace("Java", "Python"));
        
        String words[] = sentence.split(",");
        for (String word : words) {
        System.out.println(word);
        }
    }
}
