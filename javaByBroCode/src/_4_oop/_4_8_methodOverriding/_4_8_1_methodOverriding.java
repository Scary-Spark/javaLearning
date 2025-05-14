package _4_oop._4_8_methodOverriding;

public class _4_8_1_methodOverriding {
    public static void main(String[] args) {
        /*
            Method overriding = when a subclass provides its own
                                implementation of a method that is already defined.

                                allows for reusability and give specific implementation
         */

        _4_8_3_moDog dog = new _4_8_3_moDog();
        _4_8_4_moCat cat = new _4_8_4_moCat();
        _4_8_5_moFish fish = new _4_8_5_moFish();

        dog.move();
        cat.move();
        fish.move();
    }
}
