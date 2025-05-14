package _4_oop._4_9_toString;

public class _4_9_1_toString {
    public static void main(String[] args) {

        /*
            toString = method inherited from th object class
                       used for return a string representation of an object
                       by default, it returns a hash code as a unique identifier
                       it can be overridden to provide meaningful details
         */

        _4_9_2_toStringCar car = new _4_9_2_toStringCar(
                "Ford",
                "Mustang",
                2025,
                "Red"
        );

        System.out.println(car);
        // in before it print the hex address.
        // but as we add toString method and override that method, it will now work as our demand
    }
}
