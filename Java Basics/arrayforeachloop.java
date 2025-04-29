// public class arrayforeachloop {
//     public static void main(String[] args) {
//        String names[]={"nipun","ashish","tanish","lokesh","kanishk"};
//        for (int i = 0; i <= 4 ; i++) {
//        System.out.println("Name is: "+names[i]); 
//        }
//     }
// } //normal for loop 


public class arrayforeachloop {
   public static void main(String[] args) {
    int numbers[]={12,24,35,43,11,10,2};
    int min = Integer.MAX_VALUE;
    for (int number : numbers) { // for number in numbers mean number term is allocated to each element in array numbers
        if (min>number){ //here we comparing each element one by one to the min that is MAX_VALUE
            min = number;//if element less than min then it would take mins place
        }
    }  
        System.out.println("Min no.is : "+min);    
   }   
}

