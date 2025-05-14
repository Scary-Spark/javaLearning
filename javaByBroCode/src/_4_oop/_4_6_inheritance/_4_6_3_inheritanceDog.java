package _4_oop._4_6_inheritance;

public class _4_6_3_inheritanceDog extends _4_6_2_inheritanceAnimal {
    // we can directly access all the variable and methods of the animal class.
    // so we don't need to declare them again

    int lives = 1;

    void speak() {
        System.out.println("Woof! Woof!");
    }
}
