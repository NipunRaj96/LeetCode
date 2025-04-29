public class classobj {
    public static void main(String[] args) {
        Dog d1 = new Dog(); //new dog object created
        d1.age = 3;
        d1.breed = "german shepherd";
        d1.name = "Tommy";
        d1.walk();

        Dog d2 = new Dog();
        d2.age = 4;
        d2.breed = "Labrador";
        d2.name = "Goldy";
        d2.bark();

        Complex num1 = new Complex();
        num1.a = 6;
        num1.b = 10;
        num1.print();

    }
}

class Dog{ //class creation of dog , public is only used in the first class line which must be same as the file name

        String name;
        int age;
        String breed;

        void bark(){
            System.out.println(name+" is barking");
        }

        void walk(){
            System.out.println(name+" is walking");
        }
    }

class Complex{
    int a,b;
    void print(){
        System.out.println("Your complex number would be: "+a+" + "+b+"i");
    }
}
