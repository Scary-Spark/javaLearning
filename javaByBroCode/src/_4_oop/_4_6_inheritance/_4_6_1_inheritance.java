package _4_oop._4_6_inheritance;

public class _4_6_1_inheritance {
    public static void main(String[] args) {

        /*
            Inheritance = Parent-Child relationship (in short)
         */

        _4_6_3_inheritanceDog dog = new _4_6_3_inheritanceDog();
        _4_6_4_inheritanceCat cat = new _4_6_4_inheritanceCat();

        System.out.println("Cat is alive: " + cat.isAlive); // is alive is declared inside organism

        System.out.print("Dog is: ");
        dog.speak();
    }
}
