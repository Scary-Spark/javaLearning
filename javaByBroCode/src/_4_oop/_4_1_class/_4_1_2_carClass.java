package _4_oop._4_1_class;

public class _4_1_2_carClass {

    // this are called the attributes (things a object has)
    String make = "Ford";
    String model = "Mustang";
    double price = 4890.343;
    int year = 2025;
    boolean isRunning = false;

    void driving(String name) {  // here functions not necessary need to be static
        System.out.println(name + " is driving the car");
    }

    double priceWithVat(double vat) {
        return price += vat;
    }

    void changeYear(int newYear) {
        year = newYear;
        System.out.println("New year set to: " + newYear);
    }
}
