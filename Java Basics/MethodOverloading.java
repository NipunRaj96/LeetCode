public class MethodOverloading {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.greetings();
        obj.greetings("Nipun");
    }
}

class Greet{
    void greetings(){
        System.out.println("Hello,Good Morning");
    }                                                           // this is method overloading, same method name but in one it take name as input
    void greetings(String name){
        System.out.println("Hello "+name+", Good Morning");
    }
}
