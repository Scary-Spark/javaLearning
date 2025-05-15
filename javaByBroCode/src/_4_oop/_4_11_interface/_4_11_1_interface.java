package _4_oop._4_11_interface;

public class _4_11_1_interface {
    public static void main(String[] args) {
        /*
        interface = A blueprint for a class that specifies a set of abstract methods
                    that implementing classes must define.
                    Supports multiple inheritance-like behaviour
                        meaning now class can have multiple parents
     */

        _4_11_4_interfaceRabbit rabbit = new _4_11_4_interfaceRabbit();
        rabbit.flee();

        _4_11_6_interfaceHawk hawk = new _4_11_6_interfaceHawk();
        hawk.hunt();

        _4_11_5_interfaceFish fish = new _4_11_5_interfaceFish();
        fish.flee();
        fish.hunt();
    }

}
