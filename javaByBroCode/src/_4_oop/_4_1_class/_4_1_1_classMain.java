package _4_oop._4_1_class;

public class _4_1_1_classMain {
    public static void main(String[] args) {
        /*
            Object = An entity that holds data(Attributes) and can
                    perform actions (methods)
                    It is a reference data type
         */

        Helper.greet();

        //Creating a car object.
        _4_1_2_carClass car = new _4_1_2_carClass();
        // here now we can access _4_2_carClass using car keyword

        System.out.println("Address of car: " + car + "\n");
        // it will print address because it is reference data type

        // access the attributes of the car class:
        System.out.println("Type: " + car.make);
        System.out.println("Model: " + car.model);
        System.out.println("year: " + car.year);
        System.out.println("Car price: " + car.price);
        System.out.println();

        // calling method , we can pass parameter
        car.driving("Spark");
        // even we can receive any value form that method
        System.out.println("Car price with vat: " + car.priceWithVat(2305) + "\n");

        // we can also change the value of any parameter:
        car.changeYear(3030);
        System.out.println("New year is: " + car.year);
    }
}

class Helper { // it is better to declare class name capitalized
    // private, public, protected can't be declare with the class name
    static void greet() {
        System.out.println("Hello World");
    }
}