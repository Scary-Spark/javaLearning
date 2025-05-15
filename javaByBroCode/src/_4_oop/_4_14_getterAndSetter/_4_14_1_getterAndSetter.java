package _4_oop._4_14_getterAndSetter;

public class _4_14_1_getterAndSetter {
    public static void main(String[] args) {

        /*
            They help protect object data and add rules for accessing or modifying them.

            getter = methods that make a field readable
            setters = methods that make a field writeable
         */

        _4_14_2_gasCar car = new _4_14_2_gasCar(
                "Ford Mustang",
                "Red",
                10000
        );

        // we can't access the private variable:
        // car.model, car.color, car.price
        // this is why we will use getter

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

        car.setColor("Blue");
        car.setPrice(20000);
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
