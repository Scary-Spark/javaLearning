package _4_oop._4_8_methodOverriding;

public class _4_8_5_moFish extends _4_8_2_moAnimal {

    @Override
        // to say the other dev that this method is overwritten
    void move() { // we declare move inside the parent class also
        System.out.println("This animal is swimming");
    }
}
