//1662. Check If Two String Arrays are Equivalent
//Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

public class leetcode1662 {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        String Word1 ="";
        String Word2 ="";
        
        for ( int i = 0; i < word1.length; i++) {
            Word1 = Word1+word1[i];
    }
        for ( int i = 0; i < word1.length; i++) {
            Word2 = Word2+word2[i];
    }
    System.out.println(Word1+"//"+Word2);
    if(Word1.equals(Word2)){
        System.out.println("True");
    }else{
        System.out.println("False");
    }
  }
}
