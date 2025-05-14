package _4_oop._4_9_toString;

public class _4_9_2_toStringCar {

    String make;
    String model;
    int year;
    String color;

    _4_9_2_toStringCar(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {  // this method have to be public
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}
